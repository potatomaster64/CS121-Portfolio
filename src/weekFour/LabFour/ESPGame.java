package weekFour.LabFour;
import java.util.Random;
import java.util.Scanner;


public class ESPGame {
    public static void main(String[] args){
        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        int numTries = 10;
        int correctGuesses = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the random color test!");
        System.out.println("Please guess the color chosen by the computer!");
        System.out.println("The colors are red, green, blue, orange, and yellow!");

        for (int i = 0; i < numTries; i++){
            String selectColor = colors[rand.nextInt(colors.length)];

            System.out.println("Please enter a color in lower-case letters");
            String userGuess = scan.nextLine().trim().toLowerCase();

            System.out.println("The computer selected: " + selectColor);

                    if (userGuess.equals(selectColor)){
                        System.out.println("You guessed right!");
                        correctGuesses++;
                    }
                    else{
                        System.out.println("Incorrect");
                    }

        }
        System.out.println("Game over! You guessed correctly " + correctGuesses + " time(s)");


    }
}
