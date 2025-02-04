package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: ";
        Engine.prepareCalcNumValUserResponce(outResultDataArray, strRuleGame);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int randomValue = Utils.getRandomInt(1, 100);
        outPrepareDataArray[0] = String.valueOf(randomValue);
        outPrepareDataArray[1] = String.valueOf(randomValue);
        outPrepareDataArray[2] = String.valueOf(randomValue);
        return outPrepareDataArray;
    }
}
