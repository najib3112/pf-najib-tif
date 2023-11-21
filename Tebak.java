import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class Tebak {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println(" *************");
        out.println("Welcome To Guessing Game");
        out.println(" *************");
        out.println();

        out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while(inputNumber != randomNumber){
            out.print();
            out.println("Try again...");
            out.print("Enter an int from 1 to 10 : ");
            inputNumber = keyboard.nextInt();
            numGuesses++;

        }
        out.print("You Win after ");
        out.println(numGuesses+"guesses.");

        keyboard.close();
    }
}    