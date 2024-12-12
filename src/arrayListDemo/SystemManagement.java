package arrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String> names;
    private ArrayList<Integer> ages;
    private ArrayList<String> addresses;

    public SystemManagement(){
        names = new ArrayList<>();
        ages = new ArrayList<>();
        addresses = new ArrayList<>();
    }
    public void addItem(String name, int age, String address){
        names.add(name);
        ages.add(age);
        addresses.add(address);
    }
    public void removeItem(int index){
        if (index < names.size() && index < ages.size() && index < addresses.size()){
            names.remove(index);
            ages.remove(index);
            addresses.remove(index);
        } else{
            System.out.println("Index requested is not valid");
        }
    }
    public int getSize(){
        return names.size();
    }
    public String getItem(int index){
        if (index < names.size() && index < ages.size() && index < addresses.size()) {
            return "Name: " + names.get(index) + ", Age: " + ages.get(index) + ", Address: " + addresses.get(index);
        } else {
            return "Invalid index";
        }
    }
    public void displayForEach(){
        System.out.println("\nUsing enhanced for loop:");
        int index = 0;
        for (String name : names) {
            System.out.println("Name: " + name + ", Age: " + ages.get(index) + ", Address: " + addresses.get(index));
            index++;
        }
    }
    public void displayForLoop(){
        System.out.println("\nUsing regular for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i) + ", Address: " + addresses.get(i));
        }
    }
}
