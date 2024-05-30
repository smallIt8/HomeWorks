package src.Task1;

public class Hw1_1 {

    private static int age = 18;
    private static int weight = 60;
    private static float height = 1.76F;
    private static Byte monthBirth = 8;
    private static Integer dateBirthMonth = 15;
    private static Double exactWeight = 60.350;

    public static void main(String[] args) {
       int newAge = 35;
       int age = newAge;
       int newWeight = 75;
       int weight = newWeight;
       float newHeight = 1.88F;
       float height = newHeight;
       Byte newMonthBirth = 10;
       Byte monthBirth = newMonthBirth;
       Integer newDateBirthMonth = 21;
       Integer dateBirthMonth = newDateBirthMonth;
       Double newExactWeight = 75.200;
       Double exactWeight = newExactWeight;

        System.out.println("");
        System.out.println("Первоначально заданные значения глобальных переменных: ");
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(monthBirth);
        System.out.println(dateBirthMonth);
        System.out.println(exactWeight);

        // видим, что первоначальные значения выводятся уже измененными, т.е. мы не сохраняли их дубликат

        System.out.println("");
        System.out.println("Присвоенные глобальным переменным значения локальных переменных: ");
        System.out.println(newAge);
        System.out.println(newWeight);
        System.out.println(newHeight);
        System.out.println(newMonthBirth);
        System.out.println(newDateBirthMonth);
        System.out.println(newExactWeight);

        // а тут как и в первом выводе те же, измененные значения!

        Hw1_2 hW = new Hw1_2(); // создали экземпляр

        //Считываем текущие значения полей

        byte b = hW.getB();
        short s = hW.getS();
        int i = hW.getI();
        long l = hW.getL();
        float f = hW.getF();
        double d = hW.getD();
        char c = hW.getC();
        boolean bool = hW.isBool();

        Byte bOb = hW.getBOb();
        Short sOb = hW.getSOb();
        Integer iOb = hW.getIOb();
        Long lOb = hW.getLOb();
        Float fOb = hW.getFOb();
        Double dOb = hW.getDOb();
        Character cOb = hW.getCOb();
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

        // Присваеваем значения полям

        hW.setB((byte) 2);
        hW.setS((short) 18);
        hW.setI(22);
        hW.setL(800L);
        hW.setF(1.99F);
        hW.setD(3.897);
        hW.setC('9');
        hW.setBool(true);

        hW.setBOb((byte) 1);
        hW.setSOb((short) 9);
        hW.setIOb(11);
        hW.setLOb(400L);
        hW.setFOb(0.99F);
        hW.setDOb(2.437);
        hW.setCOb('4');
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

        bOb = hW.getBOb();
        sOb = hW.getSOb();
        iOb = hW.getIOb();
        lOb = hW.getLOb();
        fOb = hW.getFOb();
        dOb = hW.getDOb();
        cOb = hW.getCOb();
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