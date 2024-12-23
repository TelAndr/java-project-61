package hexlet.code.games;

import hexlet.code.App;

public class GCD {
    public static int gcd(int firstNum, int secondNum) {
        while (secondNum != 0) {
            firstNum %= secondNum;
            firstNum = firstNum ^ secondNum;
            secondNum = firstNum ^ secondNum;
            firstNum = firstNum ^ secondNum;
        }
        return firstNum;
    }
}
