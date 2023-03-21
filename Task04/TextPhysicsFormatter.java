public class TextPhysicsFormatter implements PhysicsFormatter {
    private final int decimalPlaces;

    public TextPhysicsFormatter(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public String format(double result) {
        return String.format("%." + decimalPlaces + "f", result);
    }

    @Override
    public String forceFormat(double result) {
        String formatString = "Result: %.2e";
        return String.format(formatString, result);
    }
}
