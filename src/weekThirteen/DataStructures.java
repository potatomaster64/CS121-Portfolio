package weekThirteen;
import java.util.*;

public class DataStructures {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();
    private int ageListSize = 0;

    public void addStudent(String name){
        studentList.add(name);
    }
    public void removeStudent(String name){
        studentList.remove(name);
    }
    public void printList(){
        System.out.println("Students: " + studentList);
    }
    public void addNationality(String nat){
        nationalityList.add(nat);
    }
    public void removeNationality(String nat){
        nationalityList.remove(nat);
    }
    public void printNationalityList(){
        System.out.println("Nationalities: " + nationalityList);
    }
    public void pushHometownStack(String ht){
        hometownStack.push(ht);
    }
    public void popFromStack(){
        if(!hometownStack.isEmpty()){
            hometownStack.pop();
        }
    }
    public void printStack(){
        System.out.println("Student HomeTowns: " + hometownStack);
    }
    public void addToQueue(String hsq){
        homeStateQueue.add(hsq);
    }
    public void removeFromQueue(){
        if (!homeStateQueue.isEmpty()){
            homeStateQueue.poll();
        }
    }
    public void printQueue(){
        System.out.println("Home States: " + homeStateQueue);
    }
    public void addToIntArray(int age){
        if (ageListSize < ageList.length){
            ageList[ageListSize] = age;
            ageListSize++;
        }
        else {
            System.out.println("There is no more room for student ages");
        }
    }
    public void removeFromIntArray(int age){
        int index = -1;
        for (int i = 0; i < ageListSize; i++){
            if (ageList[i] == age){
                index = i;
                break;
            }
        }
        if (index != -1){
            for (int i = index; i < ageListSize - 1; i++){
                ageList[i] = ageList[i + 1];
            }
            ageList[ageListSize -1] = 0;
            ageListSize--;
        }
    }
    public void printIntArray(){
        System.out.print("ageList: [");
        for (int i = 0; i < ageListSize; i++) {
            System.out.print(ageList[i]);
            if (i < ageListSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void addToHashMap(String maj, Double gpa){
        majorGpaMap.put(maj, gpa);
    }
    public void removeFromHashMap(String maj){
        majorGpaMap.remove(maj);
    }
    public void printHashMap(){
        System.out.println("Student Majors and GPAs: " + majorGpaMap);
    }

}
