package weekSeven;

public class Student {
    private String name;
    private String school;
    private String major;

    public Student (String name, String school, String major){
        this.name = name;
        this.school = school;
        this.major = major;
    }

    public void StudentDetails() {
        System.out.println("Hi! My name is " + name + " and I am a " + major + " major at " + school + "!");

    }
}
