public class GraphicPhysicsFactory implements PhysicsFactory {
    @Override
    public PhysicsCalculator createCalculator() {
        return new PhysicsCalculator();
    }

    @Override
    public PhysicsFormatter createFormatter() {
        return new GraphicPhysicsFormatter(2);
    }
}
