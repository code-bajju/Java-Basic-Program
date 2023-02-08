import java.util.Scanner;
public class chapter_4ps {
    public static void main(String[] args) {
        System.out.println("Enter ur no.");
        int day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
sc.close();
        switch(day){
            case 1 -> System.out.println("ravivar");
            case 2 -> System.out.println("somwar");
            case 3 -> System.out.println("managalwar");
            case 4 -> System.out.println("budhwar");
            case 5 -> System.out.println("guruwar");
            case 6 -> System.out.println("shukrwar");
            case 7 -> System.out.println("shaniwar");
        }
    }
}
