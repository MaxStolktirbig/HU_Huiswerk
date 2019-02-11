public class Voorbeeld1 {
    public static void main(String[] args) {
        /*String titel;
        titel = new String("Programmeren in Java!");

        System.out.println(titel);
        System.out.println("");

        String tekst = "Ik leer nu ";
        System.out.println(tekst+titel);*/
        Product p1 = new Product("iPad","1234AB", 629.35 );
        Product p2 = new Product("Paracetamol", "5678CD", 1.71);
        p1.setBTW(19.0);
        p2.setBTW(6.0);
        System.out.println("Eerste product: " +p1);
        System.out.println("Tweede product: "+ p2);
        System.out.println();
        System.out.println("BTW precentage: "+p2.getBTW());
        System.out.println("Betaalde BTW: "+p2.berekenBtwBedrag());
        System.out.println("Prijs: "+p2.getPrijs());
    }
}
