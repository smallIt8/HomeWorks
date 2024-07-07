package src.edu.lukyanov.task6.lesson8.task1;

import java.util.Scanner;

public class DayWeek {

    Scanner scanner = new Scanner(System.in);
    private int w;

    public void start() {
        numWeek();
    }

    private void numWeek() {
        System.out.println("Введите номер дня недели от 1 до 7: ");
        w = scanner.nextInt();

        if (w == 1) {
            System.out.println("Введенный день недели 'Понедельник'");
        } else if(w == 2) {
            System.out.println("Введенный день недели 'Вторник'");
        } else if(w == 3) {
            System.out.println("Введенный день недели 'Среда'");
        } else if(w == 4) {
            System.out.println("Введенный день недели 'Четверг'");
        } else if(w == 5) {
            System.out.println("Введенный день недели 'Пятница'");
        } else if(w == 6 || w == 7) {
            System.out.println("Введенный день недели выходной");
        } else {
            System.out.println("Введенное значение за пределами требуемого");
        }
    }

}
