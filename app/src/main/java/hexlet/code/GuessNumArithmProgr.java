package hexlet.code;

public class GuessNumArithmProgr {
    public static void dispValidRespMes() {
        System.out.println("Correct!");
    }
    public static void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
    }
    public static int generateIntNumberValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
    public static int[] generateArrayArifmProgress(int[] arrArifmProgr, int randomCountNum,
                                                   int randomValueFirst, int randomValueDiff) {
        //arrArifmProgr = new int[randomCountNum];
        for(int ind = 0; ind < randomCountNum; ++ind) {
            arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
        }
        return arrArifmProgr;
    }
    public static String[] initData() {
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        //int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        //int randomValueDiff = minValueDiff + (int) (Math.random() * (maxValueDiff - minValueDiff + 1));
        int randomValueDiff = generateIntNumberValue(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        //int randomCountNum = minCountNum + (int) (Math.random() * (maxCountNum - minCountNum + 1));
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
        //public static boolean GuessNumArithmProgres() {
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        //int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
        int minValueDiff = 1;
        int maxValueDiff = 10;
        //int randomValueDiff = minValueDiff + (int) (Math.random() * (maxValueDiff - minValueDiff + 1));
        int randomValueDiff = generateIntNumberValue(minValueDiff, maxValueDiff);
        int minCountNum = 5;
        int maxCountNum = 20;
        //int randomCountNum = minCountNum + (int) (Math.random() * (maxCountNum - minCountNum + 1));
        int randomCountNum = generateIntNumberValue(minCountNum, maxCountNum);

        int[] arrArifmProgr = new int[randomCountNum];
        //for(int ind = 0; ind < randomCountNum; ++ind) {
        //    arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
        //}
        arrArifmProgr = generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);
        int minIndValRepl = 6;
        int maxIndValRepl = randomCountNum - 1;
        //int randIndValRepl = minIndValRepl + (int) (Math.random() * (maxIndValRepl - minIndValRepl + 1));
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
//        int minValue = 1;
//        int maxValue = 100;
//        //int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
//        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
//        int minValueDiff = 1;
//        int maxValueDiff = 10;
//        //int randomValueDiff = minValueDiff + (int) (Math.random() * (maxValueDiff - minValueDiff + 1));
//        int randomValueDiff = generateIntNumberValue(minValueDiff, maxValueDiff);
//        int minCountNum = 5;
//        int maxCountNum = 20;
//        //int randomCountNum = minCountNum + (int) (Math.random() * (maxCountNum - minCountNum + 1));
//        int randomCountNum = generateIntNumberValue(minCountNum, maxCountNum);
//
//        int[] arrArifmProgr = new int[randomCountNum];
//        //for(int ind = 0; ind < randomCountNum; ++ind) {
//        //    arrArifmProgr[ind] = randomValueFirst + randomValueDiff*(ind - 1);
//        //}
//        arrArifmProgr = generateArrayArifmProgress(arrArifmProgr, randomCountNum, randomValueFirst, randomValueDiff);
//        int minIndValRepl = 6;
//        int maxIndValRepl = randomCountNum - 1;
//        //int randIndValRepl = minIndValRepl + (int) (Math.random() * (maxIndValRepl - minIndValRepl + 1));
//        int randIndValRepl = generateIntNumberValue(minIndValRepl, maxIndValRepl);
//        System.out.println("Question: ");
//        for(int ind = 0; ind < randomCountNum; ++ind) {
//            if(ind == randIndValRepl) {
//                System.out.print(".." + "\t");
//            } else {
//                System.out.print(arrArifmProgr[ind] + "\t");
//            }
//        }
//        System.out.println();
        int valFromArifmProgr = buildValFromArrayArifmProgress();
        Engine curEng = new Engine();
        curEng.arifmProgrUserInput(valFromArifmProgr);
//        //Scanner inputUser = new Scanner(System.in);
//        String strAnsUserValue = App.USER_INPUT.nextLine();
//        int ansUserValue = Integer.parseInt(strAnsUserValue); //inputUser.nextInt();
//        System.out.println("Your answer: " + ansUserValue);
//        if (arrArifmProgr[randIndValRepl] == ansUserValue) {
//            dispValidRespMes();
//            //System.out.println("Correct!");
//            isCorrectAnswer = true;
//        } else {
//            dispInvalidRespMes(String.valueOf(ansUserValue), String.valueOf(arrArifmProgr[randIndValRepl]), App.username);
//            //System.out.println("'" + ansUserValue + "' is wrong answer ;(. Correct answer was '"
//            //        + arrArifmProgr[randIndValRepl] + "'.");
//            //System.out.println("Let's try again, " + "secondPlayerName" + "!");
//            //return;
//            isCorrectAnswer = false;
//        }
        return isCorrectAnswer;
    }
}
