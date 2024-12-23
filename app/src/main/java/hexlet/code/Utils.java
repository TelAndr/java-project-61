package hexlet.code;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
