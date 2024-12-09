package hexlet.code.games;

import hexlet.code.Engine;

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
        Engine curEng = new Engine();
        curEng.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        String[] outPrepareDataArray = new String[3];
        //Engine curEng = new Engine();
        int randomValue = generateIntRandomValue();
        System.out.println(randomValue);
        outPrepareDataArray[0] = String.valueOf(randomValue);
        outPrepareDataArray[1] = "Empty string1";
        outPrepareDataArray[2] = "Empty string2";
        return outPrepareDataArray;
    }
}
