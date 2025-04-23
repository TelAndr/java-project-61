package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static boolean valIsSimple(int inpNum) {
        int curNum;
        int flag = 0;
        for (curNum = 2; curNum <= Math.sqrt(inpNum); ++curNum) {
            if (inpNum % curNum == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 0);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[Engine.getCountAttempt()];
        final int minValue = 1;
        final int maxValue = 100;
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outPrepareDataArray[i] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        }
        return outPrepareDataArray;
    }
    public static void run() {
        String[] outResultDataArray = new String[Engine.getCountAttempt()];
        String[][] outResultAttemptAskAnswer = new String[Engine.getCountAttempt()][2];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        //String strRuleGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\nQuestion: ";
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i];
        }
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][1] = valIsSimple(Integer.parseInt(outResultDataArray[i])) ? "Yes" : "No";
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
}
