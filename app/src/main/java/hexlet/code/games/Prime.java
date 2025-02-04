package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static boolean valIsSimple(int inpNum) {
        int curNum, flag = 0;
        for(curNum = 2; curNum <= Math.sqrt(inpNum); ++curNum) {   // inpNum/2
            if(inpNum % curNum == 0) {
                flag = 1;
                break;
            }
        }
        return (flag == 0);
    }
    public static String strAnsPrime(boolean Prime) { return (Prime)? "Yes": "No";   }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int minValue = 1;
        int maxValue = 100;
        outPrepareDataArray[0] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        outPrepareDataArray[1] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        outPrepareDataArray[2] = String.valueOf(Utils.getRandomInt(minValue, maxValue));
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        String strRuleGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\nQuestion: ";
        Engine.prepareCalcNumValUserResponce(outResultDataArray, strRuleGame);
    }
}
