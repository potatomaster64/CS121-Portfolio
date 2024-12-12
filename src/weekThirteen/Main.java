package weekThirteen;
import java.util.*;

public class Main extends DataStructures {
    public static void main(String[] args) {
        DataStructures ds = new DataStructures();

        ds.addStudent("Jeff");
        ds.addStudent("John");
        ds.addStudent("Jimmy");
        ds.addNationality("American");
        ds.addNationality("American");
        ds.addNationality("Russian");
        ds.pushHometownStack("Denver");
        ds.pushHometownStack("Memphis");
        ds.pushHometownStack("McCordsville");
        ds.addToQueue("Colorado");
        ds.addToQueue("Tennessee");
        ds.addToQueue("Indiana");
        ds.addToIntArray(21);
        ds.addToIntArray(25);
        ds.addToIntArray(18);
        ds.addToHashMap("Computer Science", 4.0);
        ds.addToHashMap("Theater", 3.8);
        ds.addToHashMap("Business", 2.7);

        // Print all data structures
        System.out.println("After adding elements:");
        ds.printList();
        ds.printNationalityList();
        ds.printStack();
        ds.printQueue();
        ds.printIntArray();
        ds.printHashMap();

        // Remove one element from each data structure
        ds.removeStudent("Jimmy");
        ds.removeNationality("American");
        ds.popFromStack();
        ds.removeFromQueue();
        ds.removeFromIntArray(21);
        ds.removeFromHashMap("Computer Science");

        // Print all data structures again
        System.out.println("\nAfter removing elements:");
        ds.printIntArray();
        ds.printNationalityList();
        ds.printStack();
        ds.printQueue();
        ds.printIntArray();
        ds.printHashMap();
    }
}