package arrayListDemo;
import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        SystemManagement systemManagement = new SystemManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name (or 'q' to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            systemManagement.addItem(name, age, address);
        }

        System.out.println("\nUser Information:");
        systemManagement.displayForEach();
        systemManagement.displayForLoop();

        scanner.close();
    }
}