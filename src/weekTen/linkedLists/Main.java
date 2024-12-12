package weekTen.linkedLists;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> classesOne = new LinkedList<>();
        GymMember memberOne = new GymMember("Evan", "evan@thezcr.com", "Platinum", classesOne);

        LinkedList<String> classesTwo = new LinkedList<>();
        GymMember memberTwo = new GymMember("Bob", "bob@gmail.com", "Bronze", classesTwo);

        memberOne.addClass("Lifting");
        memberOne.addClass("Running");
        memberOne.addClass("Swimming");
        memberOne.addClass("Stretching");

        memberTwo.addClass("Jogging");
        memberTwo.addClass("Basketball");
        memberTwo.addClass("Nutrition");
        memberTwo.addClass("Zumba");

        //Printing memberOne's information

        System.out.println("Member One Info: ");
        System.out.println(memberOne.getMemberInfo());
        memberOne.displayEnrolledClasses();

        //Print memberTwo's info

        System.out.println("Member Two Info: ");
        System.out.println(memberTwo.getMemberInfo());
        memberTwo.displayEnrolledClasses();

        //Remove one of memberOne's classes

        memberOne.cancelClass("Stretching");

        //Remove one of memberTwo's Classes

        memberTwo.cancelClass("Zumba");

        //Output updated classes

        System.out.println("\nUpdated Class List for Member One: ");
        memberOne.displayEnrolledClasses();

        System.out.println("\nUpdated Class List for Member Two: ");
        memberTwo.displayEnrolledClasses();
    }
}
