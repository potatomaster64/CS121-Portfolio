package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {


    private static final int ROWS = 5;
    private static final int COLUMNS = 10;

    public static void main(String[] args) {
        String[] movieNames = {"The Matrix", "Inception", "Avatar", "Interstellar"};
        String[] movieTypes = {"Action", "Sci-Fi", "Adventure", "Sci-Fi"};
        double[] moviePrices = {10.50, 12.00, 15.00, 11.75};

        displayMovieDetails(movieNames, movieTypes, moviePrices);


        int index = selectMovie(movieNames);


        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);


        int[][] movieAvailability = new int[ROWS][COLUMNS];


        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }

    public static int selectMovie(String[] movieNames) {
        Scanner scanner = new Scanner(System.in);
        int selectedIndex = -1;
        boolean movieFound = false;

        while (!movieFound) {
            System.out.println("Enter the name of the movie you would like to select: ");
            String selectedMovie = scanner.nextLine();

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equalsIgnoreCase(selectedMovie)) {
                    selectedIndex = i;
                    movieFound = true;
                    break;
                }
            }
            if (!movieFound) {
                System.out.println("Movie not found. Try again.");
            }
        }
        return selectedIndex;
    }

    public static void displaySelectedMovie(String name, String type, double price) {
        System.out.println("\nSelected Movie:");
        System.out.printf("Name: %s\nType: %s\nPrice: $%.2f\n\n", name, type, price);
    }

    public static void randomizeAvailability(int[][] seats) {
        Random rand = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                // Randomly reassign 0 values
                seats[i][j] = rand.nextInt(2);
            }
        }
    }

    public static void displaySeatAvailability(int[][] seats) {
        char[] rowLabels = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Seat Availability (0 = empty, 1 = occupied):");

        System.out.print("    ");
        for (int i = 1; i <= COLUMNS; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.printf("%c | ", rowLabels[i]);
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf("%2d ", seats[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMovieDetails(String[] names, String[] types, double[] prices) {
        System.out.println("Movie Details:");
        System.out.println("Name\t\tType\t\tPrice");
        System.out.println("-------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s%-10s$%.2f%n", names[i], types[i], prices[i]);
        }
        System.out.println();
    }
}