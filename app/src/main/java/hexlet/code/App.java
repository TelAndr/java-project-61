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
        String curUserName = new String();
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Please enter the game number and press Enter.\n" +
                        "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" +
                        "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        String strNumGame = USER_INPUT.nextLine();
        int numGame = Integer.parseInt(strNumGame);
        System.out.println("Your choice:" + numGame + "\n");
        Engine eng = new Engine();
        int numInpIter = 3;
        int counterInputUser = 0;
            switch (numGame) {
                case 0:
                    break;
                case 1:
                    curUserName = eng.detectUserName();
                    break;
                case 2:
                    Parity.prepareData(numGame);
                    break;
                case 3:
                    Calculate.prepareData(numGame);
                    break;
                case 4:
                    eng.userInteractWithCalcGCD();
                    break;
                case 5:
                    Progression.prepareData(numGame);
                    break;
                case 6:
                    Prime.prepareData(numGame);
                    break;
                default:
                    System.out.println("Error input!");
            }
    }
}