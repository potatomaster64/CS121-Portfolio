package weekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, "123 Main St", "555-1234");

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);

        person.displayInfo();
        person.showAddress();
        person.displayPhoneNumber();

        System.out.println("Age: " + person.getAge());
        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());
    }
}
