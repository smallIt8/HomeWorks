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












    }
}
