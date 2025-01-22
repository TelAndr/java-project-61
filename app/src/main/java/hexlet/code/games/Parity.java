package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static String strAnsParity(boolean Parity) { return (Parity)? "Yes": "No";   }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int randomValue = Utils.getRandomInt(1, 100);
        outPrepareDataArray[0] = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
        outPrepareDataArray[1] = "Question:\n";
        outPrepareDataArray[2] = String.valueOf(randomValue);
        return outPrepareDataArray;
    }
}
