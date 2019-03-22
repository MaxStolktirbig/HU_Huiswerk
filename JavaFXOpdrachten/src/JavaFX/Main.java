package JavaFX;
        import Hotel.*;
        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.scene.layout.FlowPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.StackPane;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.Date;

public class Main extends Application {
    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private Hotel hotel = new Hotel("Avondrust");
    String[] roomlist = {"Testkamer",
            "Testkamer2"};
    public void start(Stage primaryStage) {


        Label text = new Label();
        text.setText("Voer uw gegevens in!");
        text.setPrefWidth(330);

        Label naam = new Label();
        naam.setText("naam:");
        naam.setPrefWidth(100);

        Label adres = new Label();
        adres.setText("adres:");
        adres.setPrefWidth(100);

        Label aankomstdatum = new Label();
        aankomstdatum.setText("aankomstdatum:");
        aankomstdatum.setPrefWidth(100);

        Label vertrekdatum = new Label();
        vertrekdatum.setText("verterkdatum:");
        vertrekdatum.setPrefWidth(100);

        Label kamertype = new Label();
        kamertype.setText("kamertype:");
        kamertype.setPrefWidth(100);

        Label buttonPos = new Label();
        buttonPos.setPrefWidth(200);

        TextField namefield = new TextField();
        namefield.setPrefWidth(220);

        TextField adresfield = new TextField();
        adresfield.setPrefWidth(220);

        DatePicker aankomstpicker = new DatePicker();
        aankomstpicker.setPrefWidth(220);

        DatePicker vertrekpicker = new DatePicker();
        vertrekpicker.setPrefWidth(220);

        ComboBox kamerdropdown = new ComboBox<KamerType>();
        kamerdropdown.setPrefWidth(220);


        Button reset = new Button();
        reset.setText("reset");
        reset.setPrefWidth(50);
        reset.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                namefield.clear();
                adresfield.clear();
                aankomstpicker.setValue(LocalDate.now());
                vertrekpicker.setValue(LocalDate.now().plusDays(1));
                kamerdropdown.getSelectionModel().selectFirst();
                text.setText("Voer uw gegevens in!");


                ;
            }
        });

        Button boek = new Button();
        boek.setText("boek");
        boek.setPrefWidth(50);
        boek.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LocalDate now = LocalDate.now();
                LocalDate aankomst = aankomstpicker.getValue();
                LocalDate vertrek = vertrekpicker.getValue();
                if(aankomst.isBefore(now) ){
                    text.setText("De aankomstdatum kan niet voor vandaag zijn!");
                }
                else if(vertrek.isBefore(aankomst)){
                    text.setText("De vertrekdatum kan niet voor de aankomstdatum zijn!");
                }
                else if(namefield.getText().isEmpty() || adresfield.getText().isEmpty()){
                    text.setText("De naam en het adres mogen niet leeg zijn!");
                }
                else{
                    KamerType kamerType = null;
                    for(KamerType k : hotel.getKamerTypen()){
                        if(k == kamerdropdown.getValue()){
                            kamerType = k;
                        }
                    }
                    int kamernummer = hotel.voegBoekingToe(aankomst, vertrek, namefield.getText(), adresfield.getText(), kamerType);
                    if(kamernummer == -1){
                        text.setText("Er zijn geen vrije kamers beschikbaar!");
                    }
                    else{
                        String boeking = "Boeking succesvol! Kamer "+kamernummer+" is geboekt!";
                        text.setText(boeking);
                    }
                }
            }
        });

        kamerdropdown.getItems().addAll(hotel.getKamerTypen());
        kamerdropdown.getSelectionModel().selectFirst();
        aankomstpicker.setValue(LocalDate.now());
        vertrekpicker.setValue(LocalDate.now().plusDays(1));

        //code to put it in a flowpane, doing it the other way ensures spacing after resizing.

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(10);
        root.getChildren().addAll(text, naam, namefield, adres, adresfield, aankomstdatum, aankomstpicker,
                vertrekdatum, vertrekpicker, kamertype, kamerdropdown, buttonPos, reset, boek);

        Scene scene = new Scene(root, 350, 250);

        /*
        HBox buttons = new HBox(10);
        VBox box0 = new VBox(10);
        HBox name = new HBox();
        HBox adress = new HBox();
        HBox aandate = new HBox();
        HBox vertrdate = new HBox();
        HBox roomtype = new HBox();
        box0.setPadding(new Insets(10));
        name.getChildren().addAll(naam, namefield);
        adress.getChildren().addAll(adres, adresfield);
        aandate.getChildren().addAll(aankomstdatum, aankomstpicker);
        vertrdate.getChildren().addAll(vertrekdatum, vertrekpicker);
        roomtype.getChildren().addAll(kamertype, kamerdropdown);
        buttons.getChildren().addAll(buttonPos, reset, boek);
        box0.getChildren().addAll(text, name, adress, aandate, vertrdate, roomtype, buttons);

        Scene scene = new Scene(box0, 350, 250);
        */

        primaryStage.setTitle("Tweepersoonsboekingen");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}