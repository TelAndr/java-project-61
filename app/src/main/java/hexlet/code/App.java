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
            final int EXIT = 0;
            final int GREET = 1;
            final int EVEN = 2;
            final int CALC = 3;
            final int GCDCONST = 4;
            final int PROGRESSION = 5;
            final int PRIME = 6;
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
            case EXIT :
                break;
            case GREET:
                //Cli.askUser();
                break;
            case EVEN:
                Parity.run();
                break;
            case CALC:
                Calculate.run();
                break;
            case GCDCONST:
                GCD.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prime.run();
                break;
            default:
                System.out.println("Error input!");
        }
    }
}
