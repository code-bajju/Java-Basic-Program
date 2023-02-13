import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors_1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int compVal = (int) (3 * Math.random()) + 1;
        char compChoice;
        if (compVal == 1) {
            compChoice = 'R';
        } else if (compVal == 2) {
            compChoice = 'P';
        } else {
            compChoice = 'S';
        }
        System.out.println("Rock, Paper, Scissors-Enter a choice R/P/S: ");
        String mine = keyboard.nextLine();
        keyboard.close();
        char myChoice = mine.charAt(0);
        myChoice = Character.toUpperCase(myChoice);
        if (myChoice == (compChoice)) {
            System.out.println("We both chose the same item-try again");
        } else if (myChoice == ('R')) {
            if (compChoice == 'P') {
                System.out.println("I chose Paper and you chose Rock: Paper covers rock, so I win");
            }
        } else if (myChoice == ('R')) {
            if (compChoice == ('S')) {
                System.out.println("I chose Scissors and you choise Rock: Rock breaks Scissors, so you win");
            }
        } else if (myChoice == ('P')) {
            if (compChoice == ('S')) {
                System.out.println("I chose Scissors and you chose Paper: Scissors cuts Paper, so I win");
            }
        } else if (myChoice == ('P')) {
            if (compChoice == ('R')) {
                System.out.println("I chose Rock and you chose Paper: Paper covers Rock, so you win");
            }
        } else if (myChoice == ('S')) {
            if (compChoice == ('P')) {
                System.out.println("I chose Paper and you chose Scissors: Scissors cuts Paper, so you win");
            }
        } else if (myChoice == ('S')) {
            if (compChoice == ('R')) {
                System.out.println("I chose Rock and you chose Scissors: Rock breaks Scissors, so I win");
            }
        }
    }

    {

    }
}