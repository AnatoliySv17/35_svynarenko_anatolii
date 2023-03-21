/**
 * The PhysicsBody class represents a physical object with a position (x, y) in space.
 */
public class PhysicsBody {
    private final double x;
    private final double y;

    /**
     *  Constructs a PhysicsBody object with the specified position (x, y).
     *  @param x the position of the object along the X axis
     *  @param y the position of the object along the Y axis
     */
    public PhysicsBody(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the position of the object along the X axis.
     * @return the position of the object along the X axis
     */
    public double getX() {
        return x;
    }

    /**
     *  Returns the position of the object along the Y axis.
     *  @return the position of the object along the Y axis
     */
    public double getY() {
        return y;
    }
}
