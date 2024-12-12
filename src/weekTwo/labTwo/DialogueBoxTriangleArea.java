package weekTwo.labTwo;
import javax.swing.*;

public class DialogueBoxTriangleArea {
    public static void main(String[] args){

        int base, height, area;

        base = Integer.parseInt(JOptionPane.showInputDialog("How wide is the triangle?"));

        height = Integer.parseInt(JOptionPane.showInputDialog("How tall is the triangle?"));

        area = (base * height) / 2;

        JOptionPane.showMessageDialog(null, String.format("The area of the triangle is: %d", area));


    }
}
