import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Random rand = new Random();
        String win = "You Win";
        String lost = "You lost";
        String tie = "Match tie,Because we both selected same";
        int int_random = rand.nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Option \n 0.Rock \n 1.Paper \n 2.Scissor");
        int usr = sc.nextInt();
        sc.close();
        if (int_random == usr) {
           System.out.println(tie);
        } else if (int_random == 0)
            if (usr == 1) {
                System.out.println(win);
            } else if (int_random == 0)
                if (usr == 2) {
                    System.out.println(lost);
                } else if (int_random == 1)
                    if (usr == 0) {
                        System.out.println(win);
                    } else if (int_random == 1)
                        if (usr == 2) {
                            System.out.println(lost);
                        } else if (int_random == 2)
                            if (usr == 0) {
                                System.out.println(win);
                            } else if (int_random == 2)
                                if (usr == 1) {
                                    System.out.println(lost);
                                }

    }
}
