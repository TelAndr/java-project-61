package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.Progression;
import hexlet.code.games.Parity;

public class Engine {
    public void dispValidRespMes() {
        System.out.println("Correct!");
    }

    public void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
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
                System.out.println("Congratulations, " + App.username + "!");
                return;
            }
            if (counterInputUser > 0) {
                switch(numGame) {
                    case 2:
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        System.out.println("Your answer:");
                        String strPlayerResponse = App.USER_INPUT.nextLine();
                        System.out.println(strPlayerResponse);
                        if ((Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                                (!Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No"))) {
                            dispValidRespMes();
                        }
                        if ((Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("No")) ||
                                (!Parity.isParity(firstVal) && strPlayerResponse.equalsIgnoreCase("Yes"))) {
                            dispInvalidRespMes("yes", "no", App.username);
                        }
                        break;
                    case 3:
                        firstVal = Integer.parseInt(inputStringArray[0]);
                        operation = inputStringArray[1];
                        secondVal = Integer.parseInt(inputStringArray[2]);
                        resultMathOperation = Calculate.calcResultMathOperation(firstVal,
                                secondVal, operation);
                        System.out.println(resultMathOperation);
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
            String strAnsUserOper = App.USER_INPUT.nextLine();
            int ansUserOper = Integer.parseInt(strAnsUserOper);
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
