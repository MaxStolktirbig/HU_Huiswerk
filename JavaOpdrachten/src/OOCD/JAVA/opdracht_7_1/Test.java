package OOCD.JAVA.opdracht_7_1;

public class Test {
    public static void main(String[] args){
        Gebouw gebouw1 = new Gebouw();
        Gebouw gebouw2 = new Gebouw(50, 60, 4);

        System.out.println(gebouw1);
        System.out.println(gebouw2);
        gebouw2.renoveer(1998);
        System.out.println(gebouw2);
    }
}
