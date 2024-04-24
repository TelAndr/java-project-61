package hexlet.code;

public class CalculationTwoNumValue {
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
    public static int calcResultMathOperation(int randomValueFirst, int randomValueSecond, String simOper) {
        int resultMathOperation = 0;
        switch(simOper) {
            case "+":
                resultMathOperation = randomValueFirst + randomValueSecond;
                break;
            case "*":
                resultMathOperation = randomValueFirst * randomValueSecond;
                break;
        }
        return resultMathOperation;
    }
    public static int getResultMathOperation()
    {
        //public static boolean calcTwoNumValue() {
        boolean isCorrectAnswer = false;
        int minValue = 1;
        int maxValue = 100;
        //int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        //int randomValueSecond = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
        int randomValueSecond = generateIntNumberValue(minValue, maxValue);
        String[] operators = {"+", "*"};
        int minVal = 0;
        int maxVal = 1;
        //int i = minVal + (int) (Math.random() * (maxVal - minVal + 1));
        int i = generateIntNumberValue(minVal, maxVal);
        String simOper = operators[i];
        System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
        return calcResultMathOperation(randomValueFirst, randomValueSecond, simOper);
    }
    public static boolean calcTwoNumValue() {
        boolean isCorrectAnswer = false;
//        int minValue = 1;
//        int maxValue = 100;
//        //int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
//        //int randomValueSecond = minValue + (int) (Math.random() * (maxValue - minValue + 1));
//        int randomValueFirst = generateIntNumberValue(minValue, maxValue);
//        int randomValueSecond = generateIntNumberValue(minValue, maxValue);
//        String[] operators = {"+", "*"};
//        int minVal = 0;
//        int maxVal = 1;
//        //int i = minVal + (int) (Math.random() * (maxVal - minVal + 1));
//        int i = generateIntNumberValue(minVal, maxVal);
//        String simOper = operators[i];
//        int resultMathOperation = calcResultMathOperation(randomValueFirst, randomValueSecond, simOper);
        //int resultMathOperation = 0;
        int resultMathOperation = getResultMathOperation();
        Engine curEng = new Engine();
        curEng.calcNumValueUserResponse(resultMathOperation);
        //switch(simOper) {
        //    case "+":
        //        resultMathOperation = randomValueFirst + randomValueSecond;
        //        break;
        //    case "*":
        //        resultMathOperation = randomValueFirst * randomValueSecond;
        //        break;
        //}
//        System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
//        String strAnsUserOper = App.USER_INPUT.nextLine();
//        int ansUserOper = Integer.parseInt(strAnsUserOper); //input.nextInt();
//        System.out.println("Your answer: " + ansUserOper);
//        if(resultMathOperation == ansUserOper) {
//            dispValidRespMes();
//            isCorrectAnswer = true;
//        } else {
//            dispInvalidRespMes(String.valueOf(ansUserOper), String.valueOf(resultMathOperation), App.username);
//            isCorrectAnswer = false;
//        }
//        //}
        return isCorrectAnswer;
    }
}
