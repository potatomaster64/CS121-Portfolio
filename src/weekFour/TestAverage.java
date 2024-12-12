package weekFour;
import java.util.Scanner;


public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the number of test scores per student: ");
        int numTests = Integer.parseInt(scanner.nextLine());

        for (int student = 1; student <= numStudents; student++) {
            double totalScore = 0;
            System.out.println("\nEnter the test scores for student " + student + ":");

            for (int test = 1; test <= numTests; test++) {
                System.out.print("Test score " + test + ": ");
                double score = Double.parseDouble(scanner.nextLine());
                totalScore += score;
            }

            double averageScore = totalScore / numTests;
            System.out.printf("The average score for student %d is: %.2f\n", student, averageScore);
        }
    }
}