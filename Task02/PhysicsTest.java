import java.io.*;

/**
 * Тестування класів для обчислення фізичних величин та серіалізації/десеріалізації результатів
 */
public class PhysicsTest {
    public static void main(String[] args) {
        try {
            testCalculate();
            testSerialization();
        } catch (Exception e) {
            System.err.println("Testing error: " + e.getMessage());
            return;
        }

        System.out.println("All tests passed successfully");
    }

    public static void testCalculate() {
        PhysicsCalculator calculator = new PhysicsCalculator(10, Math.PI / 4, 9.8);
        PhysicsBody result = calculator.calculate(2.5);

        double expectedX = 10 * Math.cos(Math.PI / 4) * 2.5;
        double expectedY = 10 * Math.sin(Math.PI / 4) * 2.5 - 0.5 * 9.8 * Math.pow(2.5, 2);

        if (Math.abs(result.getX() - expectedX) > 0.0001 || Math.abs(result.getY() - expectedY) > 0.0001) {
            throw new AssertionError("Unexpected result for X or Y coordinate");
        }
    }

    public static void testSerialization() throws IOException, ClassNotFoundException {
        PhysicsBody result = new PhysicsBody(10, 2);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(result);

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        PhysicsBody restoredResult = (PhysicsBody) in.readObject();

        if (result.getX() != restoredResult.getX() || result.getY() != restoredResult.getY()) {
            throw new AssertionError("Unexpected deserialized result");
        }
    }
}
