package hexlet.code.games;

import hexlet.code.Engine;

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
    public static String strAnsPrime(boolean Prime) { return (Prime)? "Yes": "No";   }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        int ansUserOneValue = Engine.receiveResponseFromUser();
        outPrepareDataArray[0] = String.valueOf(ansUserOneValue);
        outPrepareDataArray[1] = String.valueOf(ansUserOneValue);
        outPrepareDataArray[2] = String.valueOf(ansUserOneValue);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
}
