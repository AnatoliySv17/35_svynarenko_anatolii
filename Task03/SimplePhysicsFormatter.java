/**
 * A simple implementation of the {@link PhysicsFormatter} interface that formats
 * the physics body data as a plain string.
 */
public class SimplePhysicsFormatter extends PhysicsFormatter {

    /**
     * Formats the given physics body data as a plain string.
     *
     * @param body the physics body to format
     * @return a plain string representation of the physics body data
     */
    @Override
    public String format(PhysicsBody body) {
        return String.format("(%.2f, %.2f)", body.getX(), body.getY());
    }

    @Override
    public String format(PhysicsBody result, int decimals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
