import  java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Geben Sie Ihren Namen ein :") ;
        String name = scanner.nextLine();
        System.out.println("Hallo " + name + "!");
        scanner.close();
    }
}
