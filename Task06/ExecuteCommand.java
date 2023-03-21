import java.util.concurrent.TimeUnit;

public class ExecuteCommand implements Command{

    public ExecuteCommand(PhysicsFactory factory, PhysicsFormatter formatter,TablePhysicsFormatter tablePhysicsFormatter) {
        this.factory = factory;
        this.formatter = formatter;
        this.tablePhysicsFormatter = tablePhysicsFormatter;
    }
    private TablePhysicsFormatter tablePhysicsFormatter;
    private PhysicsFactory factory;
    private PhysicsFormatter formatter;

    @Override
    public String toString() {
        return "/Execute calculating the force between two masses and points/";
    }

    @Override
    public Integer getKey() {
        return 3;
    }

    @Override
    public void execute(){
        CommandQueue queue = new CommandQueue();
        DistanceMultiThreadCommand distanceMultiCommand = new DistanceMultiThreadCommand(factory,formatter,tablePhysicsFormatter);
        System.out.println("Distance executed!");
        queue.put(distanceMultiCommand);
        try {
            while (distanceMultiCommand.isRun){
                TimeUnit.MILLISECONDS.sleep(300);
            }
            ForceMultiThreadCommand forceMultiThreadCommand = new ForceMultiThreadCommand(factory,formatter,tablePhysicsFormatter,
                    distanceMultiCommand.getResult());
            System.out.println("Force executed!");
            queue.put(forceMultiThreadCommand);
            while (forceMultiThreadCommand.isRun){
                TimeUnit.MILLISECONDS.sleep(300);
            }
            queue.setShutdown();
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException ie){
            System.err.println(ie);
        }
    }
}
