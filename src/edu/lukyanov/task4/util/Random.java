package src.edu.lukyanov.task4.util;

/*
Утилитный класс методов random
*/

public final class Random {
    private static final java.util.Random random = new java.util.Random();

    public static String getRandomDoubToStr(){
        double doubleValue = (random.nextDouble(1.99999) + 1.00001);
        return String.format("%.5f", doubleValue);
    }

    public static String getRandomName(){
        int sizeValue = 7;
        StringBuilder strValue = new StringBuilder(sizeValue);
        String symbol = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int s = 0; s < sizeValue; s++) {
            int strValueIndex = random.nextInt(symbol.length());
            strValue.append(symbol.charAt(strValueIndex));
        }
        return strValue.toString();
    }
}
