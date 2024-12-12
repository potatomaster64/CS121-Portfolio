package weekSeven;
import java.util.Scanner;
import java.util.Random;

public class MovieSimulationClass {
    private static final int ROWS = 5;
    private static final int COLUMNS = 10;
    private final String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
    private final String[] movieTypes = {"3D", "2D", "3D", "2D"};
    private final double[] moviePrices = {15.00, 12.00, 14.00, 12.00};
    private final int[][] movieAvailability;

    private static final Scanner scanner = new Scanner(System.in);

    public MovieSimulationClass(){
        movieAvailability = new int[ROWS][COLUMNS];
    }

    public void run(){
        displayMovieDetails();
        int index = selectMovie();
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        randomizeAvailability();
        displaySeatAvailability();
        selectSeats();
    }
    private void displayMovieDetails(){
        System.out.printf("\n%s MOVIE DETAILS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Movie %d: %-16s %-20s %.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
    private int selectMovie(){
        String selectedMovie;
        while (true) {
            System.out.print("\nEnter the movie name: ");
            selectedMovie = scanner.nextLine();
            for (int i = 0; i < movieNames.length; i++) {
                if (selectedMovie.equals(movieNames[i])) {
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }
    private void displaySelectedMovie(String movieName, String movieType, double moviePrice){
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s $%.2f\n", movieName, movieType, moviePrice);
    }
    private void randomizeAvailability(){
        Random random = new Random();
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = random.nextInt(2);                    // Randomly assign availability (0 or 1)
            }
        }
    }
    private void displaySeatAvailability(){

        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available]\n\n  ");

        // displays column numbers
        for (int col = 1; col <= movieAvailability[0].length; col++) {
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));

        for (int i = 0; i < movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.printf("%d ", movieAvailability[i][j]);
            }
            System.out.println();
        }
    }
    private void selectSeats(){
        // ask the user how many tickets they'd like to purchase
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");
        int tickets = Integer.parseInt(scanner.nextLine());

        // loop through each ticket and allow the user to pick a seat
        for (int t = 1; t <= tickets; t++) {
            while (true) {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket #%d: ", t);
                String seat = scanner.nextLine().toUpperCase();

                // extract row and column index from seat input
                int rowIndex = seat.charAt(0) - 65;                              // convert row character (e.g., 'A') to index
                int seatIndex = Integer.parseInt(seat.substring(1)) - 1;         // convert seat number to index

                // check if the selected seat is available
                if (movieAvailability[rowIndex][seatIndex] == 0) {
                    movieAvailability[rowIndex][seatIndex] = 1;                  // marks the seat as booked
                    System.out.printf("\nYou have successfully booked seat %s\n", seat);
                    break;
                } else {
                    System.out.printf("\nSorry, seat %s is already booked. Try again!\n", seat);
                }
            }
        }
        System.out.println("\nAll seats are booked! Enjoy your movie!!");
    }

}
