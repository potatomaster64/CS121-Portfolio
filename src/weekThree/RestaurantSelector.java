package weekThree;
import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args){
        boolean vegetarian, vegan, gluten;

        JOptionPane.showMessageDialog(null, "Please answer the following questions using true or false");
        vegetarian = Boolean.parseBoolean(JOptionPane.showInputDialog("Is there anyone in your party that is vegetarian?"));
        vegan = Boolean.parseBoolean(JOptionPane.showInputDialog("Is there anyone in your party that is vegan?"));
        gluten = Boolean.parseBoolean(JOptionPane.showInputDialog("Is there anybody in your party that is gluten-free?"));

        if ((vegetarian == false) && (vegan == false) && (gluten == false)){
            JOptionPane.showMessageDialog(null, "You should go to Joe's Gourmet Burgers!");
        }
        else if ((vegetarian == true) && (vegan == false) && (gluten == true)){
            JOptionPane.showMessageDialog(null, "You should go to Main Street Pizza Company!");
        }
        else if((vegetarian == false) && (vegan == true) && (gluten == true)){
            JOptionPane.showMessageDialog(null, "You should go to Corner Cafe!");
        }
        else if ((vegetarian == true) && (vegan == false) && (gluten == false)){
            JOptionPane.showMessageDialog(null, "You should go to Mama's Fine Italian!");
        }
        else if ((vegetarian == true) && (vegan == true) && (gluten == true)){
            JOptionPane.showMessageDialog(null, "You should go to The Chef's Kitchen");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please use valid responses (True or False)");
        }
    }
}