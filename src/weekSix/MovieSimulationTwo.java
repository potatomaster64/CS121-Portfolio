package weekSix;

import java.util.Random;

public class MovieSimulationTwo {

    // Constants for the seat availability 2D array
    private static final int ROWS = 5;
    private static final int COLUMNS = 10;

    public static void main(String[] args) {
        String[] movieNames = {"The Matrix", "Inception", "Avatar", "Interstellar"};
        String[] movieTypes = {"Action", "Sci-Fi", "Adventure", "Sci-Fi"};
        double[] moviePrices = {10.50, 12.00, 15.00, 11.75};

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        int[][] movieAvailability = new int[ROWS][COLUMNS];

        setSeatAvailability(movieAvailability);

        System.out.println("Initial Seat Availability (0 = empty, 1 = occupied):");
        displaySeatAvailability(movieAvailability);

        randomizeAvailability(movieAvailability);

        System.out.println("Randomized Seat Availability (0 = empty, 1 = occupied):");
        displaySeatAvailability(movieAvailability);
    }

    public static void setSeatAvailability(int[][] seats) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = 0;
            }
        }
    }

    public static void randomizeAvailability(int[][] seats) {
        Random rand = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = rand.nextInt(2);
            }
        }
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

    public static void displaySeatAvailability(int[][] seats) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}