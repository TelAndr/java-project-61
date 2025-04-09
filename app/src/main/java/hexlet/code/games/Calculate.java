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
        String[][] outResultDataArray = new String[Engine.countAttempt][3];
        String[][] outResultAttemptAskAnswer = new String[Engine.countAttempt][2];
        outResultDataArray = initData();
        String strRuleGame = "What is the result of the expression?\nQuestion: ";
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][0] = outResultDataArray[i][0] + " "
                    + outResultDataArray[i][1] + " " + outResultDataArray[i][2];
        }
        for (int i = 0; i < Engine.countAttempt; i++) {
            outResultAttemptAskAnswer[i][1] = String.valueOf(calcResultMathOperation(
                    Integer.parseInt(outResultDataArray[i][0]), Integer.parseInt(outResultDataArray[i][2]),
                    outResultDataArray[i][1]));
        }
        Engine.prepareCalcNumValUserResponce(outResultAttemptAskAnswer, strRuleGame);
    }
    public static String[][] initData() {
        int minValue = 1;
        int maxValue = 100;
        char[] operators = {'+', '-', '*'};
        String[][] outDataToTransfer = new String[Engine.countAttempt][3];
        int[] arrRandomValueFirstAttempt = new int[Engine.countAttempt];
        int[] arrRandomValueSecondAttempt = new int[Engine.countAttempt];
        int[] arrIndAttempt = new int[Engine.countAttempt];
        for (int iAtt = 0; iAtt < Engine.countAttempt; iAtt++) {
            arrRandomValueFirstAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
            arrRandomValueSecondAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
            arrIndAttempt[iAtt] = Utils.getRandomInt(minValue, maxValue);
        }
        String[] arrSimOper = new String[Engine.countAttempt];
        for (int iAtt = 0; iAtt < Engine.countAttempt; iAtt++) {
            arrSimOper[iAtt] = new String(new char[]{operators[arrIndAttempt[iAtt]]});
        }
        for (int iAtt = 0; iAtt < Engine.countAttempt; iAtt++) {
            outDataToTransfer[iAtt][0] = String.valueOf(arrRandomValueFirstAttempt[iAtt]);
            outDataToTransfer[iAtt][1] = arrSimOper[iAtt];
            outDataToTransfer[iAtt][2] = String.valueOf(arrRandomValueSecondAttempt[iAtt]);
        }
        return outDataToTransfer;
    }
}
