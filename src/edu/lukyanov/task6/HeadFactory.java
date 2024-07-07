package src.edu.lukyanov.task6;

public class HeadFactory implements Factory<RobotHead> {
    private static int headIndex = 0;
    private RobotHead[] heads = RobotHead.values();

    @Override
    public RobotHead createPart() {
        return heads[headIndex++ % heads.length];
    }
}