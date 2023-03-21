/**
 * The PhysicsCalculator class represents a calculator for computing the position of an object in a two-dimensional
 * coordinate system under the influence of gravity. The object is launched with an initial velocity and angle.
 */
public class PhysicsCalculator {

    /**
     * Calculates the distance between two points in a two-dimensional coordinate system.
     *
     * @param point1 the first point
     * @param point2 the second point
     * @return the distance between point1 and point2
     */
    static double calculateDistance(PhysicsBody point1, PhysicsBody point2) {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Calculates the force between two objects based on their masses and the distance between them.
     *
     * @param mass1    the mass of the first object
     * @param mass2    the mass of the second object
     * @param distance the distance between the two objects
     * @return the force between the two objects
     */
    static double calculateForce(double mass1, double mass2, double distance) {
        final double G = 6.67430E-11; // gravitational constant
        return (G * mass1 * mass2) / Math.pow(distance, 2);
    }

    private final double v0;
    private final double angle;
    private final double g;

    /**
     * Constructs a PhysicsCalculator object with the specified initial velocity, angle, and gravitational acceleration.
     *
     * @param v0    the initial velocity of the object
     * @param angle the angle at which the object is launched, in radians
     * @param g     the gravitational acceleration
     */
    public PhysicsCalculator(double v0, double angle, double g) {
        this.v0 = v0;
        this.angle = angle;
        this.g = g;
    }

    PhysicsCalculator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Calculates the position of the object at time t after it is launched.
     *
     * @param t the time elapsed since the object was launched
     * @return a PhysicsBody object representing the position of the object at time t
     */
    public PhysicsBody calculate(double t) {
        double x = v0 * Math.cos(angle) * t;
        double y = v0 * Math.sin(angle) * t - 0.5 * g * t * t;

        return new PhysicsBody(x, y);
    }
}
