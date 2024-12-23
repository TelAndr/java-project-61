package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static int generateIntNumberValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
    public static int[] generateArrayArifmProgress(int[] arrArifmProgr, int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        for(int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
        }
        return arrArifmProgr;
    }
    public static String[] initData() {
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = Utils.getRandomInt(minValue, maxValue); //generateIntNumberValue(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = Utils.getRandomInt(minValueDiff, maxValueDiff); //generateIntNumberValue(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = Utils.getRandomInt(minCountNum, maxCountNum); //generateIntNumberValue(minCountNum, maxCountNum);
        String[] outPrepareDataArray = new String[3];
        outPrepareDataArray[0] = String.valueOf(randomCountNum);
        outPrepareDataArray[1] = String.valueOf(randomValueFirst);
        outPrepareDataArray[2] = String.valueOf(randomValueDiff);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
}
