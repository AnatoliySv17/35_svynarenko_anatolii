

import java.util.Scanner;

public class DistanceCommand implements Command{
    private static final Scanner scanner = new Scanner(System.in);

    public DistanceCommand(PhysicsFactory factory, PhysicsFormatter formatter,TablePhysicsFormatter tablePhysicsFormatter) {
        this.factory = factory;
        this.formatter = formatter;
        this.tablePhysicsFormatter = tablePhysicsFormatter;
    }
    private TablePhysicsFormatter tablePhysicsFormatter;
    private PhysicsFactory factory;
    private PhysicsFormatter formatter;

    @Override
    public String toString() {
        return "/Calculate the distance between two points/";
    }

    @Override
    public Integer getKey() {
        return 1;
    }

    @Override
    public void execute() {
        System.out.println("Please enter the x-coordinate of the first point:");
        double x1 = scanner.nextDouble();
        System.out.println("Please enter the y-coordinate of the first point:");
        double y1 = scanner.nextDouble();
        System.out.println("Please enter the x-coordinate of the second point:");
        double x2 = scanner.nextDouble();
        System.out.println("Please enter the y-coordinate of the second point:");
        double y2 = scanner.nextDouble();

        PhysicsBody point1 = new PhysicsBody(x1, y1);
        PhysicsBody point2 = new PhysicsBody(x2, y2);


        double result = PhysicsCalculator.calculateDistance(point1, point2);
        factory = new TextPhysicsFactory();
        formatter = factory.createFormatter();
        String distanceText = formatter.format(result);
        System.out.println("The distance between the two points is: " + distanceText);
        System.out.println();

        tablePhysicsFormatter.outTableFormat(x1,y1,x2,y2,result);
    }
}
