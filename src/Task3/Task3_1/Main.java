package src.Task3.Task3_1;

import src.Task3.Task3_2.Cat;

public class Main {

    public static void main(String[] args) {

        Cat catWhile = new Cat("",0);

        // вызов метода с циклом while
        Cat.startWhile();

        Cat catFor = new Cat("",0);

        // вызов метода с циклом for
        Cat.startFor();

        Cat catDoWhile = new Cat("",0);

        // вызов метода с циклом for
        Cat.startDoWhile();

        Cat catForeach = new Cat("",0);

        // вызов метода с циклом for
//        Cat.startForeach();
    }

}