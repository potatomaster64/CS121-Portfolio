package weekEight.packageDemo;

public class Student {
    private int studentId;
    private String name;
    private String major;
    private double gpa;
    private String email;

    public Student(int studentId, String name, String major, double gpa, String email) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.email = email;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}