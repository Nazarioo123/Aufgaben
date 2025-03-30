public class Aufgabe11 {
    public static void main(String[] args){
        double startkapital = 1000.0;
        double zinssantz = 3.0;

        System.out.println("Sparbuch uber 10 Jahre");
        System.out.println("Startkapital:" + startkapital + "$" );
        System.out.println("Zinssatz" + zinssantz + "%");

        double kapital = startkapital;
        double zinsfaktor = (100.0 + zinssantz) / 100.0;

        for (int jahr  = 1; jahr  <=10 ; jahr ++) {
            kapital *=zinsfaktor;
            System.out.printf("Jahr %2d: %10.2f€%n", jahr, kapital);

        }
        }
    }
