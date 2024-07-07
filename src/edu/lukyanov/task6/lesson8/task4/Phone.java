package src.edu.lukyanov.task6.lesson8.task4;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public void start() {
        createPhonesAndPrint();
    }

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public static void createPhonesAndPrint() {
        Phone phone1 = new Phone("+375251112233", "Xiaomi Mi 13 Ultra", 189);
        Phone phone2 = new Phone("+375294445566", "Samsung Galaxy S22 Ultra", 211);
        Phone phone3 = new Phone("+375337778899", "IPhone 15 Pro Max", 178);
        Phone[] phones = new Phone[]{phone1, phone2, phone3};
        System.out.println("Информация о телефонах:");
        System.out.printf("%-15s | %-25s | %-10s%n", "Номер телефона", "Модель телефона", "Вес телефона");
        for (Phone phone : phones) {
            System.out.printf("%-15s | %-25s | %-10s%n", phone.getNumber(), phone.getModel(), phone.getWeight());
        }

        System.out.println(" ");

        phone1.receiveCall("Илья " + phone1.getNumber());
        phone2.receiveCall("Саша " + phone2.getNumber());
        phone3.receiveCall("Наташа " + phone3.getNumber());

        System.out.println(" ");

        phone1.receiveCall("Илья", "+375251112233");
        phone2.receiveCall("Саша", "+375294445566");
        phone3.receiveCall("Наташа", "+375337778899");

        System.out.println(" ");

        sendMessage("+375251112233", "+375294445566", "+375337778899");
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public static void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит: " + name + " " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на номера телефонов:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
