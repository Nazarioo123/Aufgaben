import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Zahl: ");
        int number = scanner.nextInt();

        long result = faktoriellesErgebnis(number);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.GERMAN);
        DecimalFormat df = new DecimalFormat("#,##0", symbols);
        String formatierteZahl = df.format(result);

        System.out.println("Ergebnis der Fakultät der Zahl " + number + " ist " + formatierteZahl);
    }

    public static long faktoriellesErgebnis(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}