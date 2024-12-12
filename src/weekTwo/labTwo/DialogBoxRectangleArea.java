package weekTwo.labTwo;
import javax.swing.*;

public class DialogBoxRectangleArea {
    public static void main(String[] args){
        int length, width, area;

        length = Integer.parseInt(JOptionPane.showInputDialog("M'Lord, How long is thine rectangle?"));

        width = Integer.parseInt(JOptionPane.showInputDialog("How wide is the rectangle?"));

        area = length * width;

        JOptionPane.showMessageDialog(null, String.format("The area of the rectangle is %d", area));

    }

}
