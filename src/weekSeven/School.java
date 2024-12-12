package weekSeven;

public class School {
    private String schoolName;
    private String schoolGrade;
    private String schoolMajor;
    public School(String schoolName,String schoolGrade,String schoolMajor){
        this.schoolName = schoolName;
        this.schoolGrade = schoolGrade;
        this.schoolMajor = schoolMajor;

    }
    public void displaySchoolDetails(){
        System.out.println("School Name: " + schoolName + "\nSchool Grade: " + schoolGrade + "\nSchool Major: " + schoolMajor);
    }

}
