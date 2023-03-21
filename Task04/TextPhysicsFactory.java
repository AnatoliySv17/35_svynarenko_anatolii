public class TextPhysicsFactory implements PhysicsFactory {
    @Override
    public PhysicsCalculator createCalculator() {
        return new PhysicsCalculator();
    }

    @Override
    public PhysicsFormatter createFormatter() {
        return new TextPhysicsFormatter(2) {
            @Override
            public String format(double result) {
                return String.format("Result: %.2f", result);
            }
        };
    }
}
