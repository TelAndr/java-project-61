package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Parity;
import hexlet.code.games.Prime;

public class Engine {
    public static void dispValidRespMes() {
        System.out.println("Correct!");
    }

    public static void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
    }
    public static void prepareCalcNumValUserResponce(int numGame, String[] inputStringArray) {
        int resultMathOperation = 0;
        int numInpIter = 3;
        int counterInputUser = 0;
        int ansUserOneValue;
        boolean isCorrectAnswer = false, numIsSimple = false;
        int firstVal, secondVal;
        String operation, controlAnwer, strAskArifmProgr, strControlAnswerPrime;
        int randomCountNum, randomValueFirst, randomValueDiff;
        String[][] strCorrectAnswer = new String[6][2];
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!");
                return;
            }
            if (counterInputUser > 0) {
                switch(numGame) {
                    case 2:
                        //System.out.println(
                        //        "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        //                "Question:"
                        //);
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        //System.out.println(firstVal);
                        strCorrectAnswer[1][0] = "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                                "Question:\n" + String.valueOf(firstVal);
                                System.out.println("Your answer:");
                        String strPlayerResponse = App.USER_INPUT.nextLine();
                        System.out.println(strPlayerResponse);
                        if(Parity.isParity(firstVal)) {
                            controlAnwer = "Yes";
                        } else {
                            controlAnwer = "No";
                        }
                        strCorrectAnswer[1][1] = controlAnwer;
                        //if ((Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                        //        (!Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No"))) {
                        //    dispValidRespMes();
                        //}
                        //if ((Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No")) ||
                        //        (!Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes"))) {
                        //    dispInvalidRespMes("yes", "no", App.username);
                        //}
                        break;
                    case 3:
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        operation = inputStringArray[1];
                        secondVal = Integer.parseInt(inputStringArray[2]);
                        resultMathOperation = Calculate.calcResultMathOperation(firstVal,
                                secondVal, operation);
                        strCorrectAnswer[2][0] = "Question: " + firstVal + " " + operation + " " + secondVal;
                        //System.out.println("Question: " + firstVal + " " + operation + " " + secondVal);
                        strCorrectAnswer[2][1] = String.valueOf(resultMathOperation);
                        //System.out.println(resultMathOperation);
                        break;
                    case 5:
                        randomCountNum = Integer.parseInt(inputStringArray[0]);
                        randomValueFirst = Integer.parseInt(inputStringArray[1]);
                        randomValueDiff = Integer.parseInt(inputStringArray[2]);
                        int[] arrArifmProgr = new int[randomCountNum];
                        arrArifmProgr = Progression.generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);
                        int minIndValRepl = 6;
                        int maxIndValRepl = randomCountNum - 1;
                        int randIndValRepl = Progression.generateIntNumberValue(minIndValRepl, maxIndValRepl);
                        resultMathOperation = arrArifmProgr[randIndValRepl];
                        strAskArifmProgr = "Question: ";
                        //System.out.println("Question: ");
                        for(int ind = 0; ind < randomCountNum; ++ind) {
                            if(ind == randIndValRepl) {
                                strAskArifmProgr += ".." + "\t";
                                //System.out.print(".." + "\t");
                            } else {
                                strAskArifmProgr += "\t";
                                //System.out.print(arrArifmProgr[ind] + "\t");
                            }
                        }
                        strCorrectAnswer[4][0] = strAskArifmProgr;
                        strCorrectAnswer[4][1] = String.valueOf(resultMathOperation);
                        System.out.println();
                        break;
                    case 6:
                        ansUserOneValue = Integer.parseInt(inputStringArray[0]);
                        numIsSimple = Prime.valIsSimple(ansUserOneValue);
                        if(numIsSimple) {
                            strControlAnswerPrime = "The input number is simple";
                            //System.out.println("The input number is simple");
                        } else {
                            strControlAnswerPrime = "The input number is not simple";
                            //System.out.println("The input number is not simple");
                        }
                        strCorrectAnswer[5][0] = "The input number is simple?";
                        strCorrectAnswer[5][1] = strControlAnswerPrime;
                        break;
                }
            }
            for (int iGame = 0; iGame < 6; ++iGame) {
               System.out.println(strCorrectAnswer[iGame][0]);
                String strAnsUserOper = App.USER_INPUT.nextLine();
                int ansUserOper = Integer.parseInt(strAnsUserOper);
                System.out.println("Your answer: " + ansUserOper);
                //if (resultMathOperation == ansUserOper) {
                if (strCorrectAnswer[iGame][1].equalsIgnoreCase(String.valueOf(ansUserOper))) {
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
    }
    public static void userInteractWithCalcGCD() {
        int firstNum, secondNum; // 100, 50
        System.out.println("Input first positive integer number");
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserOneNumber.nextInt();
        firstNum = ansUserOneValue;
        System.out.println("You input next one number:" + ansUserOneValue);

        System.out.println("Input second positive integer number");
        String strAnsUserTwoValue = App.USER_INPUT.nextLine();
        int ansUserTwoValue = Integer.parseInt(strAnsUserTwoValue); //inputUserTwoNumber.nextInt();
        secondNum = ansUserTwoValue;
        System.out.println("You input next two number:" + ansUserTwoValue);
        int resultOperGCD = GCD.gcd(firstNum, secondNum);
        System.out.println("The greatest common divisor is " + resultOperGCD);
    }
    public static int receiveResponseFromUser() {
        String[] outPrepareDataArray = new String[3];
        System.out.println("Input positive integer number");
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue);
        System.out.println("You input next number:" + ansUserOneValue);
        return ansUserOneValue;
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
}
