package src.Task2.Task2_2;

import java.util.Scanner;

public class Hw2_2_Rainbow {

    private static final Scanner scanner = new Scanner(System.in);

    private String color;
    private int numColor;

    public Hw2_2_Rainbow(String color, int numColor) {
        this.color = color;
        this.numColor = numColor;
    }


    private static final Hw2_2_Rainbow RED = new Hw2_2_Rainbow("красный" , 1);

    private static final Hw2_2_Rainbow ORANGE = new Hw2_2_Rainbow("оранжевый" , 2);

    private static final Hw2_2_Rainbow YELLOW = new Hw2_2_Rainbow("желтый" , 3);

    private static final Hw2_2_Rainbow GREEN = new Hw2_2_Rainbow("зеленый" , 4);

    private static final Hw2_2_Rainbow BLUE = new Hw2_2_Rainbow("голубой" , 5);

    private static final Hw2_2_Rainbow INDIGO = new Hw2_2_Rainbow("синий" , 6);

    private static final Hw2_2_Rainbow VIOLET = new Hw2_2_Rainbow("фиолетовый" , 7);

    private String getColor() {
         return this.color;
    }

    private int getNumColor() {
         return this.numColor;
    }

    public static void start() {
        Hw2_2_Rainbow inputNumColor;

        do {
            System.out.println("Введите номер цвета от 1 до 7: ");
            int numColor = scanner.nextInt();
            inputNumColor = choiseNumColor(numColor);

            if (inputNumColor == null) {
                System.out.println("Введенный номер цвета вне границ используемых цветов от 1 до 7.");
            }
        } while (inputNumColor == null);
        System.out.println("Введенный цвет " + inputNumColor.getColor());
    }

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