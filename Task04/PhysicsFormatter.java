/**
 * A class for formatting the result of physical calculations into a text table with user-defined parameters.
 */
public abstract class PhysicsFormatter {
    
    /**
     * Formats the result of physical calculations into a text table using user-defined parameters.
     *
     * @param result   the result of physical calculations
     * @param decimals the number of decimal places to display numbers in the table
     * @return a text table with the result of physical calculations
     */
    public abstract String format(PhysicsBody result, int decimals);

    /**
     * This method is not implemented in this abstract class.
     * @param body a PhysicsBody object
     * @return UnsupportedOperationException
     */
    String format(PhysicsBody body) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
