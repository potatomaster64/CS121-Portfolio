package weekEleven.fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\great\\IdeaProjects\\classActivity1\\src\\weekEleven\\fileIO\\courses.txt");

        try {
            Scanner input = new Scanner(inFile);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }   catch (FileNotFoundException e){
            System.err.println("File Not Found");
        }
    }
}
