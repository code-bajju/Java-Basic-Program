import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age;
        age = sc.nextInt();
        switch(age){
            case 12:
            System.out.println("Youre going to become teen");
            break;
            case 18:
            System.out.println("Youre going to become adult");
            break;
            case 40:
            System.out.println("Youre going to become adhed");
            break;
            case 100:
            System.out.println("Youre going to become budha");
            break;
            default:
            System.out.println("Yes Baby");
        }
        System.out.println("Thanks for using my java compiler");












        // sc.close();
        // if (age > 18) {
        //     System.out.println("yeah boy youre experienced");
        // } else if (age > 30) {
        //     System.out.println("Youre semi exp");
        // } else if (age > 46) {
        //     System.out.println("lol budhee");

        // } else {
        //     System.out.println("go to hell");
        // }

    }

}
