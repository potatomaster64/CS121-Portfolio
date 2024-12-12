package weekTen.linkedLists;
import java.util.LinkedList;

public class GymMember {
    private String name, email, membershipPlan;
    private LinkedList<String> enrolledClassList;

    public GymMember(String name, String email, String membershipPlan, LinkedList<String> enrolledClassList){
        this.name = name;
        this.email = email;
        this.membershipPlan = membershipPlan;
        this.enrolledClassList = enrolledClassList;
    }

    public void addClass(String className){
        enrolledClassList.add(className);
    }
    public void cancelClass(String className){
        enrolledClassList.remove(className);
    }
    public String getMemberInfo(){
        return "\nName: " + name + "\nEmail: " + email + "\nMembership Plan: " + membershipPlan;
    }
    public void displayEnrolledClasses(){
        System.out.println("Enrolled Classes: ");
        for (String className : enrolledClassList){
            System.out.println("- " + className);
        }
    }
}
