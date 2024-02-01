package hexlet.code;

import java.util.Scanner;

public class Engine {
    public String detectUserName() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Welcome to the Brain Games!\n" +
                        "May I have your name?"
        );
        String playerName = in.nextLine();
        System.out.println(playerName + "\n");
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
    public void countNumCorrectAns(Scanner inpVal, int counterInputUser, String playerName) {
        while (inpVal.hasNextLine()) {
            if (counterInputUser == 3) {
                System.out.println("Congratulations, " + playerName + "!");
                return;
            }
            //
        }
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public void determParityInpGuessNum(Scanner inpVal, int counterInputUser) {
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println(randomValue);
        System.out.println("Your answer:");
        String strPlayerResponse = inpVal.nextLine();
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
            return;
        }
    }
    public void calcTwoNumValue() {
        int counterInputUserSec = 0;
        System.out.println("What is the result of the expression?");
        Scanner in = new Scanner(System.in);
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
    }
    public int gcd(int firstNum, int secondNum) {
        while (secondNum != 0) {
            firstNum %= secondNum;
            firstNum ^= secondNum ^= firstNum ^= secondNum; //swap
        }
    return firstNum;
    }
    public void GuessNumArithmProgres(int counterInputUser) {
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
            ++counterInputUser;
        } else {
            System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
                    + arrArifmProgr[randIndValRepl] + "'.");
            System.out.println("Let's try again, " + "secondPlayerName" + "!");
            return;
        }
    }
    public boolean valIsSimple(int inpNum) {
        int curNum, flag = 0;
        for(curNum = 2; curNum <= inpNum/2; ++curNum) {
            if(inpNum % curNum == 0) {
                flag = 1;
                break;
            }
        }
        // condition for nonprime number
        if (flag == 0) {
            return true;
        }
        else {
            return false;
       }
    }
}
