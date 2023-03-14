import java.io.Serializable;

/**
 * Клас для обчислення параметрів фізичного тіла
 */
public class PhysicsCalculator implements Serializable {
    private double initialSpeed;
    private double angle;
    private double gravity;

    /**
     * Конструктор, який приймає параметри фізичного тіла
     * @param initialSpeed Початкова швидкість
     * @param angle Кут відносно горизонталі
     * @param gravity Прискорення вільного падіння
     */
    public PhysicsCalculator(double initialSpeed, double angle, double gravity) {
        this.initialSpeed = initialSpeed;
        this.angle = angle;
        this.gravity = gravity;
    }

    /**
     * Метод для обчислення параметрів фізичного тіла
     * @param time Час руху тіла
     * @return Об'єкт фізичного тіла
     */
    public PhysicsBody calculate(double time) {
        double x = initialSpeed * Math.cos(angle) * time;
        double y = initialSpeed * Math.sin(angle) * time - 0.5 * gravity * Math.pow(time, 2);
        return new PhysicsBody(x, y);
    }
}
