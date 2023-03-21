import java.util.Scanner;

public class ForceCommand implements Command{
    private static final Scanner scanner = new Scanner(System.in);

    public ForceCommand(PhysicsFactory factory, PhysicsFormatter formatter,TablePhysicsFormatter tablePhysicsFormatter) {
        this.factory = factory;
        this.formatter = formatter;
        this.tablePhysicsFormatter = tablePhysicsFormatter;
    }
    private TablePhysicsFormatter tablePhysicsFormatter;
    private PhysicsFactory factory;
    private PhysicsFormatter formatter;

    @Override
    public String toString() {
        return "/Calculate the force between two masses/";
    }

    @Override
    public Integer getKey() {
        return 2;
    }

    @Override
    public void execute() {
        System.out.println("Please enter the mass of the first object:");
        double mass1 = scanner.nextDouble();
        System.out.println("Please enter the mass of the second object:");
        double mass2 = scanner.nextDouble();
        System.out.println("Please enter the distance between the two objects:");
        double distance = scanner.nextDouble();

        double force = PhysicsCalculator.calculateForce(mass1, mass2, distance);

        factory = new TextPhysicsFactory();
        formatter = factory.createFormatter();
        String forceText = formatter.forceFormat(force);
        System.out.println("The force between the two objects is: " + forceText);
        System.out.println();

        tablePhysicsFormatter.outTableFormatForce(mass1,mass2,distance,force);


    }
}
