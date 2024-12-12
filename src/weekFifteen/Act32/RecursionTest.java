package weekFifteen.Act32;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println("Testing countDown:");
        recursion.countDown(10);

        System.out.println("\nTesting alphaBackwards:");
        recursion.alphabetBackwards('z');
    }
}