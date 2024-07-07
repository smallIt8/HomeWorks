package src.edu.lukyanov.task5;

public class Dog extends Animal {
    private String command;

    public Dog(String food, String location, String command) {
        super(food, location);
        this.command = command;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
