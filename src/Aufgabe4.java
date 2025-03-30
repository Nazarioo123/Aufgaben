import java.sql.PreparedStatement;
import java.util.Scanner;


public class Aufgabe4 {
    public  static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Zahl");
        int number = scanner.nextInt();

        long result = faktoriellesErgebnis(number);

        System.out.println("Ergebnis der Fakultät der Zahl " + number + "ist " + result );
    }
      public  static long faktoriellesErgebnis (int n) {
        long  factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *=i;
        }
            return  factorial;
    }
}
