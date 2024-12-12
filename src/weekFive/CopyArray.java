package weekFive;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements for the arrays: ");
        final int SIZE = scanner.nextInt();

        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];
        int[] array3 = new int[SIZE];
        int[] array4 = new int[SIZE];

        System.out.println("Enter " + SIZE + " numbers for Array1:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Array1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            array2[i] = array1[i];
        }

        System.out.print("Array2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            array3[i] = array1[i] * array1[i];
        }

        System.out.print("Array3 (squared): ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            array4[i] = array1[SIZE - 1 - i];
        }

        System.out.print("Array4 (reversed): ");
        for (int num : array4) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}