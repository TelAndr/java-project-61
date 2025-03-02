package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static int randomNumFromArr;
    public static int getRandomNumFromArr() {
        return randomNumFromArr;
    }
    public static String[] generateArrayArifmProgress(int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        String[] arrArifmProgr = new String[randomCountNum];
        for(int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = String.valueOf(randomValueFirst + randomValueDiff*(ind - 1));
        }
        return arrArifmProgr;
    }
    public static String[][] initData() {
        int countAttempt = 3;
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = Utils.getRandomInt(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = Utils.getRandomInt(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = Utils.getRandomInt(minCountNum, maxCountNum);
        String[][] outPrepareDataArray = new String[3][2];
        int[] arrRandomNumFromArr = new int[3];

        String strAskArifmProgr = new String();
        String[] arrStrAskArifmprogr = new String[countAttempt];

        for (int i = 0; i < countAttempt; i++) {
            String[] arrArifmProgr = new String[randomCountNum];
            arrArifmProgr = generateArrayArifmProgress(randomCountNum, randomValueFirst, randomValueDiff);   // resultMathOperation
            int minIndValRepl = 6;
            int maxIndValRepl = randomCountNum - 1;
            int randIndValRepl = Utils.getRandomInt(minIndValRepl, maxIndValRepl);
            randomNumFromArr = Integer.parseInt(arrArifmProgr[randIndValRepl]);
            arrRandomNumFromArr[i] = randomNumFromArr;
            arrArifmProgr[randIndValRepl] = "..";
            strAskArifmProgr = String.join(" ", arrArifmProgr);
            arrStrAskArifmprogr[i] = strAskArifmProgr;
        }

        for (int i = 0; i < countAttempt; i++) {
            outPrepareDataArray[i][0] = arrStrAskArifmprogr[i];
            outPrepareDataArray[i][1] = String.valueOf(arrRandomNumFromArr[i]);
        }
        return outPrepareDataArray;
    }
    public static void prepareData() {
        int countAttempt = 3;
        String[][] outResultDataArray = new String[3][2];
        String[][] outResultAttemptAskAnswer = new String[3][2];
        outResultDataArray = initData();
        String strRuleGame = "What number is missing in the progression?\nQuestion: ";
        for (int i = 0; i < countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i][0] + outResultDataArray[i][1];
        }
        for (int i = 0; i < countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = String.valueOf(getRandomNumFromArr());
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
}
