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
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        String strRuleGame = "Find the greatest common divisor of given numbers.\nQuestion: ";
        Engine.prepareCalcNumValUserResponce(outResultDataArray, strRuleGame);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int minValue = 1;
        int maxValue = 100;
        outPrepareDataArray[0] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        outPrepareDataArray[1] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        outPrepareDataArray[2] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        return outPrepareDataArray;
    }
}
