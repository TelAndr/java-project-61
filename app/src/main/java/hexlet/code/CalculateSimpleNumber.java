package hexlet.code;

public class CalculateSimpleNumber {
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
        System.out.println("Input positive integer number");
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue);
        System.out.println("You input next number:" + ansUserOneValue);
        outPrepareDataArray[0] = String.valueOf(ansUserOneValue);
        outPrepareDataArray[1] = "Empty string1";
        outPrepareDataArray[2] = "Empty string2";
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine curEng = new Engine();
        curEng.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static void calcSimpleNumber() {
        int testNum; boolean numIsSimple;
        System.out.println("Input positive integer number");
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue);
        testNum = ansUserOneValue;
        System.out.println("You input next number:" + ansUserOneValue);
        numIsSimple = valIsSimple(testNum);
        if(numIsSimple) {
            System.out.println("The input number is simple");
        } else {
            System.out.println("The input number is not simple");
        }
    }
}
