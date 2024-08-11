package hexlet.code;

import java.util.Scanner;

public class Engine {
    //private static String detectUserCurName;
    //public static String getCurUserName() {
    //    return detectUserCurName;
    //}
    public void pollUserResponse(int randomValue) {
        //ParityInputGuessNum.generateIntRandomValue();
        int numInpIter = 3;
        int counterInputUser = 0;
        boolean isCorrectAnswer = false;
        //String strPlayerResponse = App.USER_INPUT.nextLine();
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!"); // playerName
                return;
                //}
                //if(ParityInputGuessNum.determParityInpGuessNum()){
                //    counterInputUser++;
                //} else {
                //    return;
                //}
            }
            if (counterInputUser > 0) {
                randomValue = ParityInputGuessNum.generateIntRandomValue();
                System.out.println(randomValue);
            }
            System.out.println("Your answer:");
            String strPlayerResponse = App.USER_INPUT.nextLine();
            System.out.println(strPlayerResponse);
            if ((ParityInputGuessNum.isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                    (!ParityInputGuessNum.isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No"))) {
                dispValidRespMes();
                //System.out.println("Correct!");
                isCorrectAnswer = true;
                counterInputUser++;
            }
            if ((ParityInputGuessNum.isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
                    (!ParityInputGuessNum.isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes"))) {
                dispInvalidRespMes("yes", "no", App.username);
                //System.out.println(
                //        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                //                "Let's try again, " + userName + "!"
                //);
                isCorrectAnswer = false;
                return;
            }
        }
    }

    public void prepareCalcNumValUserResponce(int numGame, String[] inputStringArray) {
        int resultMathOperation = 0;
        int numInpIter = 3;
        int counterInputUser = 0;
        int ansUserOneValue;
        boolean isCorrectAnswer = false;
        int firstVal, secondVal;
        String operation;
        int randomCountNum, randomValueFirst, randomValueDiff;
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!"); // playerName
                return;
            }
            if (counterInputUser > 0) {
                switch(numGame) {
                    case 2:
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        System.out.println("Your answer:");
                        String strPlayerResponse = App.USER_INPUT.nextLine();
                        System.out.println(strPlayerResponse);
                        if ((ParityInputGuessNum.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                                (!ParityInputGuessNum.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No"))) {
                            dispValidRespMes();
                        }
                        if ((ParityInputGuessNum.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No")) ||
                                (!ParityInputGuessNum.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes"))) {
                            dispInvalidRespMes("yes", "no", App.username);
                        }
                        break;
                    case 3:
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        operation = inputStringArray[1];
                        secondVal = Integer.parseInt(inputStringArray[2]);
                        resultMathOperation = CalculationTwoNumValue.calcResultMathOperation(firstVal,
                                secondVal, operation);
                        System.out.println(resultMathOperation);
                        break;
                    case 5:
                        randomCountNum = Integer.parseInt(inputStringArray[0]);
                        randomValueFirst = Integer.parseInt(inputStringArray[1]);
                        randomValueDiff = Integer.parseInt(inputStringArray[2]);
                        int[] arrArifmProgr = new int[randomCountNum];
                        arrArifmProgr = GuessNumArithmProgr.generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);
                        int minIndValRepl = 6;
                        int maxIndValRepl = randomCountNum - 1;
                        //int randIndValRepl = minIndValRepl + (int) (Math.random() * (maxIndValRepl - minIndValRepl + 1));
                        int randIndValRepl = GuessNumArithmProgr.generateIntNumberValue(minIndValRepl, maxIndValRepl);
                        resultMathOperation = arrArifmProgr[randIndValRepl];
                        System.out.println("Question: ");
                        for(int ind = 0; ind < randomCountNum; ++ind) {
                            if(ind == randIndValRepl) {
                                System.out.print(".." + "\t");
                            } else {
                                System.out.print(arrArifmProgr[ind] + "\t");
                            }
                        }
                        System.out.println();
                        break;
                    case 6:
                        ansUserOneValue = Integer.parseInt(inputStringArray[0]);
                        break;
                }
            }
            //System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
            String strAnsUserOper = App.USER_INPUT.nextLine();
            int ansUserOper = Integer.parseInt(strAnsUserOper); //input.nextInt();
            System.out.println("Your answer: " + ansUserOper);
            if(resultMathOperation == ansUserOper) {
                dispValidRespMes();
                isCorrectAnswer = true;
                counterInputUser++;
            } else {
                dispInvalidRespMes(String.valueOf(ansUserOper), String.valueOf(resultMathOperation), App.username);
                isCorrectAnswer = false;
                return;
            }
        }
    }
    public void calcNumValueUserResponse(int resultMathOperation) {
        int numInpIter = 3;
        int counterInputUser = 0;
        boolean isCorrectAnswer = false;
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!"); // playerName
                return;
            }
            if (counterInputUser > 0) {
                resultMathOperation = CalculationTwoNumValue.getResultMathOperation();
                System.out.println(resultMathOperation);
            }
            //System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
            String strAnsUserOper = App.USER_INPUT.nextLine();
            int ansUserOper = Integer.parseInt(strAnsUserOper); //input.nextInt();
            System.out.println("Your answer: " + ansUserOper);
            if(resultMathOperation == ansUserOper) {
                dispValidRespMes();
                isCorrectAnswer = true;
                counterInputUser++;
            } else {
                dispInvalidRespMes(String.valueOf(ansUserOper), String.valueOf(resultMathOperation), App.username);
                isCorrectAnswer = false;
                return;
            }
        }
    }
    public void arifmProgrUserInput(int randValArifmProgress) {
        int numInpIter = 3;
        int counterInputUser = 0;
        boolean isCorrectAnswer = false;
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!"); // playerName
                return;
            }
            if (counterInputUser > 0) {
                int valFromArifmProgr = GuessNumArithmProgr.buildValFromArrayArifmProgress();
                System.out.println(valFromArifmProgr);
            }
            String strAnsUserValue = App.USER_INPUT.nextLine();
            int ansUserValue = Integer.parseInt(strAnsUserValue); //inputUser.nextInt();
            System.out.println("Your answer: " + ansUserValue);
            //if (arrArifmProgr[randIndValRepl] == ansUserValue) {
            if (randValArifmProgress == ansUserValue) {
                dispValidRespMes();
                //System.out.println("Correct!");
                isCorrectAnswer = true;
                counterInputUser++;
            } else {
                //dispInvalidRespMes(String.valueOf(ansUserValue), String.valueOf(arrArifmProgr[randIndValRepl]), App.username);
                dispInvalidRespMes(String.valueOf(ansUserValue), String.valueOf(randValArifmProgress), App.username);
                //System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
                //        + arrArifmProgr[randIndValRepl] + "'.");
                //System.out.println("Let's try again, " + "secondPlayerName" + "!");
                //return;
                isCorrectAnswer = false;
                return;
            }
        }
    }
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
        for (int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = randomValueFirst + randomValueDiff * (ind - 1);
        }
        int minIndValRepl = 6;
        int maxIndValRepl = randomCountNum - 1;
        int randIndValRepl = minIndValRepl + (int) (Math.random() * (maxIndValRepl - minIndValRepl + 1));
        System.out.println("Question: ");
        for (int ind = 0; ind < randomCountNum; ++ind) {
            if (ind == randIndValRepl) {
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
        }
        return isCorrectAnswer;

        //System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
        //        + arrArifmProgr[randIndValRepl] + "'.");
        //System.out.println("Let's try)
    }