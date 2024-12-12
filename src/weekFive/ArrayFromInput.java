package weekFive;

import java.util.Scanner;

public class ArrayFromInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEntries = 3;

        String[] names = new String[numEntries];
        int[] ages = new int[numEntries];
        double[] grades = new double[numEntries];

        for (int i = 0; i < numEntries; i++) {
            System.out.println((i + 1) + " .Enter item : ");
            names[i] = scanner.nextLine();

            System.out.println((i + 1) + " .Enter aisle : ");
            ages[i] = scanner.nextInt();

            System.out.println((i + 1) + " .Enter price : ");
            grades[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.printf("%-15s %-15s %-10s\n", "NAME", "AGE", "GRADE");
        System.out.println("----------------------------------------");

        for (int i = 0; i < numEntries; i++) {
            System.out.printf("%-15s %-15d %-10.2f\n", names[i], ages[i], grades[i]);
        }
    }
}