package src.edu.lukyanov.task5;

public class Cat extends Animal {
    private String color;

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + getFood());
    }

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}