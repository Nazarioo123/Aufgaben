import  java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Höhe des Dreiecks ein:");
        int height = scanner.nextInt();

        System.out.println("\nDreieck ");
        drawDreieck(height);

        System.out.print("\nGeben Sie die Höhe des Baum ein:");
        int TreeHeight = scanner.nextInt();

        System.out.println("\nBaum");
        drawTree(TreeHeight);
    }

    public static void drawDreieck(int height) {
        for (int i = 1; i <=height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void drawTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
