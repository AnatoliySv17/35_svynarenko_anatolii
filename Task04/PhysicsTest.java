public class PhysicsTest {

    public static void main(String[] args) {
        testDistanceCalculation();
        testForceCalculation();
    }

    private static void testDistanceCalculation() {
        PhysicsBody point1 = new PhysicsBody(0, 0);
        PhysicsBody point2 = new PhysicsBody(3, 4);
        double expectedDistance = 5;

        double distance = PhysicsCalculator.calculateDistance(point1, point2);

        if (distance == expectedDistance) {
            System.out.println("Distance calculation test passed.");
        } else {
            System.out.println("Distance calculation test failed. Expected: " + expectedDistance + ", actual: " + distance);
        }
    }

    private static void testForceCalculation() {
        double mass1 = 1;
        double mass2 = 2;
        double distance = 3;
        double expectedForce = 2.406;

        double force = PhysicsCalculator.calculateForce(mass1, mass2, distance);

        if (Math.abs(force - expectedForce) < 0.001) {
            System.out.println("Force calculation test passed.");
        } else {
            System.out.println("Force calculation test failed. Expected: " + expectedForce + ", actual: " + force);
        }
    }
}
