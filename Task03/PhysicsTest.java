import java.util.Scanner;

/**
 * A class for testing the functionality of the PhysicsCalculator and its formatters.
 */
public class PhysicsTest {
    /**
     * The entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Prompt the user to enter the initial velocity
        try ( // Create a scanner to read user input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the initial velocity
            System.out.print("Enter the initial velocity (m/s): ");
            double v0 = scanner.nextDouble();
            // Prompt the user to enter the angle in degrees
            System.out.print("Enter the angle (degrees): ");
            double angle = scanner.nextDouble();
            // Convert the angle from degrees to radians
            angle = Math.toRadians(angle);
            // Prompt the user to enter the acceleration due to gravity
            System.out.print("Enter the acceleration due to gravity (m/s^2): ");
            double g = scanner.nextDouble();
            // Prompt the user to enter the time interval
            System.out.print("Enter the time interval (s): ");
            double t = scanner.nextDouble();
            // Create a PhysicsCalculator object
            PhysicsCalculator calculator = new PhysicsCalculator(v0, angle, g);
            // Create a PhysicsBody object using the calculator
            PhysicsBody body = calculator.calculate(t);
            // Prompt the user to choose a formatter
            System.out.println("Choose a formatter:");
            System.out.println("1. SimplePhysicsFormatter");
            System.out.println("2. AdvancedPhysicsFormatter");
            int choice = scanner.nextInt();
            // Create a formatter based on the user's choice
            PhysicsFormatter formatter;
            if (choice == 1) {
                formatter = new SimplePhysicsFormatter();
            } else {
                formatter = new AdvancedPhysicsFormatter();
            }
            // Format the PhysicsBody object using the chosen formatter
            String formatted = formatter.format(body);
            // Display the formatted result
            System.out.println(formatted);
            // Close the scanner to prevent resource leaks
        }
    }
}
