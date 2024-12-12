package weekFour;
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int speed, time;

        System.out.println("Please enter the speed of the vehicle in MPH");
        speed = scan.nextInt();

        System.out.println("Please enter the amount of time in whole hours you will spend driving");
        time = scan.nextInt();

        System.out.printf("%-10s %-12s%n", "Hour", "Distance Traveled");
        for (int i = 0; i <= time; i++){
            int distance = speed * i;

            System.out.printf("%-10d %-12d%n", i, distance);
        }

    }
}
