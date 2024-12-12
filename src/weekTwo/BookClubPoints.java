package weekTwo;
import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args){
        int booksPurchased;
        int points = 0;
        booksPurchased = Integer.parseInt(JOptionPane.showInputDialog("How many books did the customer purchase?"));
        
        if (booksPurchased == 0){
            points = 0;
        }
        else if (booksPurchased == 1){
            points = 5;
        }
        else if (booksPurchased == 2){
            points = 15;
        }
        else if (booksPurchased == 3){
            points = 30;
        }
        else if (booksPurchased >= 4){
            points = 60;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
        JOptionPane.showMessageDialog(null,String.format("Your points for this purchase is: %d", points));
    }
}
