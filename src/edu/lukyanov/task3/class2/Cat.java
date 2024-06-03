package src.edu.lukyanov.task3.class2;

import java.util.Random;

public class Cat {

    private String name;
    private int age;

    public static void startWhile() {
        int cycleCount = 0;
        while (cycleCount < 10) {
            Cat catWhile = new Cat("Котэ", 5);
            System.out.println("Имя котика по умолчанию: " + catWhile.name + ", " + "Возраст котика по умолчанию: " + catWhile.age);
            cycleCount++;
        }
        System.out.println("Вывели 10 раз дефолтное имя и возраст котика");
        System.out.println("");
    }

    public static void startFor() {
        for (int cycleCountFor = 0; cycleCountFor<10; cycleCountFor++ ) {
            Random random = new Random();
            Cat catFor = new Cat("", 0);
            catFor.setName("Котик № " + (cycleCountFor + 1));
            catFor.setAge(random.nextInt(28) + 1);
            System.out.println("Имя котика: " + catFor.getName() + ", Возраст котика: " + catFor.getAge());
        }
        System.out.println("Вывели 10 раз имя и возраст котика через сеттеры и геттеры");
        System.out.println("");
    }

    public static void startDoWhile() {
        int cycleCountDoWhile = 0;
        do {
            Random random = new Random();
            Cat catDoWhile = new Cat("", 0);
            catDoWhile.setName("Котик № " + (cycleCountDoWhile + 1));
            catDoWhile.setAge(random.nextInt(28) + 1);
            System.out.println("Имя котика: " + catDoWhile.getName() + ", Возраст котика: " + catDoWhile.getAge());
            cycleCountDoWhile++;
        } while (cycleCountDoWhile < 10);
        System.out.println("Вывели 10 раз имя и возраст котика через конструктор");
        System.out.println("");
    }

    public static void startForeach() {
        String[] abc = new String[]{"Призрак", "Нимерия", "Лето", "Леди" , "Лохматик"};
        for (String catNameForeach : abc) {
            Random random = new Random();
            Cat catForeach = new Cat("", 0);
            catForeach.setName(catNameForeach);
            catForeach.setAge(random.nextInt(28) + 1);
            System.out.println("Имя котика: " + catForeach.getName() + ", Возраст котика: " + catForeach.getAge());
        }
        System.out.println("Вывели 5 раз имя и возраст котика c помощью массива");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}