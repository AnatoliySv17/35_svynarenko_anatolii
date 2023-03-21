import java.util.ArrayList;
import java.util.Scanner;

public class PhysicsApp {

    private PhysicsFactory factory;
    private PhysicsFormatter formatter;

    private TablePhysicsFormatter tablePhysicsFormatter;
    private final PhysicsAppMenu appMenu = new PhysicsAppMenu();
    public void Start() {
        System.out.println("Welcome to Physics Calculator!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of table(from 10): ");
        int width = scanner.nextInt();
        System.out.println("Enter decimal places: ");
        int decimalPl = scanner.nextInt();
        tablePhysicsFormatter = new TablePhysicsFormatter(decimalPl,width);
        appMenu.getCommands().add(new DistanceCommand(factory,formatter,tablePhysicsFormatter));
        appMenu.getCommands().add(new ForceCommand(factory,formatter,tablePhysicsFormatter));
        appMenu.getCommands().add(new ExecuteCommand(factory,formatter,tablePhysicsFormatter));
        appMenu.getCommands().add(new ExitCommand());
        appMenu.show();
    }
}
