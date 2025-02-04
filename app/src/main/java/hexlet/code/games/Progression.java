package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static int randomNumFromArr;
    public static int getRandomNumFromArr() {
        return randomNumFromArr;
    }
    public static String[] generateArrayArifmProgress(String[] arrArifmProgr, int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        for(int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = String.valueOf(randomValueFirst + randomValueDiff*(ind - 1));
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

        String[] arrArifmProgr = new String[randomCountNum];
        arrArifmProgr = generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);   // resultMathOperation
        int minIndValRepl = 6;
        int maxIndValRepl = randomCountNum - 1;
        int randIndValRepl = Utils.getRandomInt(minIndValRepl, maxIndValRepl);
        randomNumFromArr = Integer.parseInt(arrArifmProgr[randIndValRepl]);
        arrArifmProgr[randIndValRepl] = "..";
        String strAskArifmProgr = String.join(" ", arrArifmProgr);

        outPrepareDataArray[0] = strAskArifmProgr;
        outPrepareDataArray[1] = String.valueOf(randomNumFromArr);
        outPrepareDataArray[2] = String.valueOf(randomNumFromArr);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        String strRuleGame = "What number is missing in the progression?\nQuestion: ";
        Engine.prepareCalcNumValUserResponce(outResultDataArray, strRuleGame);
    }
}
