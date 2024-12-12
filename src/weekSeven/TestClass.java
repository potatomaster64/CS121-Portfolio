package weekSeven;

public class TestClass {
    public static void main(String[] args){
        School schoolOne = new School("Ball State University", "Junior", "Computer Science");
        Student studentOne = new Student("Evan","Ball State University", "Computer Science");

        schoolOne.displaySchoolDetails();
        studentOne.StudentDetails();
    }
}
