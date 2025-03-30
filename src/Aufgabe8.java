public class Aufgabe8 {


    public  static  void main(String[] args) {
        int [] arr = {45, 52, 2, 1, 0, 98, 445, 4, 42, 65, 3, 12, 11, 20, 42};

        System.out.println("Original array:");
        printArray(arr);

        int[] arrAsc = arr.clone();
        bubbleSortAsc(arrAsc);
        System.out.println("\nArray in aufstegender Reihenfolge");
        printArray(arrAsc);

        int[] arrDesc = arr.clone();
        bubbleSortDesc(arrDesc);
        System.out.println("\nArray in abseigender Reihenfolge:");
        printArray(arrDesc);
    }

    public  static void printArray(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");

        }
        System.out.println();
    }


    public static void bubbleSortAsc(int[] arr) {
        for (int i = 0; i  < arr.length - 1; i ++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr [j] > arr [j + 1 ]) {
                    int temp = arr[j];
                    arr [j] = arr[j + 1];
                    arr [j + 1 ] = temp;

                }
            }
        }
    }
    public static void bubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}