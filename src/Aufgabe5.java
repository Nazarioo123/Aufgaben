import  java.util.Scanner;

 public class Aufgabe5 {
     public  static void main(String[] args){
              Scanner scanner = new Scanner(System.in);
              System.out.print("Geben Sie die Höhe des Rechtecks ein:");
              int height = scanner.nextInt();
              System.out.print("Geben Sie die Breite des Rechtecks ein: ");
              int width = scanner.nextInt();
              System.out.print("\n Rectangl\n");
              drawRectangle(height,width);

     }


     public static  void  drawRectangle (int height, int width ) {
         for (int i = 0; i < height; i++) {
             for (int j = 0; j < width; j++) {
                 System.out.print("*");
             }
              System.out.println();
         }
     }
 }