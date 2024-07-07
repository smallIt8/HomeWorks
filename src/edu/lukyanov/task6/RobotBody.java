package src.edu.lukyanov.task6;

public enum RobotBody {
    ROUND("круглое тело"),
    SQUARE("квадратное тело"),
    TRIANGLE("треугольное тело");

    private final String name;

    RobotBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}