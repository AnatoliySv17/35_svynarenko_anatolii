public class TextPhysicsFormatter implements PhysicsFormatter {
    private int decimals;

    public TextPhysicsFormatter(int decimals) {
        this.decimals = decimals;
    }

    TextPhysicsFormatter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String format(double result) {
        String output = String.format("Position: (%." + decimals + "f, %." + decimals + "f)\n", result.getX(), result.getY());
        output += String.format("Velocity: (%." + decimals + "f, %." + decimals + "f)\n", result.getVelocityX(), result.getVelocityY());
        output += String.format("Acceleration: (%." + decimals + "f, %." + decimals + "f)\n", result.getAccelerationX(), result.getAccelerationY());
        output += String.format("Force: (%." + decimals + "f, %." + decimals + "f)\n", result.getForceX(), result.getForceY());
        return output;
    }
}
