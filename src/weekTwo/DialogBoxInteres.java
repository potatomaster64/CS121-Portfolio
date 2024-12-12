package weekTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DialogBoxInteres {
    public static void main(String [] args){
        double P, R, A;
        int N, T;

        Scanner scan = new Scanner(System.in);

        P = Double.parseDouble(JOptionPane.showInputDialog("What is your original Principal?"));

        R = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?")) / 100;

        N = Integer.parseInt(JOptionPane.showInputDialog("How many times per year is interest compounded?"));

        T = Integer.parseInt(JOptionPane.showInputDialog("How many years will the interest be compounded?"));

        A = P * Math.pow((1 + R/N), N * T);
        JOptionPane.showMessageDialog(null, String.format("After %d years, you will have $ %.2f", T, A));


    }
}
