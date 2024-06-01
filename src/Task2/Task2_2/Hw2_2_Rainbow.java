package src.Task2.Task2_2;

import java.util.Scanner;

public class Hw2_2_Rainbow {

    // считывает введенные значения пользователем
    private static final Scanner scanner = new Scanner(System.in);

    // две переменные для конструктора
    private final String color;
    private final int numColor;

    // конструктор с двумя полями
    public Hw2_2_Rainbow(String color, int numColor) {
        this.color = color;
        this.numColor = numColor;
    }

    // создаем 7 объектов цветов радуги
    private static final Hw2_2_Rainbow RED = new Hw2_2_Rainbow("красный" , 1);

    private static final Hw2_2_Rainbow ORANGE = new Hw2_2_Rainbow("оранжевый" , 2);

    private static final Hw2_2_Rainbow YELLOW = new Hw2_2_Rainbow("желтый" , 3);

    private static final Hw2_2_Rainbow GREEN = new Hw2_2_Rainbow("зеленый" , 4);

    private static final Hw2_2_Rainbow BLUE = new Hw2_2_Rainbow("голубой" , 5);

    private static final Hw2_2_Rainbow INDIGO = new Hw2_2_Rainbow("синий" , 6);

    private static final Hw2_2_Rainbow VIOLET = new Hw2_2_Rainbow("фиолетовый" , 7);

    // это геттеры для двух полей объекта, они вроде как не нужны, но не сообразил как без них
    private String getColor() {
         return this.color;
    }

    private int getNumColor() {
         return this.numColor;
    }

    // тут метод для взаимодействия с классом main, т.е. часть через которую все запускается
    public static void start() {
        Hw2_2_Rainbow inputNumColor;
        Hw2_2_Rainbow inputNumTwoColor;

        // тут цикл, в нем инициализируется введенное первое значение цвета пользователем и...
        do {
            System.out.println("Введите номер цвета от 1 до 7: ");
            int numColor = scanner.nextInt();
            scanner.nextLine(); // не понимаю как работает, очищает буфер сканера? если нет, то завершается программа!
            inputNumColor = choiseNumColor(numColor);

            // выполняется проверка, что пользователь ввел первое значение из диапазона возможных, и если нет, то возвращает назад в тело цикла
            if (inputNumColor == null) {
                System.out.println("Введенный номер цвета вне границ используемых цветов от 1 до 7.");
            }
        } while (inputNumColor == null);

        // тут происходит вывод названия первого введенного цвета по номеру цвета
        System.out.println("Введенный цвет " + inputNumColor.getColor());

        System.out.println("Хотите скомбинировать введенный цвет с другим? Введите 'да' или 'нет': ");

        // тут мы считываем введенное строчное значение и приводим к нижнему регистру
        String combinedColor = scanner.nextLine().toLowerCase();

        // тут мы на основе введенного пользователем ответа, либо добавляем цвет, либо завершаем программу
        if (combinedColor.equals("да")) {
            // тут цикл, в нем инициализируется введенное второе значение цвета пользователем и...
            do {
                System.out.println("Введите номер второго цвета от 1 до 7: ");
                int numTwoColor = scanner.nextInt();
                inputNumTwoColor = choiseNumColor(numTwoColor);

                // выполняется проверка, что пользователь ввел второе значение из диапазона возможных, и если нет, то возвращает назад в тело цикла
                if (inputNumTwoColor == null) {
                    System.out.println("Введенный номер второго цвета вне границ используемых цветов от 1 до 7.");
                }
            } while (inputNumTwoColor == null);

            // тут происходит вывод названия второго введенного цвета по номеру цвета
            System.out.println("Введенный второй цвет " + inputNumTwoColor.getColor());

            System.out.println(" ");

            // тут выводим название смешанного цвета
            System.out.println("Введенный комбинированный цвет " + inputNumColor.getColor() + "-" + inputNumTwoColor.getColor());

        } else if (combinedColor.equals("нет")) {
            System.out.println("Тогда программа завершается!");
        }
    }

        // тут метод с оператором свич, где введенный номер цвета пользователем ссылается на объект
        private static Hw2_2_Rainbow choiseNumColor(int numColor) {
            switch (numColor) {
                case 1:
                    return RED;
                case 2:
                    return ORANGE;
                case 3:
                    return YELLOW;
                case 4:
                    return GREEN;
                case 5:
                    return BLUE;
                case 6:
                    return INDIGO;
                case 7:
                    return VIOLET;
                default:
                    return null;
            }
        }
}