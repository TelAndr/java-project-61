package hexlet.code;

public class Engine {
    private static final int countAttempt = 3;
    public static int getCountAttempt() {
        return countAttempt;
    }
    public static void printUserName() {
        System.out.println("May I have your name?");
        App.setUserName(App.USER_INPUT.nextLine());
        System.out.println("Hello, " + App.getUserName() + "!");
    }
    public static void prepareCalcNumValUserResponce(String[][] strCorrectAnswer, String strRuleGame) {
        for (int iAtt = 0; iAtt < getCountAttempt(); ++iAtt) {
            if (iAtt == 0) {
                System.out.println(strRuleGame);
            }
            System.out.print("Question: ");
            System.out.println(strCorrectAnswer[iAtt][0]);
            String strAnsUserOper = App.USER_INPUT.nextLine();
            System.out.println("Your answer: " + strAnsUserOper);
            if (!strCorrectAnswer[iAtt][1].equalsIgnoreCase(strAnsUserOper)) {
                System.out.println("'" + strAnsUserOper + "' is wrong answer ;(. Correct answer was '"
                        + strCorrectAnswer[iAtt][1] + "'.");
                System.out.println("Let's try again, " + App.getUserName() + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (iAtt == getCountAttempt() - 1) {
                    System.out.println("Congratulations, " + App.getUserName() + "!");
                }
            }
        }
        //System.out.println("Congratulations, " + App.username + "!");
    }
}
