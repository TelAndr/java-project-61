package hexlet.code;
import java.util.Scanner;
//import java.util.random.RandomGenerator;
//import hexlet.code.Cli;

public class App {

    public static void main(String[] args) { //
        hexlet.code.Cli.askUser();
        String curUserName = new String();
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Please enter the game number and press Enter.\n" +
                "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" +
                "5 - Progression\n" + "0 - Exit");
        String strGame = in.nextLine();
        System.out.println("You choice:" + strGame);
        int numGame = in.nextInt();
        System.out.println("Your choice:" + numGame);
        in.close();
        ParityCheck parCheck = new ParityCheck();
        Engine eng = new Engine();
        switch(numGame) {
            case 0:
                break;
            case 1:
                curUserName = eng.detectUserName();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int counterInputUser = 0;
                eng.countNumCorrectAns(in, counterInputUser, curUserName, numGame);
                break;
            default:
                System.out.println("Error input!");
        }
        switch(numGame) {
            case 0:

                break;
            case 1:
                //curUserName = parCheck.detectUserName();
                curUserName = eng.detectUserName();
                //System.out.println(
                //        "Welcome to the Brain Games!\n" +
                //                "May I have your name?"
                //);
                //String playerName = in.nextLine();
                //System.out.println(playerName + "\n");
                //System.out.println("Hello, " + playerName + "!");
                break;
            case 2:
                parCheck.determParityGuessNum();
                int counterInputUser = 0;
                System.out.println("Welcome to the Brain Games!\n" +
                        "May I have your name?");
                String secondPlayerName = in.nextLine();
                System.out.println(secondPlayerName + "\n");
                System.out.println("Hello, " + secondPlayerName + "!");
                while (in.hasNextLine()) {
                    if (counterInputUser == 3) {
                        System.out.println("Congratulations, " + secondPlayerName + "!");
                        break;
                    }
                    System.out.println(
                            "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                                    "Question:"
                    );
                    eng.determParityInpGuessNum(in, counterInputUser, curUserName);
                    int minValue = 1;
                    int maxValue = 100;
                    int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    System.out.println(randomValue);
                    System.out.println("Your answer:");
                    String strPlayerResponse = in.nextLine();
                    System.out.println(strPlayerResponse);
                    if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                            (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ) {
                        System.out.println("Correct!");
                        ++counterInputUser;
                    }
                    if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
                            (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ) {
                        System.out.println(
                                "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                        "Let's try again, Bill!"
                        );
                        break;
                    }
                }
                break;
            case 3:
                int counterInputUserSec = 0;
                System.out.println("What is the result of the expression?");
                while (in.hasNextLine()) {
                    if (counterInputUserSec == 3) {
                        System.out.println("Congratulations, " + "secondPlayerName" + "!");
                        break;
                    }
                    int minValue = 1;
                    int maxValue = 100;
                    int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    int randomValueSecond = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    String[] operators = {"+", "*"};
                    //Random random = new Random();
                    int minVal = 0;
                    int maxVal = 1;
                    int i = minVal + (int) (Math.random() * (maxVal - minVal + 1));
                    String simOper = operators[i];
                    int resultMathOperation = 0;
                    switch(simOper) {
                        case "+":
                            resultMathOperation = randomValueFirst + randomValueSecond;
                            break;
                        case "*":
                            resultMathOperation = randomValueFirst * randomValueSecond;
                            break;
                    }
                    System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
                    Scanner input = new Scanner(System.in);
                    int ansUserOper = input.nextInt();
                    System.out.println("Your answer: " + ansUserOper);
                    if(resultMathOperation == ansUserOper) {
                        System.out.println("Correct!");
                        ++counterInputUserSec;
                    } else {
                        System.out.println("'" + ansUserOper + "' is wrong answer ;(. Correct answer was '" +
                                resultMathOperation + "'.");
                        System.out.println("Let's try again," + "userName" + "!");
                        break;
                    }
                }
                break;
            case 4:
                int firstNum = 100, secondNum = 50;
                int resultOperGCD = eng.gcd(firstNum, secondNum);
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
                int counterInputUserThree = 0;
                while (in.hasNextLine()) {
                    if (counterInputUserThree == 3) {
                        System.out.println("Congratulations, " + "secondPlayerName" + "!");
                        break;
                    }
                    eng.GuessNumArithmProgres(counterInputUserThree, curUserName);
                    int minValue = 1;
                    int maxValue = 100;
                    int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    int minValueDiff = 1;
                    int maxValueDiff = 10;
                    int randomValueDiff = minValueDiff + (int) (Math.random() * (maxValueDiff - minValueDiff + 1));
                    int minCountNum = 5;
                    int maxCountNum = 20;
                    int randomCountNum = minCountNum + (int) (Math.random() * (maxCountNum - minCountNum + 1));
                    int[] arrArifmProgr = new int[randomCountNum];
                    for(int ind = 0; ind < randomCountNum; ++ind) {
                        arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
                    }
                    int minIndValRepl = 6;
                    int maxIndValRepl = randomCountNum - 1;
                    int randIndValRepl = minIndValRepl + (int) (Math.random() * (maxIndValRepl - minIndValRepl + 1));
                    System.out.println("Question: ");
                    for(int ind = 0; ind < randomCountNum; ++ind) {
                        if(ind == randIndValRepl) {
                            System.out.println("..");
                        } else {
                            System.out.println(arrArifmProgr[ind]);
                        }
                    }
                    Scanner inputUser = new Scanner(System.in);
                    int ansUserValue = inputUser.nextInt();
                    System.out.println("Your answer: " + ansUserValue);
                    if (arrArifmProgr[randIndValRepl] == ansUserValue) {
                        System.out.println("Correct!");
                        ++counterInputUserThree;
                    } else {
                        System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
                                + arrArifmProgr[randIndValRepl] + "'.");
                        System.out.println("Let's try again, " + "secondPlayerName" + "!");
                        break;
                    }
                }
                break;
            case 6:
                int testNum = 36; boolean numIsSimple;
                numIsSimple = eng.valIsSimple(testNum);
                break;
            default:
                System.out.println("Error input!");
        }
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    //hexlet.code.Cli ; //Cli.askUser("");
}