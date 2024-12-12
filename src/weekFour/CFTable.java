package weekFour;

public class CFTable {
    public static void main(String[] args){
        int startTemp = 0;
        int endTemp = 20;

        System.out.printf("%-10s %-12s%n", "Celsius", "Fahrenheit");

        for (int celsius = startTemp; celsius <= endTemp; celsius++){
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.printf("%-10d %-12.1f%n", celsius, fahrenheit);
        }
    }
}
