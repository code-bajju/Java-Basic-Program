import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors_2 {
    
    public static String GenChoic(Random random) {
        int word;
        word = random.nextInt(3);
        String pcchoice = "";
        if (word == 0) {
            pcchoice = "Rock";
        } else if (word == 1) {
            pcchoice = "Paper";
        } else if (word == 2) {
            pcchoice = "Scissor";
        }
        System.out.println("code.bajju is already made choice");
        return pcchoice;
    }

    public static void menu() {
        System.out.println("Select Option \n 0.Rock \n 1.Paper \n 2.Scissor");
        Scanner usr = new Scanner(System.in);
        int num = usr.nextInt();
        String usrchoice = "";
        if (num == 0) {
            usrchoice = "Rock";
        } else if (num == 1) {
            usrchoice = "Paper";
        } else if (num == 2) {
            usrchoice = "Scissor";
        }

    }

    public static String winner(String pcchoice, String usrchoice) {
        String finalmsg = "";
        if (usrchoice == (pcchoice)) {
            System.out.println("We both chose the same item-try again");
        } else if (usrchoice == ("Rock")) {
            if (pcchoice == "Paper") {
                System.out.println("I chose Paper and you chose Rock: Paper covers rock, so I win");
            }
        } else if (usrchoice == ("Rock")) {
            if (pcchoice == ("Scissor")) {
                System.out.println("I chose Scissors and you choise Rock: Rock breaks Scissors, so you win");
            }
        } else if (usrchoice == ("Paper")) {
            if (pcchoice == ("Scissor")) {
                System.out.println("I chose Scissors and you chose Paper: Scissors cuts Paper, so I win");
            }
        } else if (usrchoice == ("Paper")) {
            if (pcchoice == ("Rock")) {
                System.out.println("I chose Rock and you chose Paper: Paper covers Rock, so you win");
            }
        } else if (usrchoice == ("Scissor")) {
            if (pcchoice == ("Paper")) {
                System.out.println("I chose Paper and you chose Scissors: Scissors cuts Paper, so you win");
            }
        } else if (usrchoice == ("Scissor")) {
            if (pcchoice == ("Rock")) {
                System.out.println("I chose Rock and you chose Scissors: Rock breaks Scissors, so I win");
            }
        }
        return finalmsg;
    }
}
