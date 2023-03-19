public class PhysicsResult {
    private String name;
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;
    private double accelerationX;
    private double accelerationY;
    private double forceX;
    private double forceY;

    public PhysicsResult(String name, double x, double y, double velocityX, double velocityY, double accelerationX, double accelerationY, double forceX, double forceY) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY;
        this.forceX = forceX;
        this.forceY = forceY;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public double getAccelerationX() {
        return accelerationX;
    }

    public double getAccelerationY() {
        return accelerationY;
    }

    public double getForceX() {
        return forceX;
    }

    public double getForceY() {
        return forceY;
    }

    @Override
    public String toString() {
        return "PhysicsResult{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                ", accelerationX=" + accelerationX +
                ", accelerationY=" + accelerationY +
                ", forceX=" + forceX +
                ", forceY=" + forceY +
                '}';
    }
}
