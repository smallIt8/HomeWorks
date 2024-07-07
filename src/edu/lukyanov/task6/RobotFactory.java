package src.edu.lukyanov.task6;

public class RobotFactory implements Factory<Robot> {
    private HeadFactory headFactory;
    private BodyFactory bodyFactory;

    @Override
    public Robot[] assemblyPart() {
        int headCount = RobotHead.values().length;
        int bodyCount = RobotBody.values().length;
        int totalCount = headCount * bodyCount;
        Robot[] robots = new Robot[totalCount];

        int index = 0;
        for (int i = 0; i < headCount; i++) {
            RobotHead head = headFactory.createPart();
            for (int j = 0; j < bodyCount; j++) {
                RobotBody body = bodyFactory.createPart();
                robots[index] = new Robot("Robot" + (index + 1), head, body);
                index++;
            }
        }
        return robots;
    }

    public RobotFactory(HeadFactory headFactory, BodyFactory bodyFactory) {
        this.headFactory = headFactory;
        this.bodyFactory = bodyFactory;
    }
}