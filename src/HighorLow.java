import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        int guess;
        Scanner input = new Scanner(System.in);
        do {
            Random rand = new Random();
            int correctNum = rand.nextInt(10);
            System.out.println("Pick a number from 1-10");
            guess = input.nextInt();
            if (guess < correctNum) {
                System.out.println("The number you guessed is too low.");
            } else if (guess > correctNum) {
                System.out.println("The number you guessed is too high.");
            } else if (guess == correctNum) {
                System.out.println("The number you guessed is...RIGHT ON THE MONEY!");
            }
        }while (guess >= 0 || guess <=10 );
    }
}