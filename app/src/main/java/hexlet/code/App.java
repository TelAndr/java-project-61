package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.GCD;
import hexlet.code.games.Parity;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static final Scanner USER_INPUT = new Scanner(System.in);
    private static String username;
    public static String getUserName() {
        return username;
    }
    public static void setUserName(String inpUserName) {
        username = inpUserName;
    }
    public static void main(String[] args) {
        //if (username != null) {
        //    System.out.println("Let's try again, " + username + "!");
        //}
        final int exit = 0;
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        System.out.println(
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n"
                        + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        String strNumGame = USER_INPUT.nextLine();
        int numGame = Integer.parseInt(strNumGame);
        System.out.println("Your choice:" + numGame + "\n");
        System.out.println("Welcome to the Brain Games!");
        //System.out.println("May I have your name?");
        //App.username = App.USER_INPUT.nextLine();
        //System.out.println("Hello, " + App.username + "!");
        Engine.printUserName();
        switch (numGame) {
            case exit :
                break;
            case greet:
                //Cli.askUser();
                break;
            case even:
                Parity.run();
                break;
            case calc:
                Calculate.run();
                break;
            case gcd:
                GCD.run();
                break;
            case progression:
                Progression.run();
                break;
            case prime:
                Prime.run();
                break;
            default:
                System.out.println("Error input!");
        }
    }
}
