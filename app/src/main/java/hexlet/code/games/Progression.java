package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    //private static int randomNumFromArr;
    private static int[] arrRandomNumFromArr = new int[Engine.countAttempt];
    public static int getArrRandomNumFromArr(int ind) {
        return arrRandomNumFromArr[ind];
    }
    public static String[] generateArrayArifmProgress(int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        String[] arrArifmProgr = new String[randomCountNum];
        for (int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = String.valueOf(randomValueFirst + randomValueDiff * ind);
        }
        return arrArifmProgr;
    }
    public static String[][] initData() {
        int randomNumFromArr;
        int sizeArrAtt = Engine.countAttempt;
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = Utils.getRandomInt(minValue, maxValue);
        int[] arrRandomValueFirst = new int[sizeArrAtt];
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = Utils.getRandomInt(minValueDiff, maxValueDiff);
        int[] arrRandomValueDiff = new int[sizeArrAtt];
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = Utils.getRandomInt(minCountNum, maxCountNum);
        int[] arrRandomCountNum = new int[sizeArrAtt];
        String[][] outPrepareDataArray = new String[sizeArrAtt][2];
        int[] arrRandomNumFromArr = new int[sizeArrAtt];

        String strAskArifmProgr = new String();
        String[] arrStrAskArifmprogr = new String[sizeArrAtt];

        for (int i = 0; i < sizeArrAtt; i++) {
            arrRandomValueFirst[i] = Utils.getRandomInt(minValue, maxValue);
            arrRandomValueDiff[i] = Utils.getRandomInt(minValueDiff, maxValueDiff);
            arrRandomCountNum[i] = Utils.getRandomInt(minCountNum, maxCountNum);
            String[] arrArifmProgr = new String[arrRandomCountNum[i]];
            arrArifmProgr = generateArrayArifmProgress(arrRandomCountNum[i], arrRandomValueFirst[i],
                    arrRandomValueDiff[i]);
            int minIndValRepl = 1;
            int maxIndValRepl = arrRandomCountNum[i] - 1;
            int randIndValRepl = Utils.getRandomInt(minIndValRepl, maxIndValRepl);
            randomNumFromArr = Integer.parseInt(arrArifmProgr[randIndValRepl]);
            arrRandomNumFromArr[i] = randomNumFromArr;
            arrArifmProgr[randIndValRepl] = "..";
            strAskArifmProgr = String.join(" ", arrArifmProgr);
            arrStrAskArifmprogr[i] = strAskArifmProgr;
        }

        for (int i = 0; i < sizeArrAtt; i++) {
            outPrepareDataArray[i][0] = arrStrAskArifmprogr[i];
            outPrepareDataArray[i][1] = String.valueOf(arrRandomNumFromArr[i]);
        }
        return outPrepareDataArray;
    }
    public static void run() {
        String[][] outResultDataArray = new String[Engine.countAttempt][2];
        String[][] outResultAttemptAskAnswer = new String[Engine.countAttempt][2];
        outResultDataArray = initData();
        String strRuleGame = "What number is missing in the progression?";
        //String strRuleGame = "What number is missing in the progression?\nQuestion: ";
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i][0];
        }
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = outResultDataArray[i][1]; //String.valueOf(getArrRandomNumFromArr(i));
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
}
