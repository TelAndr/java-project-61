package hexlet.code;

public class GuessNumArithmProgr {
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
        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = generateIntNumberValue(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = generateIntNumberValue(minCountNum, maxCountNum);
        String[] outPrepareDataArray = new String[3];
        outPrepareDataArray[0] = String.valueOf(randomCountNum);
        outPrepareDataArray[1] = String.valueOf(randomValueFirst);
        outPrepareDataArray[2] = String.valueOf(randomValueDiff);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine curEng = new Engine();
        curEng.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static int buildValFromArrayArifmProgress() {
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        int randomValueDiff = generateIntNumberValue(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        int randomCountNum = generateIntNumberValue(minCountNum, maxCountNum);

        int[] arrArifmProgr = new int[randomCountNum];
        arrArifmProgr = generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);
        int minIndValRepl = 6;
        int maxIndValRepl = randomCountNum - 1;
        int randIndValRepl = generateIntNumberValue(minIndValRepl, maxIndValRepl);
        System.out.println("Question: ");
        for(int ind = 0; ind < randomCountNum; ++ind) {
            if(ind == randIndValRepl) {
                System.out.print(".." + "\t");
            } else {
                System.out.print(arrArifmProgr[ind] + "\t");
            }
        }
        System.out.println();
        return arrArifmProgr[randIndValRepl];
    }
    public static boolean GuessNumArithmProgres() {
        boolean isCorrectAnswer = false;
        int valFromArifmProgr = buildValFromArrayArifmProgress();
        Engine curEng = new Engine();
        curEng.arifmProgrUserInput(valFromArifmProgr);
        return isCorrectAnswer;
    }
}
