package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static void run() {
        //int countAttempt = 3;
        String[] outResultDataArray = new String[Engine.countAttempt];
        String[][] outResultAttemptAskAnswer = new String[Engine.countAttempt][2];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        //String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: ";
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i];
        }
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = isParity(Integer.parseInt(outResultDataArray[i])) ? "Yes" : "No";
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[] initData() {
        String[] outDataToTransfer = new String[Engine.countAttempt];
        int[] randomValueAttempt = new int[Engine.countAttempt];
        for (int iAtt = 0; iAtt < Engine.countAttempt; ++iAtt) {
            randomValueAttempt[iAtt] = Utils.getRandomInt(1, 100);
        }
        //int randomValueFirstAttempt = Utils.getRandomInt(1, 100);
        //int randomValueSecondAttempt = Utils.getRandomInt(1, 100);
        //int randomValueThirdAttempt = Utils.getRandomInt(1, 100);
        for (int iAtt = 0; iAtt < Engine.countAttempt; ++iAtt) {
            outDataToTransfer[iAtt] = String.valueOf(randomValueAttempt[iAtt]);
        }
        //outDataToTransfer[0] = String.valueOf(randomValueFirstAttempt);
        //outDataToTransfer[1] = String.valueOf(randomValueSecondAttempt);
        //outDataToTransfer[2] = String.valueOf(randomValueThirdAttempt);
        return outDataToTransfer;
    }
}
