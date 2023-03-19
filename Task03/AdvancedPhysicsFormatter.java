/**
 * AdvancedPhysicsFormatter is a concrete implementation of PhysicsFormatter
 * interface that formats the PhysicsBody object into a string with advanced
 * formatting options.
 */
public class AdvancedPhysicsFormatter extends PhysicsFormatter {
    private final String xFormat;
    private final String yFormat;

    /**
     * Constructs an AdvancedPhysicsFormatter object with the specified format
     * strings for the x and y values of the PhysicsBody object.
     *
     * @param xFormat the format string for the x value of the PhysicsBody object
     * @param yFormat the format string for the y value of the PhysicsBody object
     */
    public AdvancedPhysicsFormatter(String xFormat, String yFormat) {
        this.xFormat = xFormat;
        this.yFormat = yFormat;
    }

    AdvancedPhysicsFormatter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Formats the given PhysicsBody object into a string with advanced formatting
     * options. The x and y values are formatted using the format strings specified
     * in the constructor.
     *
     * @param body the PhysicsBody object to format
     * @return a string representation of the PhysicsBody object with advanced formatting options
     */
    public String format(PhysicsBody body) {
        String x = String.format(xFormat, body.getX());
        String y = String.format(yFormat, body.getY());

        return """
               Advanced Physics Results:
               X-Coordinate: """ + x + "\n" +
                "Y-Coordinate: " + y;
    }

    @Override
    public String format(PhysicsBody result, int decimals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
