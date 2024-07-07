package src.edu.lukyanov.task6.lesson8.task2;

public class String {

    public void start(){
        textString();
    }

    public void textString (){
        java.lang.String text = "I like Java!!!";
        System.out.println("Выводим последний символ строки text: " + text.charAt(text.length() - 1));
        if ( text.endsWith("!!!") ) {
            System.out.println("Да, строка text заканчивается подстрокой '!!!'");
        }else {
            System.out.println("Нет, строка text не заканчивается подстрокой '!!!'");
        }
        if ( text.startsWith("I like") ) {
            System.out.println("Да, строка text начинается подстрокой 'I like'");
        }else {
            System.out.println("Нет, строка text не начинается подстрокой 'I like'");
        }
        if ( text.contains("Java") ) {
            System.out.println("Да, строка text содержит подстроку 'Java'");
        }else {
            System.out.println("Нет, строка text не содержит подстроку 'Java'");
        }
        System.out.println("Позиция подстроки 'Java' в строке text: " + (text.indexOf("J") - 1));

        System.out.println("Заменили все символы 'a' на 'o' в строке text: " + text.replaceAll("[aA]+", "o"));

        System.out.println("Преобразовали строке text в верхний регистр: " + text.toUpperCase());

        System.out.println("Преобразовали строке text в нижний регистр: " + text.toLowerCase());
    }
}
