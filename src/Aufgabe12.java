import java.util.Scanner;
public class Aufgabe12 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Gib den Anfangbetrag in Euro ein:");

        double betrag = scanner.nextDouble();

        System.out.print("Gib den zinssatz in Prozent ein ");
        double zinssatz = scanner.nextDouble();

        for (int jahr = 1; jahr <= 10; jahr++){
            betrag = betrag * (100 + zinssatz) / 100;
            System.out.printf("Jahr %d: %.2f €\n", jahr, betrag);
        }
    }
}
