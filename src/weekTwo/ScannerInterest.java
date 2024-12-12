package weekTwo;
import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        double P, R, A;
        int N, T;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your original Principal?");

        P = scan.nextDouble();

        System.out.println("What is the annual interest rate?");

        R = scan.nextDouble() / 100;

        System.out.println("How many times per year is interest compounded?");

        N = scan.nextInt();

        System.out.println("How many years will the interest be compounded?");

        T = scan.nextInt();

        A = P * Math.pow((1 + R / N), N * T);
        System.out.printf("After %d years, you will have $ %.2f", T, A);


    }
}