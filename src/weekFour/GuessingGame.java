package weekFour;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args){

        int userGuess;
        int guessCount = 0;
        int randNum = ThreadLocalRandom.current().nextInt(0, 100);

        while (true) {
            String input = JOptionPane.showInputDialog("Please enter a number between 1 and 100, or 'q' to quit:");
            if (input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, String.format("You chose to quit the game, you guessed %d times. The number was %d .", guessCount, randNum));
                break;
            }
            boolean isValidNumber = true;
            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isValidNumber = false;
                    break;
                }
            }
            if (isValidNumber) {
                userGuess = Integer.parseInt(input);

                if (userGuess == randNum) {
                    JOptionPane.showMessageDialog(null, String.format("Correct! You guessed it in %d tries!", guessCount));
                    break;
                } else if (userGuess > randNum) {
                    JOptionPane.showMessageDialog(null, "Too high! Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too low! Please try again.");
                }

                guessCount++;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 100, or 'q' to quit.");
            }
        }
    }
}
