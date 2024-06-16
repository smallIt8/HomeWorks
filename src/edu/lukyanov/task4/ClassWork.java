package src.edu.lukyanov.task4;

public class ClassWork {

    public static void main(String[] args) {
        String text = """
                Маг не test 12 приходит поздно,
                Фродо 567 Бэггинс, и test рано 123 тоже не приходит.
                Он появляется в то время, когда test 12348 положено.""";

        String replaceAll = text.replaceAll("[^a-zA-Zа-яА-Я]", "");
        String[] split = text.split("\\s+");
        int count = 0;
        for (String i : split) {
            if (i.equals("test")) {
                count++;
            }
        }
        System.out.println("Количество вхождений слова 'test'  в строке 'text': " + count);

        System.out.println("Первый символ в строке 'text': " + text.charAt(0));
        int length = text.length();
        System.out.println("Последний символ в строке 'text': " +  text.charAt(length-1));

        if ((text.length()) % 2 == 1) {
            int averagheIndex = text.length()/2;
            System.out.println("Средний символ в строке 'text': " + text.charAt(averagheIndex));
        } else {
            System.out.println("Средний символ в строке 'text' отсутствует, т.к. элементов в строке четное количество");
        }

        System.out.print("Номера символов, совпадающие с последним символом строки 'text': ");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(length-1)&& i != text.length() - 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        int maxNumLength = 0;
        int curNumLength = 0;

        for(int i = 0; i < text.length(); ++i) {
            char r = text.charAt(i);
            if (Character.isDigit(r)) {
                ++curNumLength;
                if (curNumLength > maxNumLength) {
                    maxNumLength = curNumLength;
                }
            } else {
                curNumLength = 0;
            }
        }

        System.out.println("Наибольшее количество идущих подряд цифр: " + maxNumLength);

        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        if (text.equals(stringBuilder.reverse())) {
            System.out.println("Строка является полиндромной");
        } else {
            System.out.println("Строка не является полиндромной");
        }

        int indexFirstWordLong = -1;
        int indexLastWordShort = -1;
        int maxLengthWord = 0;
        int minLengthWord = text.length();

        for(int i = 0; i < split.length; ++i) {
            String word = split[i];
            if (word.length() > maxLengthWord) {
                maxLengthWord = word.length();
                indexFirstWordLong = i;
            }
        }

        for(int i = 0; i < split.length; ++i) {
            String word = split[i];
            if (!word.isEmpty() && word.length() < minLengthWord) {
                minLengthWord = word.length();
                indexLastWordShort = i;
            }
        }

        if (indexFirstWordLong != -1 && indexLastWordShort != -1) {
            String temp = split[indexFirstWordLong];
            split[indexFirstWordLong] = split[indexLastWordShort];
            split[indexLastWordShort] = temp;
        }


        StringBuilder result = new StringBuilder();
        for (String word : split) {
            result.append(word).append(" ");
        }

        System.out.println("Поменяли слова местами: " + result.toString());
    }
}

