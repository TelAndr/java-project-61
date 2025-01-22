package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static int randomNumFromArr;
    public static int getRandomNumFromArr() {
        return randomNumFromArr;
    }
    public static int[] generateArrayArifmProgress(int[] arrArifmProgr, int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        for(int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
        }
        return arrArifmProgr;
    }
    public static String[] initData() {
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = Utils.getRandomInt(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = Utils.getRandomInt(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = Utils.getRandomInt(minCountNum, maxCountNum);
        String[] outPrepareDataArray = new String[3];

        int[] arrArifmProgr = new int[randomCountNum];
        arrArifmProgr = generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);   // resultMathOperation
        int minIndValRepl = 6;
        int maxIndValRepl = randomCountNum - 1;
        int randIndValRepl = Utils.getRandomInt(minIndValRepl, maxIndValRepl);
        randomNumFromArr = arrArifmProgr[randIndValRepl];
        String strAskArifmProgr = "Question: ";
        for(int ind = 0; ind < randomCountNum; ++ind) {
            if(ind == randIndValRepl) {
                strAskArifmProgr += ".." + "\t";
            } else {
                strAskArifmProgr += arrArifmProgr[ind] + "\t";
            }
        }

        outPrepareDataArray[0] = strAskArifmProgr; //String.valueOf(randomCountNum);
        outPrepareDataArray[1] = String.valueOf(randomNumFromArr); //String.valueOf(randomValueFirst);
        outPrepareDataArray[2] = String.valueOf(randomNumFromArr); //String.valueOf(randomValueDiff);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
}
