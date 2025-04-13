package hexlet.code;

public class Engine {
    public static int countAttempt = 3;

    public static void printUserName() {
        System.out.println("May I have your name?");
        App.username = App.USER_INPUT.nextLine();
        System.out.println("Hello, " + App.username + "!");
    }
    public static void prepareCalcNumValUserResponce(String[][] strCorrectAnswer, String strRuleGame) {
        for (int iAtt = 0; iAtt < Engine.countAttempt; ++iAtt) {
            if (iAtt == 0) {
                System.out.print(strRuleGame);
                System.out.print("Question: ");
            } else {
                System.out.print("Question: ");
            }
            System.out.println(strCorrectAnswer[iAtt][0]);
            String strAnsUserOper = App.USER_INPUT.nextLine();
            System.out.println("Your answer: " + strAnsUserOper);
            if (!strCorrectAnswer[iAtt][1].equalsIgnoreCase(strAnsUserOper)) {
                System.out.println("'" + strAnsUserOper + "' is wrong answer ;(. Correct answer was '"
                        + strCorrectAnswer[iAtt][1] + "'.");
                System.out.println("Let's try again, " + App.username + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (iAtt == Engine.countAttempt - 1) {
                    System.out.println("Congratulations, " + App.username + "!");
                }
            }
        }
        //System.out.println("Congratulations, " + App.username + "!");
    }
}
