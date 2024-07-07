package src.edu.lukyanov.task6;

public class BodyFactory implements Factory<RobotBody> {
    private static int bodyIndex = 0;
    private RobotBody[] bodies = RobotBody.values();

    @Override
    public RobotBody createPart() {
        return bodies[bodyIndex++ % bodies.length];
    }
}
