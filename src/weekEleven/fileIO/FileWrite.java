package weekEleven.fileIO;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException{
        File outFile = new File("C:\\Users\\great\\IdeaProjects\\classActivity1\\src\\weekEleven\\fileIO\\courses.txt");
        PrintWriter output = new PrintWriter(outFile);

        String course;
        int credits;
        double score;

        output.printf("%s %s %s\n ", "course", "credits", "score");

        for (int i = 1; i <= 3; i++){
            /*System.out.println("Please enter the name of course " + i);
            course = scan.nextLine();
            System.out.println("Please enter the course credits ");
            credits = scan.nextLine();
            System.out.println("Please enter the course's score ");
            score = scan.nextLine(); */
            course = JOptionPane.showInputDialog("Please enter the name of the course");
            credits = Integer.parseInt(JOptionPane.showInputDialog("Please enter the course credits"));
            score = Double.parseDouble(JOptionPane.showInputDialog("Please enter the course's score"));

            output.printf("%s, %d, %f\n ", course, credits, score);
        }
        output.close();

    }
}
