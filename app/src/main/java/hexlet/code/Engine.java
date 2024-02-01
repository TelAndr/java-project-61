package hexlet.code;

import java.util.Scanner;

public class Engine {
    public void calcTwoNumValue () {
        int counterInputUserSec = 0;
        System.out.println("What is the result of the expression?");
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            if (counterInputUserSec == 3) {
                System.out.println("Congratulations, " + "secondPlayerName" + "!");
                break;
            }
            int minValue = 1;
            int maxValue = 100;
            int randomValueFirst = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int randomValueSecond = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String[] operators = {"+", "*"};
            //Random random = new Random();
            int minVal = 0;
            int maxVal = 1;
            int i = minVal + (int) (Math.random() * (maxVal - minVal + 1));
            String simOper = operators[i];
            int resultMathOperation = 0;
            switch(simOper) {
                case "+":
                    resultMathOperation = randomValueFirst + randomValueSecond;
                    break;
                case "*":
                    resultMathOperation = randomValueFirst * randomValueSecond;
                    break;
            }
            System.out.println("Question: " + randomValueFirst + " " + simOper + " " + randomValueSecond);
            Scanner input = new Scanner(System.in);
            int ansUserOper = input.nextInt();
            System.out.println("Your answer: " + ansUserOper);
            if(resultMathOperation == ansUserOper) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + ansUserOper + "' is wrong answer ;(. Correct answer was '" +
                        resultMathOperation + "'.");
                System.out.println("Let's try again," + "userName" + "!");
                break;
            }
        }
    }
}
