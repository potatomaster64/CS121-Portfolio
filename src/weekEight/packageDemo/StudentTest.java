package weekEight.packageDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(12345, "Jane Doe", "Computer Science", 3.8, "jane.doe@example.com");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Major: " + student.getMajor());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Email: " + student.getEmail());

        student.setGpa(3.9);
        System.out.println("Updated GPA: " + student.getGpa());
    }
}
