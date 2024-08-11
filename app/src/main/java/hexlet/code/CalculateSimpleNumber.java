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
        // condition for nonprime number
        return (flag == 0);
    }
    public static String[] initData() {
        String[] outPrepareDataArray = new String[3];
        System.out.println("Input positive integer number");
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserNumber.nextInt();
        System.out.println("You input next number:" + ansUserOneValue);
        outPrepareDataArray[0] = String.valueOf(ansUserOneValue);//String.valueOf(randomCountNum);
        outPrepareDataArray[1] = "Empty string1";//String.valueOf(randomValueFirst);
        outPrepareDataArray[2] = "Empty string2";//String.valueOf(randomValueDiff);
        return outPrepareDataArray;
    }
    public static void prepareData(int numGame) {
        String[] outResultDataArray = new String[3];
        outResultDataArray = initData();
        Engine curEng = new Engine();
        curEng.prepareCalcNumValUserResponce(numGame, outResultDataArray);
    }
    public static void calcSimpleNumber() {
        int testNum; boolean numIsSimple; // 36
        System.out.println("Input positive integer number");
        //Scanner inputUserNumber = new Scanner(System.in);
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserNumber.nextInt();
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
