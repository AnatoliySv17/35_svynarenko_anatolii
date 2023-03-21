

public class TextPhysicsFactory implements PhysicsFactory {
    @Override
    public PhysicsCalculator createCalculator() {
        return new PhysicsCalculator();
    }

    @Override
    public PhysicsFormatter createFormatter() {
        return new TextPhysicsFormatter();
    }
}
