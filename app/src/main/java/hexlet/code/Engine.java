package hexlet.code;

import java.util.Scanner;

public class Engine {
    //private static String detectUserCurName;
    //public static String getCurUserName() {
    //    return detectUserCurName;
    //}
    public String detectUserName() {
        //Scanner in = new Scanner(System.in);
        System.out.println(
                "Welcome to the Brain Games!\n" +
                        "May I have your name?"
        );
        String playerName = App.USER_INPUT.nextLine();
        //String playerName = in.nextLine();
        System.out.println(playerName + "\n");
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
    public void dispValidRespMes() {
        System.out.println("Correct!");
    }
    public void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
    }
    public void countNumCorrectAns(int counterInputUser, String playerName, int numGame) {
        int numInpIter = 3;
        while (true) { // inpVal.hasNextLine()
        //for (int iter = 0; iter < 10; ++iter) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!"); // playerName
                return;
            }
            switch(numGame) {
                case 2:
                    //if (determParityInpGuessNum()) {
                    if(ParityInputGuessNum.determParityInpGuessNum()){
                        counterInputUser++;
                    } else {
                        return;
                    }
                    break;
                case 3:
                     //if(calcTwoNumValue()) {
                    if(CalculationTwoNumValue.calcTwoNumValue()) {
                         counterInputUser++;
                     } else {
                         return;
                     }
                    break;
                case 4:
                    //calc_gcd();
                    CalculationGCD.calc_gcd();
                    break;
                case 5:
                    //if(GuessNumArithmProgres()) {
                    if(GuessNumArithmProgr.GuessNumArithmProgres()) {
                        counterInputUser++;
                    } else {
                        return;
                    }
                    break;
                case 6:
                    //calcSimpleNumber();
                    CalculateSimpleNumber.calcSimpleNumber();
                    break;
            }
        }
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public boolean determParityInpGuessNum() {
        System.out.println("YOU ARE IN ENGINE CLASS");
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println(randomValue);
        System.out.println("Your answer:");
        String strPlayerResponse = App.USER_INPUT.nextLine();
        System.out.println(strPlayerResponse);
        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ) {
            dispValidRespMes();
            //System.out.println("Correct!");
            isCorrectAnswer = true;
        }
        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ) {
            dispInvalidRespMes("yes", "no", App.username);
            //System.out.println(
            //        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
            //                "Let's try again, " + userName + "!"
            //);
            isCorrectAnswer = false;
        }
        return isCorrectAnswer;
    }
    public boolean calcTwoNumValue() {
        //int counterInputUserSec = 0;
        //System.out.println("What is the result of the expression?");
        //Scanner in = new Scanner(System.in);
        //while (in.hasNextLine()) {
        //    if (counterInputUserSec == 3) {
        //        System.out.println("Congratulations, " + "secondPlayerName" + "!");
        //        break;
        //    }
            boolean isCorrectAnswer = false;
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
            //Scanner input = new Scanner(System.in);
            String strAnsUserOper = App.USER_INPUT.nextLine();
            int ansUserOper = Integer.parseInt(strAnsUserOper); //input.nextInt();
            System.out.println("Your answer: " + ansUserOper);
            if(resultMathOperation == ansUserOper) {
                dispValidRespMes();
                //System.out.println("Correct!");
                isCorrectAnswer = true;
            } else {
                dispInvalidRespMes(String.valueOf(ansUserOper), String.valueOf(resultMathOperation), App.username);
                //System.out.println("'" + ansUserOper + "' is wrong answer ;(. Correct answer was '" +
                //        resultMathOperation + "'.");
                //System.out.println("Let's try again," + userName + "!");
                //return; //break;
                isCorrectAnswer = false;
            }
        //}
        return isCorrectAnswer;
    }
    public int gcd(int firstNum, int secondNum) {
        while (secondNum != 0) {
            firstNum %= secondNum;
            firstNum ^= secondNum ^= firstNum ^= secondNum; //swap
        }
    return firstNum;
    }

    public void calc_gcd() {
        int firstNum, secondNum; // 100, 50
        System.out.println("Input first positive integer number");
        //Scanner inputUserOneNumber = new Scanner(System.in);
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserOneNumber.nextInt();
        firstNum = ansUserOneValue;
        System.out.println("You input next one number:" + ansUserOneValue);

        System.out.println("Input second positive integer number");
        //Scanner inputUserTwoNumber = new Scanner(System.in);
        String strAnsUserTwoValue = App.USER_INPUT.nextLine();
        int ansUserTwoValue = Integer.parseInt(strAnsUserTwoValue); //inputUserTwoNumber.nextInt();
        secondNum = ansUserTwoValue;
        System.out.println("You input next two number:" + ansUserTwoValue);
        int resultOperGCD = gcd(firstNum, secondNum);
        System.out.println("The greatest common divisor is" + resultOperGCD);
    }
    public boolean GuessNumArithmProgres() {
        boolean isCorrectAnswer = false;
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
        //Scanner inputUser = new Scanner(System.in);
        String strAnsUserValue = App.USER_INPUT.nextLine();
        int ansUserValue = Integer.parseInt(strAnsUserValue); //inputUser.nextInt();
        System.out.println("Your answer: " + ansUserValue);
        if (arrArifmProgr[randIndValRepl] == ansUserValue) {
            dispValidRespMes();
            //System.out.println("Correct!");
            isCorrectAnswer = true;
        } else {
            dispInvalidRespMes(String.valueOf(ansUserValue), String.valueOf(arrArifmProgr[randIndValRepl]), App.username);
            //System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
            //        + arrArifmProgr[randIndValRepl] + "'.");
            //System.out.println("Let's try again, " + "secondPlayerName" + "!");
            //return;
            isCorrectAnswer = false;
        }
        return isCorrectAnswer;
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
        return (flag == 0);
        //if (flag == 0) {
        //    return true;
        //}
        //else {
        //    return false;
       //}
    }
    public void calcSimpleNumber() {
        int testNum; boolean numIsSimple; // 36
        System.out.println("Input positive integer number");
        //Scanner inputUserNumber = new Scanner(System.in);
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserNumber.nextInt();
        testNum = ansUserOneValue;
        System.out.println("You input next number:" + ansUserOneValue);
        numIsSimple = valIsSimple(testNum);
        if(numIsSimple) {
            System.out.println("The input number is simple");
        } else {
            System.out.println("The input number is not simple");
        }
    }
}

