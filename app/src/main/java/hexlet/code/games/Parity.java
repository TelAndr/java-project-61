package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static void prepareData() {
        int countAttempt = 3;
        String[] outResultDataArray = new String[3];
        String[][] outResultAttemptAskAnswer = new String[3][2];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: ";
        for (int i = 0; i < countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i];
        }
        for (int i = 0; i < countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = isParity(Integer.parseInt(outResultDataArray[i])) ? "Yes" : "No";
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[] initData() {
        String[] outDataToTransfer = new String[3];
        int randomValueFirstAttempt = Utils.getRandomInt(1, 100);
        int randomValueSecondAttempt = Utils.getRandomInt(1, 100);
        int randomValueThirdAttempt = Utils.getRandomInt(1, 100);
        outDataToTransfer[0] = String.valueOf(randomValueFirstAttempt);
        outDataToTransfer[1] = String.valueOf(randomValueSecondAttempt);
        outDataToTransfer[2] = String.valueOf(randomValueThirdAttempt);
        return outDataToTransfer;
    }
}
