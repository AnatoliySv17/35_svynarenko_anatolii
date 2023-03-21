import java.util.Map;
import java.util.Scanner;

public class DefaultMultiThreadCommand{

    protected static final Scanner scanner = new Scanner(System.in);

    public DefaultMultiThreadCommand(PhysicsFactory factory, PhysicsFormatter formatter,TablePhysicsFormatter tablePhysicsFormatter) {
        this.factory = factory;
        this.formatter = formatter;
        this.tablePhysicsFormatter = tablePhysicsFormatter;
    }

    protected TablePhysicsFormatter tablePhysicsFormatter;
    protected PhysicsFactory factory;
    protected PhysicsFormatter formatter;

    public void execute(){

    }
}
