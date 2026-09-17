import java.util.Scanner;
import java.util.Random;

public class RandomGuesser {

    public static void main(String[] args) { 
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Type your number: ");
        int line = in.nextInt();
        System.out.println("your guess is: "+ line);
        System.out.print("The number I was thinking of is: ");
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        System.out.println("You were off by: " + (number - line));
    }
}
