package src.edu.lukyanov.task5;

public class Horse extends Animal {
    private String speedMovement;

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        setFood("Сено");
        System.out.println("Лошадь ест " + getFood());
    }

    public Horse(String food, String location, String speedMovement) {
        super(food, location);
        this.speedMovement = speedMovement;
    }

    public String getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(String speedMovement) {
        this.speedMovement = speedMovement;
    }
}