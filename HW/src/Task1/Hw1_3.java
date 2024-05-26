package src.Task1;

public class Hw1_3 {

    public static void main(String[] args) {
        Hw1_2 hW = new Hw1_2();

        //Считываем текущие значения полей

        byte b = hW.getB();
        short s = hW.getS();
        int i = hW.getI();
        long l = hW.getL();
        float f = hW.getF();
        double d = hW.getD();
        char c = hW.getC();
        boolean bool = hW.isBool();

        Byte bOb = hW.getbOb();
        Short sOb = hW.getsOb();
        Integer iOb = hW.getiOb();
        Long lOb = hW.getlOb();
        Float fOb = hW.getfOb();
        Double dOb = hW.getdOb();
        Character cOb = hW.getcOb();
        Boolean boolOb = hW.getBoolOb();

        // Выводим текущие значения полей

        System.out.println("");
        System.out.println("Примитивы по умолчанию:");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        System.out.println("");
        System.out.println("Обертки по умолчанию:");
        System.out.println(bOb);
        System.out.println(sOb);
        System.out.println(iOb);
        System.out.println(lOb);
        System.out.println(fOb);
        System.out.println(dOb);
        System.out.println(cOb);
        System.out.println(boolOb);

        // Присваеваем значения

        hW.setB((byte) 2);
        hW.setS((short) 18);
        hW.setI(22);
        hW.setL(800L);
        hW.setF(1.99F);
        hW.setD(3.897);
        hW.setC('9');
        hW.setBool(true);

        hW.setbOb((byte) 1);
        hW.setsOb((short) 9);
        hW.setiOb(11);
        hW.setlOb(400L);
        hW.setfOb(0.99F);
        hW.setdOb(2.437);
        hW.setcOb('4');
        hW.setBoolOb(true);

        //Считываем значения, но уже измененные

        b = hW.getB();
        s = hW.getS();
        i = hW.getI();
        l = hW.getL();
        f = hW.getF();
        d = hW.getD();
        c = hW.getC();
        bool = hW.isBool();

        bOb = hW.getbOb();
        sOb = hW.getsOb();
        iOb = hW.getiOb();
        lOb = hW.getlOb();
        fOb = hW.getfOb();
        dOb = hW.getdOb();
        cOb = hW.getcOb();
        boolOb = hW.getBoolOb();

        //Проверяем изменились ли значения

        System.out.println("");
        System.out.println("Присвоенные примитивы:");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        System.out.println("");
        System.out.println("Присвоенные обертки:");
        System.out.println(bOb);
        System.out.println(sOb);
        System.out.println(iOb);
        System.out.println(lOb);
        System.out.println(fOb);
        System.out.println(dOb);
        System.out.println(cOb);
        System.out.println(boolOb);
    }
}