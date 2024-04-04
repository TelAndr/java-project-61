package hexlet.code;

public class CalculationGCD {
    public static int gcd(int firstNum, int secondNum) {
        while (secondNum != 0) {
            firstNum %= secondNum;
            //firstNum ^= secondNum ^= firstNum ^= secondNum; //swap
            firstNum = firstNum ^ secondNum;
            secondNum = firstNum ^ secondNum;
            firstNum = firstNum ^ secondNum;
        }
        return firstNum;
    }
    public static void calc_gcd() {
        int firstNum, secondNum; // 100, 50
        System.out.println("Input first positive integer number");
        //Scanner inputUserOneNumber = new Scanner(System.in);
        String strAnsUserOneValue = App.USER_INPUT.nextLine();
        int ansUserOneValue = Integer.parseInt(strAnsUserOneValue); //inputUserOneNumber.nextInt();
        firstNum = ansUserOneValue;
        System.out.println("You input next one number:" + ansUserOneValue);

        System.out.println("Input second positive integer number");
        //Scanner inputUserTwoNumber = new Scanner(System.in);
        String strAnsUserTwoValue = App.USER_INPUT.nextLine();
        int ansUserTwoValue = Integer.parseInt(strAnsUserTwoValue); //inputUserTwoNumber.nextInt();
        secondNum = ansUserTwoValue;
        System.out.println("You input next two number:" + ansUserTwoValue);
        int resultOperGCD = gcd(firstNum, secondNum);
        System.out.println("The greatest common divisor is " + resultOperGCD);
    }
}
