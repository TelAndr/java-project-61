package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void askUser() {
        System.out.println("Welcome to the Brain Games!");
        //Scanner in = new Scanner(System.in);
        System.out.println("May I have your name?");
        //int num = in.nextInt();
        //String userName = in.nextLine();
        App.username = App.USER_INPUT.nextLine();

        System.out.println("Hello, " + App.username + "!");
    }
}