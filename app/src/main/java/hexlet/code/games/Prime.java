package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

//public class CalculateSimpleNumber {
public class Prime {
    public static boolean valIsSimple(int inpNum) {
        int curNum, flag = 0;
        for(curNum = 2; curNum <= inpNum/2; ++curNum) {
            if(inpNum % curNum == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 0);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int ansUserOneValue = Engine.receiveResponseFromUser();
        outPrepareDataArray[0] = String.valueOf(ansUserOneValue);
        outPrepareDataArray[1] = "Empty string1";
        outPrepareDataArray[2] = "Empty string2";
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
}
