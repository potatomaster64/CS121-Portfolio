package weekSix;

import java.util.Scanner;

public class MovieSimulationOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many movies would you like to enter? ");
        int movieCount = scanner.nextInt();
        scanner.nextLine();

        String[] movieNames = new String[movieCount];
        String[] movieTypes = new String[movieCount];
        boolean[] movieAvailability = new boolean[movieCount];
        double[] moviePrices = new double[movieCount];

        for (int i = 0; i < movieCount; i++) {
            System.out.println("Enter details for movie " + (i + 1));

            System.out.print("Movie Name: ");
            movieNames[i] = scanner.nextLine();

            System.out.print("Movie Type: ");
            movieTypes[i] = scanner.nextLine();

            System.out.print("Is the movie available? (true/false): ");
            movieAvailability[i] = scanner.nextBoolean();

            System.out.print("Movie Price: ");
            moviePrices[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        displayMovies(movieNames, movieTypes, movieAvailability, moviePrices, movieCount);
    }
    public static void displayMovies(String[] movieNames, String[] movieTypes, boolean[] movieAvailability, double[] moviePrices, int movieCount) {
        System.out.println("\nMovie Details:");
        System.out.printf("%-20s %-15s %-15s %-10s\n", "Movie Name", "Movie Type", "Availability", "Price");

        for (int i = 0; i < movieCount; i++) {
            String availability = movieAvailability[i] ? "Available" : "Not Available";
            System.out.printf("%-20s %-15s %-15s $%-10.2f\n", movieNames[i], movieTypes[i], availability, moviePrices[i]);
        }
    }
}