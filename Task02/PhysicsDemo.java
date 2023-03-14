import java.util.Scanner;

/**
 * Демонстрація використання класів для обчислення фізичних величин
 */
public class PhysicsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial speed (m/s): ");
        double v0 = scanner.nextDouble();

        System.out.print("Enter the angle of deviation from the horizon (degrees): ");
        double angle = Math.toRadians(scanner.nextDouble());

        System.out.print("Enter flight time (s): ");
        double t = scanner.nextDouble();

        System.out.println();

        PhysicsCalculator calculator = new PhysicsCalculator(v0, angle, 9.8);
        PhysicsBody result = calculator.calculate(t);

        System.out.printf("Calculation result:%nX: %.2f m%nY: %.2f m%n", result.getX(), result.getY());
    }
}
