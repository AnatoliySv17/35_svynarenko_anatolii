public class ForceMultiThreadCommand extends DefaultMultiThreadCommand{
    public ForceMultiThreadCommand(PhysicsFactory factory, PhysicsFormatter formatter,TablePhysicsFormatter tablePhysicsFormatter,Double result) {
        super(factory, formatter,tablePhysicsFormatter);
        distance = result;
    }

    public boolean isRun = true;
    private Double distance;

    @Override
    public void execute() {
        System.out.println("Please enter the mass of the first object:");
        double mass1 = scanner.nextDouble();
        System.out.println("Please enter the mass of the second object:");
        double mass2 = scanner.nextDouble();

        double force = PhysicsCalculator.calculateForce(mass1, mass2, distance);

        factory = new TextPhysicsFactory();
        formatter = factory.createFormatter();
        String forceText = formatter.forceFormat(force);
        System.out.println("The force between the two objects is: " + forceText);

        tablePhysicsFormatter.outTableFormatForce(mass1,mass2,distance,force);
        isRun = false;
    }
}
