package hexlet.code.games;

import hexlet.code.Engine;

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
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        outPrepareDataArray[0] = Engine.getAnsUserOneValue();
        outPrepareDataArray[1] = Engine.getAnsUserTwoValue();
        outPrepareDataArray[2] = "Empty String";
        return outPrepareDataArray;
    }
}
