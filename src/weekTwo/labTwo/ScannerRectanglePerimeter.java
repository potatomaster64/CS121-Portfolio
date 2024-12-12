package weekTwo.labTwo;
import java.util.Scanner;

public class ScannerRectanglePerimeter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int length, width, perimeter;

        System.out.println("How long is the rectangle?");

        length = scan.nextInt();

        System.out.println("How wide is the rectangle?");

        width = scan.nextInt();

        perimeter = (length * 2) + (width * 2);

        System.out.printf("The perimeter of the rectangle is: %d", perimeter);





    }
}
