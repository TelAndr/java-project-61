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
    public static boolean determParityInpGuessNum() {
        System.out.println("YOU ARE IN ENGINE CLASS");
        System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "Question:"
        );
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        //int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValue = generateIntNumberValue(minValue, maxValue);
        System.out.println(randomValue);
        System.out.println("Your answer:");
        String strPlayerResponse = App.USER_INPUT.nextLine();
        System.out.println(strPlayerResponse);
        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ) {
            dispValidRespMes();
            //System.out.println("Correct!");
            isCorrectAnswer = true;
        }
        if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
                (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ) {
            dispInvalidRespMes("yes", "no", App.username);
            //System.out.println(
            //        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
            //                "Let's try again, " + userName + "!"
            //);
            isCorrectAnswer = false;
        }
        return isCorrectAnswer;
    }
}
