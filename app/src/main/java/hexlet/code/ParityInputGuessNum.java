package hexlet.code;

public class ParityInputGuessNum {
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
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public static int generateIntRandomValue() {
        int minValue = 1;
        int maxValue = 100;
        //int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return generateIntNumberValue(minValue, maxValue);
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine curEng = new Engine();
        curEng.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static String[] initData() {
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        String[] outPrepareDataArray = new String[3];
        //Engine curEng = new Engine();
        int randomValue = generateIntRandomValue();
        System.out.println(randomValue);
        outPrepareDataArray[0] = String.valueOf(randomValue);//String.valueOf(randomCountNum);
        outPrepareDataArray[1] = "Empty string1";//String.valueOf(randomValueFirst);
        outPrepareDataArray[2] = "Empty string2";//String.valueOf(randomValueDiff);
        return outPrepareDataArray;
    }
    public static boolean determParityInpGuessNum() {
        //System.out.println("YOU ARE IN ENGINE CLASS");
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        boolean isCorrectAnswer = false;
        //int minValue = 1;
        //int maxValue = 100;
        ///int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        //int randomValue = generateIntNumberValue(minValue, maxValue);
        int randomValue = generateIntRandomValue();
        System.out.println(randomValue);
        //System.out.println("Your answer:");
        //String strPlayerResponse = App.USER_INPUT.nextLine();
        //System.out.println(strPlayerResponse);
        Engine curEng = new Engine();
        curEng.pollUserResponse(randomValue);
//        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
//                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ) {
//            dispValidRespMes();
//            //System.out.println("Correct!");
//            isCorrectAnswer = true;
//        }
//        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
//                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ) {
//            dispInvalidRespMes("yes", "no", App.username);
//            //System.out.println(
//            //        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
//            //                "Let's try again, " + userName + "!"
//            //);
//            isCorrectAnswer = false;
//        }
        return isCorrectAnswer;
    }
}
