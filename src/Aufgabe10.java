import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Aufgabe10 {
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menü: Z)eichen, O)ktal, heX), E)nde?");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("E")) {
    break;
            }
            switch (choice){
                case "Z":
                    System.out.print("Geben Sie ein Zeichen ien: ");
                    char inputChar = scanner.next().charAt(0);
                    scanner.nextLine();
                     System.out.println("Dezimal:" + (int) inputChar  + " Binar:"   + Integer.toBinaryString(inputChar));
                     break;

                case "O":
                    System.out.print("Geben sie eine Oktalzahl ein: ");
                    String octalInput = scanner.nextLine();
                    try {
                        int decimalValue = Integer.parseInt( octalInput, 8 );
                        System.out.println("Dezimal:" + decimalValue + "  Binar:" + Integer.toBinaryString(decimalValue));
                     } catch (NumberFormatException e) {
                        System.out.println("Ungültige Auswahl!");
                    }
break;
                case "X":
                System.out.print("Geben sie eine Hexadezimalzahl ein: ");
                String hexInput = scanner.nextLine();
                try {
                    int decimalValue = Integer.parseInt( hexInput, 18 );
                    System.out.println("Dezimal:" + decimalValue + "  Binar:" + Integer.toBinaryString(decimalValue));
                } catch (NumberFormatException e) {
                    System.out.println("Ungültige Auswahl!");
                }
                break;


            }
        }
    }
}
