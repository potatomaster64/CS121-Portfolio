package weekTwo;
import javax.swing.*;

public class TestScores {
    public static void main(String[] args){
        int t1, t2, t3, total;

        t1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first test score"));
        t2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second test score"));
        t3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the third test score"));

        total = (t1 + t2 + t3)/3;

        if ((total >= 90) && (total <= 100)){
            JOptionPane.showMessageDialog(null, "You have an A");
        }
        else if ((total >= 79) && (total <= 89)){
            JOptionPane.showMessageDialog(null, "You have a B");
        }
        else if ((total >= 69) && (total <= 79)){
            JOptionPane.showMessageDialog(null, "You have a C");
        }
        else if ((total >= 60) && (total <= 69)){
            JOptionPane.showMessageDialog(null,"You have a D");
        }
        else if ((total <= 60)){
            JOptionPane.showMessageDialog(null,"You have an F");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter valid grades");
        }
    }
}
