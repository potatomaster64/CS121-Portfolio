package weekFifteen.Act32;

public class Recursion {

    public void countDown(int number) {
        if (number == 0) {
            System.out.println("Blast Off!");
        } else {
            System.out.print(number + "...");
            countDown(number - 1);
        }
    }
    public void alphabetBackwards(char letter) {
        if (letter == 'a') {
            System.out.print(letter);
        } else {
            System.out.print(letter + " ");
            alphabetBackwards((char)(letter - 1));
        }
    }
}