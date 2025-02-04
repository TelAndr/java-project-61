package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Parity;
import hexlet.code.games.Prime;

public class Engine {
    public static void dispValidRespMes() {
        System.out.println("Correct!");
    }

    public static void dispInvalidRespMes(String incorrVal, String corrVal, String userName) {
        System.out.println("'" + incorrVal + "' is wrong answer ;(. Correct answer was '" +
                corrVal + "'.");
        System.out.println("Let's try again," + userName + "!");
    }
    public static void prepareCalcNumValUserResponce(String[] inputStringArray, String strRuleGame) {
        int numInpIter = 3;
        int counterInputUser = 0;
        String[][] strCorrectAnswer = new String[6][2];
        strCorrectAnswer[1][0] = strRuleGame + inputStringArray[0] + inputStringArray[1];
        strCorrectAnswer[1][1] = Parity.isParity(Integer.parseInt(inputStringArray[2]))? "Yes": "No";
        strCorrectAnswer[2][0] = strRuleGame + inputStringArray[0] + " " +
                inputStringArray[1] + " " + inputStringArray[2];
        strCorrectAnswer[2][1] = String.valueOf(Calculate.calcResultMathOperation(
                Integer.parseInt(inputStringArray[0]), Integer.parseInt(inputStringArray[2]),
                inputStringArray[1]));
        strCorrectAnswer[3][0] = strRuleGame + inputStringArray[0] + " " + inputStringArray[1];
        strCorrectAnswer[3][1] = String.valueOf(
                GCD.gcd(Integer.parseInt(inputStringArray[0]), Integer.parseInt(inputStringArray[1]))
        );
        strCorrectAnswer[4][0] = strRuleGame + inputStringArray[0];
        strCorrectAnswer[4][1] = String.valueOf(Progression.getRandomNumFromArr());
        strCorrectAnswer[5][0] = strRuleGame + inputStringArray[0];
        strCorrectAnswer[5][1] = Prime.strAnsPrime(Prime.valIsSimple(Integer.parseInt(inputStringArray[0])));
        while (true) {
            if (counterInputUser == numInpIter) {
                System.out.println("Congratulations, " + App.username + "!");
                return;
            }
            if (counterInputUser > 0) {
                for (int iGame = 0; iGame < 6; ++iGame) {
                    System.out.println(strCorrectAnswer[iGame][0]);
                    String strAnsUserOper = App.USER_INPUT.nextLine();
                    System.out.println("Your answer: " + strAnsUserOper);
                    if (strCorrectAnswer[iGame][1].equalsIgnoreCase(strAnsUserOper)) {
                        dispValidRespMes();
                        counterInputUser++;
                    } else {
                        dispInvalidRespMes(strAnsUserOper, strCorrectAnswer[iGame][1], App.username);
                        return;
                    }
                }
            }
        }
    }
}
