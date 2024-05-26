package src.Task1;

public class Hw1_1 {

    private static int age = 18;
    private static int weight = 60;
    private static float height = 1.76F;
    private static Byte monthBirth = 8;
    private static Integer dateBirthMonth = 15;
    private static Double exactWeight = 60.350;

    public static void main(String[] args) {
       final int newAge = 35;
       final int newWeight = 75;
       final float newHeight = 1.88F;
       final Byte newMonthBirth = 10;
       final Integer newDateBirthMonth = 21;
       final Double newExactWeight = 75.200;

        System.out.println("");
        System.out.println("Первоначальные полученные данные: ");
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(monthBirth);
        System.out.println(dateBirthMonth);
        System.out.println(exactWeight);

        System.out.println("");
        System.out.println("Окончательные данные: ");
        System.out.println(newAge);
        System.out.println(newWeight);
        System.out.println(newHeight);
        System.out.println(newMonthBirth);
        System.out.println(newDateBirthMonth);
        System.out.println(newExactWeight);
    }
}
