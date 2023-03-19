/**
 *  A console application for performing physics calculations based on user input.
*/
import java.util.Scanner;

public class PhysicsApp {
/**
 *  Main method that runs the application.
 *  @param args command-line arguments
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Physics Calculator!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Calculate the distance between two points.");
            System.out.println("2. Calculate the force between two masses.");
            System.out.println("3. Exit the program.");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
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
                    double distance = PhysicsCalculator.calculateDistance(point1, point2);

                    System.out.println("The distance between the two points is: " + distance);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Please enter the mass of the first object:");
                    double mass1 = scanner.nextDouble();
                    System.out.println("Please enter the mass of the second object:");
                    double mass2 = scanner.nextDouble();
                    System.out.println("Please enter the distance between the two objects:");
                    double distance = scanner.nextDouble();

                    double force = PhysicsCalculator.calculateForce(mass1, mass2, distance);

                    System.out.println("The force between the two objects is: " + force);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
