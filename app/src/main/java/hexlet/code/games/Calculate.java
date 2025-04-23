package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculate {
    public static int calcResultMathOperation(int randomValueFirst, int randomValueSecond, String simOper) {
        int resultMathOperation = 0;
        switch (simOper) {
            case "+":
                resultMathOperation = randomValueFirst + randomValueSecond;
                break;
            case "-":
                resultMathOperation = randomValueFirst - randomValueSecond;
                break;
            case "*":
                resultMathOperation = randomValueFirst * randomValueSecond;
                break;
            default:
                resultMathOperation = 0;
        }
        return resultMathOperation;
    }
    public static void run() {
        final int countOperand = 3;
        String[][] outResultDataArray = new String[Engine.getCountAttempt()][countOperand];
        String[][] outResultAttemptAskAnswer = new String[Engine.getCountAttempt()][2];
        outResultDataArray = initData();
        //String strRuleGame = "What is the result of the expression?\nQuestion: ";
        String strRuleGame = "What is the result of the expression?";
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i][0] + " "
                    + outResultDataArray[i][1] + " " + outResultDataArray[i][2];
        }
        for (int i = 0; i < Engine.getCountAttempt(); i++) {
            outResultAttemptAskAnswer[i][1] = String.valueOf(calcResultMathOperation(
                    Integer.parseInt(outResultDataArray[i][0]), Integer.parseInt(outResultDataArray[i][2]),
                    outResultDataArray[i][1]));
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[][] initData() {
        final int countOperand = 3;
        final int minValue = 1;
        final int maxValue = 100;
        int minIndVal = 0;
        int maxIndVal = 2;
        char[] operators = {'+', '-', '*'};
        String[][] outDataToTransfer = new String[Engine.getCountAttempt()][countOperand];
        int[] arrRandomValueFirstAttempt = new int[Engine.getCountAttempt()];
        int[] arrRandomValueSecondAttempt = new int[Engine.getCountAttempt()];
        int[] arrIndAttempt = new int[Engine.getCountAttempt()];
        for (int iAtt = 0; iAtt < Engine.getCountAttempt(); iAtt++) {
            arrRandomValueFirstAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
            arrRandomValueSecondAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
            arrIndAttempt[iAtt] = Utils.getRandomInt(minIndVal, maxIndVal);
        }
        String[] arrSimOper = new String[Engine.getCountAttempt()];
        for (int iAtt = 0; iAtt < Engine.getCountAttempt(); iAtt++) {
            arrSimOper[iAtt] = new String(new char[]{operators[arrIndAttempt[iAtt]]});
        }
        for (int iAtt = 0; iAtt < Engine.getCountAttempt(); iAtt++) {
            outDataToTransfer[iAtt][0] = String.valueOf(arrRandomValueFirstAttempt[iAtt]);
            outDataToTransfer[iAtt][1] = arrSimOper[iAtt];
            outDataToTransfer[iAtt][2] = String.valueOf(arrRandomValueSecondAttempt[iAtt]);
        }
        return outDataToTransfer;
    }
}
