package src.edu.lukyanov.task6;

public enum RobotHead {
    ROUND("круглая голова"),
    SQUARE("квадратная голова"),
    TRIANGLE("треугольная голова");

    private final String name;

    RobotHead(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
