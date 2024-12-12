package project2;
import java.util.Random;
import java.util.Scanner;

public class TestScores {
    private static final int SIZE = getRandomSize();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.println("Please enter " + SIZE + " test scores: ");

        for (int i = 0; i < SIZE; i++){
            System.out.print("Score " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }

        for (int i = 0; i < SIZE; i++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }
    public static int getRandomSize(){
        Random random = new Random();
        return random.nextInt(8)+ 3;
    }
    public static char getLetterGrade(int score){
        if(score > 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if(score >= 70){
            return 'C';
        }
        else if(score >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void printGrades(int[] scores, char[] grades){
        System.out.println("\nScore\tGrade");
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + "\t\t" + grades[i]);
        }
    }
    public static void printHighestScore(int[] scores){
        int highest = scores[0];
        for (int score: scores){
            if (score > highest){
                highest = score;
            }
        }
        System.out.println("\nHighest Score: " + highest);
    }
    public static void printLowestScore(int[] scores){
        int lowest = scores[0];
        for (int score: scores){
            if (score < lowest){
                lowest = score;
            }
        }
        System.out.println("Lowest Score: " + lowest);
    }
    public static void printAverageScore(int[] scores){
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        double avg = (double) sum / scores.length;
        System.out.printf("Avg. Score: %.2f%n", avg);
    }
}
