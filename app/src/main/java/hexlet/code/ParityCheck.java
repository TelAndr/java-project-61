package hexlet.code;

import java.util.Scanner;

public class ParityCheck {
    public void detectUserName() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Welcome to the Brain Games!\n" +
                        "May I have your name?"
        );
        String playerName = in.nextLine();
        System.out.println(playerName + "\n");
        System.out.println("Hello, " + playerName + "!");
    }
    public static boolean isParity(int curNum) {
        return curNum % 2 == 0;
    }
    public void determParityGuessNum() {
        int counterInputUser = 0;
        Scanner in = new Scanner(System.in);
        String secondPlayerName = in.nextLine();
        while (in.hasNextLine()) {
            if (counterInputUser == 3) {
                System.out.println("Congratulations, " + secondPlayerName + "!");
                break;
            }
            System.out.println(
                    "Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                            "Question:"
            );
            int minValue = 1;
            int maxValue = 100;
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            System.out.println(randomValue);
            System.out.println("Your answer:");
            String strPlayerResponse = in.nextLine();
            System.out.println(strPlayerResponse);
            if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ||
                    (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ) {
                System.out.println("Correct!");
                ++counterInputUser;
            }
            if ((isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("No")) ||
                    (!isParity(randomValue) && strPlayerResponse.equalsIgnoreCase("Yes")) ) {
                System.out.println(
                        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                "Let's try again, Bill!"
                );
                break;
            }
        }
    }
}
