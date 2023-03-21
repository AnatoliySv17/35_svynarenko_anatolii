public class TablePhysicsFactory implements PhysicsFactory {

    @Override
    public PhysicsCalculator createCalculator() {
        return new PhysicsCalculator();
    }

    @Override
    public PhysicsFormatter createFormatter() {
        return new TablePhysicsFormatter(2,20);
    }



}
