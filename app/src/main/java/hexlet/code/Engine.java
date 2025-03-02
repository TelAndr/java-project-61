package hexlet.code;

public class Engine {
    public static void dispValidRespMes() {
        System.out.println("Correct!");
    }

    public static void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
    }
    public static void prepareCalcNumValUserResponce(String[][] inputStringArray, String strRuleGame) {
        int numInpIter = 3;
        int counterInputUser = 0;
        String[][] strCorrectAnswer = new String[3][2];
        for (int iAttempt = 0; iAttempt < numInpIter; ++iAttempt) {
            strCorrectAnswer[iAttempt][0] = inputStringArray[iAttempt][0];
            strCorrectAnswer[iAttempt][1] = inputStringArray[iAttempt][1];
        }
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!");
                return;
            }
            if (counterInputUser > 0) {
                if (counterInputUser == 1) {
                    System.out.println(strRuleGame);
                }
                System.out.println(strCorrectAnswer[counterInputUser][0]);
                String strAnsUserOper = App.USER_INPUT.nextLine();
                System.out.println("Your answer: " + strAnsUserOper);
                if (strCorrectAnswer[counterInputUser][1].equalsIgnoreCase(strAnsUserOper)) {
                    dispValidRespMes();
                    counterInputUser++;
                } else {
                    dispInvalidRespMes(strAnsUserOper, strCorrectAnswer[counterInputUser][1], App.username);
                    return;
                }
            }
        }
    }
}
