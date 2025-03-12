package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static int gcd(int firstNum, int secondNum) {
        while (secondNum != 0) {
            firstNum %= secondNum;
            firstNum = firstNum ^ secondNum;
            secondNum = firstNum ^ secondNum;
            firstNum = firstNum ^ secondNum;
        }
        return firstNum;
    }
    public static void run() {
        String[][] outResultDataArray = new String[Engine.countAttempt][2];
        String[][] outResultAttemptAskAnswer = new String[Engine.countAttempt][2];
        outResultDataArray = initData();
        String strRuleGame = "Find the greatest common divisor of given numbers.\nQuestion: ";
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i][0] + " " + outResultDataArray[i][1];
        }
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = String.valueOf(
                    GCD.gcd(Integer.parseInt(outResultDataArray[i][0]), Integer.parseInt(outResultDataArray[i][1]))
            );
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[][] initData() {
        String[][] outPrepareDataArray = new String[Engine.countAttempt][2];
        int minValue = 1;
        int maxValue = 100;
        for (int i = 0; i < Engine.countAttempt; i++) {
            for (int j = 0; j < 2; j++) {
                outPrepareDataArray[i][j] =String.valueOf(Utils.getRandomInt(minValue, maxValue));
            }
        }
        return outPrepareDataArray;
    }
}
