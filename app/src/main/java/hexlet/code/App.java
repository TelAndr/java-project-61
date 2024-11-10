package hexlet.code;
import java.util.Scanner;

public class App {
    public static final Scanner USER_INPUT = new Scanner(System.in);
    public static String username = "";
    public static void main(String[] args) { //
        Cli.askUser();
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
                    ParityInputGuessNum.prepareData(numGame);
                    break;
                case 3:
                    CalculationTwoNumValue.prepareData(numGame);
                    break;
                case 4:
                    CalculationGCD.calc_gcd();
                    break;
                case 5:
                    //GuessNumArithmProgr.prepareData(numGame);
                    GuessNumArithmProgr.GuessNumArithmProgres();
                    break;
                case 6:
                    //eng.countNumCorrectAns(counterInputUser, curUserName, numGame);
                    CalculateSimpleNumber.calcSimpleNumber();
                    break;
                default:
                    System.out.println("Error input!");
            }
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
}