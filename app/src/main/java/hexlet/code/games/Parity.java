package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static int generateIntNumberValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static int generateIntRandomValue() {
        int minValue = 1;
        int maxValue = 100;
        return Utils.getRandomInt(minValue, maxValue); //generateIntNumberValue(minValue, maxValue);
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int randomValue = generateIntRandomValue();
        outPrepareDataArray[0] = String.valueOf(randomValue);
        outPrepareDataArray[1] = "Empty string1";
        outPrepareDataArray[2] = "Empty string2";
        return outPrepareDataArray;
    }
}
