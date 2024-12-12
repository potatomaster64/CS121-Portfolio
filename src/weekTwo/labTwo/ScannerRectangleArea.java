package weekTwo.labTwo;
import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args){
        int length, width, area;
        Scanner scan = new Scanner(System.in);

        System.out.println("How long is the rectangle??");

        length = scan.nextInt();

        System.out.println("How wide is the rectangle?");

        width = scan.nextInt();

        area = width * length;

        System.out.println("The area of the rectangle is " + area);


    }
}
