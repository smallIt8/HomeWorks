package src.edu.lukyanov.task3.class1;

import src.edu.lukyanov.task3.class2.Cat;

public class Main {

    public static void main(String[] args) {
        Cat catWhile = new Cat("",0);
        Cat catFor = new Cat("",0);
        Cat catDoWhile = new Cat("",0);
        Cat catForeach = new Cat("",0);
        Cat.startWhile();
        Cat.startFor();
        Cat.startDoWhile();
        Cat.startForeach();
    }
}