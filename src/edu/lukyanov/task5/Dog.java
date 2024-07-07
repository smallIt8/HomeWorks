package src.edu.lukyanov.task5;

public class Dog extends Animal {
    private String command;

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

    public Dog(String food, String location, String command) {
        super(food, location);
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
