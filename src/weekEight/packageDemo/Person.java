package weekEight.packageDemo;

public class Person {
    public String firstName;
    public String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    public Person(String firstName, String lastName, int age, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }

    private void printAge() {
        System.out.println("Age: " + age);
    }

    protected void showAddress() {
        System.out.println("Address: " + address);
    }

    void displayPhoneNumber() {
        System.out.println("Phone Number: " + phoneNumber);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}