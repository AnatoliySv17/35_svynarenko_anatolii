import java.io.Serializable;

/**
 * Клас, що представляє фізичне тіло
 */
public class PhysicsBody implements Serializable {
    private double x;
    private double y;

    /**
     * Конструктор, який приймає координати тіла
     * @param x Координата по осі X
     * @param y Координата по осі Y
     */
    public PhysicsBody(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод для отримання координати по осі X
     * @return Координата по осі X
     */
    public double getX() {
        return x;
    }

    /**
     * Метод для отримання координати по осі Y
     * @return Координата по осі Y
     */
    public double getY() {
        return y;
    }
}
