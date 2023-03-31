import java.util.Random;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Choose rock, paper, or scissors:");
        String userChoice = scanner.nextLine();
        int computerChoice = rand.nextInt(3); // 0 = rock, 1 = paper, 2 = scissors

        if (userChoice.equals("rock")) {
            if (computerChoice == 0) {
                System.out.println("Tie!");
            } else if (computerChoice == 1) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice == 0) {
                System.out.println("You win!");
            } else if (computerChoice == 1) {
                System.out.println("Tie!");
            } else {
                System.out.println("You lose!");
            }
        } else {
            if (computerChoice == 0) {
                System.out.println("You lose!");
            } else if (computerChoice == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Tie!");
            }
        }
    }
}
