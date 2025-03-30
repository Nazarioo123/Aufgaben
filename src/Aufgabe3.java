import java.util.Scanner;

public class Aufgabe3 {

    public static double addieren(double a, double b) {
        return a + b;
    }

    public static double subtrahtieren(double a, double b) {
        return a - b;
    }

    public static double multipl(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR");
            return Double.NaN;
        }
        return a / b;
    }

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein:");
        while (!scanner.hasNextDouble()){
            System.out.println("Ungultige Eingabe.");
            scanner.next();
        }
        double num1 = scanner.nextDouble();
        System.out.print("Geben Sie die zweite zahl");
        while (!scanner.hasNextDouble()){
            System.out.println("Ungultige Eingabe.");
            scanner.next();
}
double num2 = scanner.nextDouble();
        System.out.println("Wählen Sie eine Operation: 1 (Addition), 2 (Subtraktion), 3 (Multiplikation), 4 (Division)");
        int operation = scanner.nextInt();
        double result = 0;
        switch (operation){
            case 1: result = addieren(num1, num2); break;
            case 2: result = subtrahtieren(num1, num2); break;
            case 3: result = multipl(num1, num2 ); break;
            case 4: result = divide(num1, num2); break;
            default: System.out.println("Ungultige Auswahl."); return;
        }
            System.out.println("Ergebnis:" + result );
            scanner.close();
        }
        }