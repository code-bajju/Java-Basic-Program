import java.util.Random;
import java.util.Scanner;

public class Guessing_game {

    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 100:");

        while (true) {
            int guess = scanner.nextInt();
            if (guess == target) {
                System.out.println("You guessed it!");
                break;
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}
