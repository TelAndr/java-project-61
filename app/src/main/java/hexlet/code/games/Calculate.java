package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculate {
    public static int generateIntNumberValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
    public static int calcResultMathOperation(int randomValueFirst, int randomValueSecond, String simOper) {
        int resultMathOperation = 0;
        switch(simOper) {
            case "+":
                resultMathOperation = randomValueFirst + randomValueSecond;
                break;
            case "-":
                resultMathOperation = randomValueFirst - randomValueSecond;
                break;
            case "*":
                resultMathOperation = randomValueFirst * randomValueSecond;
                break;
        }
        return resultMathOperation;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = Utils.getRandomInt(minValue, maxValue); //generateIntNumberValue(minValue, maxValue);
        int randomValueSecond = Utils.getRandomInt(minValue, maxValue); //generateIntNumberValue(minValue, maxValue);
        char[] operators = {'+', '-', '*'};
        int i = Utils.getRandomInt(minValue, maxValue); //generateIntNumberValue(minVal, maxVal);
        String simOper = new String(new char[]{operators[i]});
        String[] outPrepareDataArray = new String[3];
        outPrepareDataArray[0] = String.valueOf(randomValueFirst);
        outPrepareDataArray[1] = simOper;
        outPrepareDataArray[2] = String.valueOf(randomValueSecond);
        return outPrepareDataArray;
    }
}
