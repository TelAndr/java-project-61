package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static final Scanner USER_INPUT = new Scanner(System.in);
    public static String username = "";
    public static void main(String[] args) { //
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        App.username = App.USER_INPUT.nextLine();
        System.out.println("Hello, " + App.username + "!");
        System.out.println(
                "Please enter the game number and press Enter.\n" +
                        "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" +
                        "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        String strNumGame = USER_INPUT.nextLine();
        int numGame = Integer.parseInt(strNumGame);
        System.out.println("Your choice:" + numGame + "\n");
            switch (numGame) {
                case 0:
                    break;
                case 1:
                    Cli.askUser();
                    break;
                case 2:
                    Parity.prepareData();
                    break;
                case 3:
                    Calculate.prepareData();
                    break;
                case 4:
                    GCD.prepareData();
                    break;
                case 5:
                    Progression.prepareData();
                    break;
                case 6:
                    Prime.prepareData();
                    break;
                default:
                    System.out.println("Error input!");
            }
    }
}