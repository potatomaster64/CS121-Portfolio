package weekEleven.fileIO;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException{
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\great\\IdeaProjects\\classActivity1\\src\\weekEleven\\fileIO\\courses.txt");
            PrintWriter out = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Please enter the course name");
            int credits = Integer.parseInt(JOptionPane.showInputDialog("Please enter the course credits"));
            double score = Double.parseDouble(JOptionPane.showInputDialog("Please enter the course score"));

            out.printf("%s %d %f", course, credits, score);
            fileWriter.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        }
    }
}
