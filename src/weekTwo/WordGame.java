package weekTwo;
import javax.swing.JOptionPane;

public class WordGame {
    public static void main(String[] args){
        String name, city, college, major, animal, petName;
        int age;

        name = JOptionPane.showInputDialog("What is your first name?");

        age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        city = JOptionPane.showInputDialog("What city are you from?");

        college = JOptionPane.showInputDialog("What college do you go to?");

        major = JOptionPane.showInputDialog("What's your major?");

        animal = JOptionPane.showInputDialog("What your favorite type of animal?");

        petName = JOptionPane.showInputDialog("What is your pet's name? (Make up one if you don't have one)");

        JOptionPane.showMessageDialog(null, String.format("There once was a student named %s who is %d, lives in %s, and is a %s major at %s . One day, they were walking to school when they came across a stray %s and decided to adopt them. naming them %s . " , name, age, city, major, college, animal, petName));



    }
}
