import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            String[] game = {"r","p","s"};
            String pcmove = game[new Random().nextInt(game.length)];
            String mymove;
            while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                mymove = sc.nextLine();
                if (mymove.equals("r") || mymove.equals("p") || mymove.equals("s")) {
                  break;
        }
        System.out.println("invalid move");
    }
}
//if(mymove.equals(pcmove)){
    
}
    }
