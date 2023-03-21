public class DistanceMultiThreadCommand extends DefaultMultiThreadCommand{

    public DistanceMultiThreadCommand(PhysicsFactory factory, PhysicsFormatter formatter, TablePhysicsFormatter tablePhysicsFormatter) {
        super(factory, formatter,tablePhysicsFormatter);
    }

    private Double result;
    public boolean isRun = true;

    public Double getResult(){
        return result;
    }


    public void execute(){
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

        factory = new TextPhysicsFactory();
        formatter = factory.createFormatter();
        result = PhysicsCalculator.calculateDistance(point1, point2);
        String distanceText = formatter.format(result);
        System.out.println("The distance between the two points is: " + distanceText);
        tablePhysicsFormatter.outTableFormat(x1,y1,x2,y2,result);

        isRun = false;
    }
}
