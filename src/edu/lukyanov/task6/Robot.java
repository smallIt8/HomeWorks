package src.edu.lukyanov.task6;

public class Robot {
    private String name;
    private RobotHead head;
    private RobotBody body;
    HeadFactory headFactory = new HeadFactory();
    BodyFactory bodyFactory = new BodyFactory();
    private RobotFactory robotFactory= new RobotFactory(headFactory, bodyFactory);
    private Robot[] robots;

    public void start() {
        robots = robotFactory.assemblyPart();
        print();
    }

    @Override
    public String toString() {
        return "Имя робота: " + name + ", " +
                "Состоит из следующих частей: \n" +
                head.getName() + " и " +
                body.getName();
    }

    private void print() {
        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }

    public Robot() {
    }

    public Robot(String name, RobotHead head, RobotBody body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }
}