package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static void run() {
        //int countAttempt = 3;
        String[] outResultDataArray = new String[Engine.getCountAttempt()];
        String[][] outResultAttemptAskAnswer = new String[Engine.getCountAttempt()][2];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        //String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: ";
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i];
        }
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][1] = isParity(Integer.parseInt(outResultDataArray[i])) ? "Yes" : "No";
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[] initData() {
        final int minValue = 1;
        final int maxValue = 100;
        String[] outDataToTransfer = new String[Engine.getCountAttempt()];
        int[] randomValueAttempt = new int[Engine.getCountAttempt()];
        for (int iAtt = 0; iAtt < Engine.getCountAttempt(); ++iAtt) {
            randomValueAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
        }
        //int randomValueFirstAttempt = Utils.getRandomInt(1, 100);
        //int randomValueSecondAttempt = Utils.getRandomInt(1, 100);
        //int randomValueThirdAttempt = Utils.getRandomInt(1, 100);
        for (int iAtt = 0; iAtt < Engine.getCountAttempt(); ++iAtt) {
            outDataToTransfer[iAtt] = String.valueOf(randomValueAttempt[iAtt]);
        }
        //outDataToTransfer[0] = String.valueOf(randomValueFirstAttempt);
        //outDataToTransfer[1] = String.valueOf(randomValueSecondAttempt);
        //outDataToTransfer[2] = String.valueOf(randomValueThirdAttempt);
        return outDataToTransfer;
    }
}
