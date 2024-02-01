package hexlet.code;
import java.util.Scanner;
//import java.util.random.RandomGenerator;
//import hexlet.code.Cli;

public class App {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static void main(String[] args) {
        hexlet.code.Cli.askUser();
        System.out.println(
                "Please enter the game number and press Enter.\n" +
                "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" +
                "0 - Exit");
        Scanner in = new Scanner(System.in);
        int numGame = in.nextInt();
        System.out.println("Your choice:" + numGame);
        ParityCheck parCheck = new ParityCheck();
        switch(numGame) {
            case 0:
                //
                break;
            case 1:
                parCheck.detectUserName();
                System.out.println(
                        "Welcome to the Brain Games!\n" +
                                "May I have your name?"
                );
                String playerName = in.nextLine();
                System.out.println(playerName + "\n");
                System.out.println("Hello, " + playerName + "!");
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
                    } else {
                        System.out.println("'" + ansUserOper + "' is wrong answer ;(. Correct answer was '" +
                                resultMathOperation + "'.");
                        System.out.println("Let's try again," + "userName" + "!");
                        break;
                    }
                }
                break;
            case 4:
                //int gcd (int a, int b) {
                //while (b) {
                //    a %= b;
                //    swap (a, b);
                //}
                //return a;
                //}
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
                int counterInputUserThree = 0;
                while (in.hasNextLine()) {
                    if (counterInputUserThree == 3) {
                        System.out.println("Congratulations, " + "secondPlayerName" + "!");
                        break;
                    }
                    int minValue = 1;
                    int maxValue = 100;
                    int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    int minValueDiff = 1;
                    int maxValueDiff = 10;
                    int randomValueDiff = minValueDiff + (int) (Math.random() * (maxValueDiff - minValueDiff + 1));
                    int minCountNum = 5;
                    int maxCountNum = 15;
                    int randomCountNum = minCountNum + (int) (Math.random() * (maxCountNum - minCountNum + 1));
                    //int[randomCountNum] arrArifmProgr;
                    //int randomValueSecond = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                    //int diffFirstSecond = randomValueSecond - randomValueFirst;
                }
                break;
            default:
                System.out.println("Error input!");
        }
    }
    //hexlet.code.Cli ; //Cli.askUser("");
}