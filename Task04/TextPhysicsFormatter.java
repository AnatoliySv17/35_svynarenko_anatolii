public class TextPhysicsFormatter implements PhysicsFormatter {
    private final int decimalPlaces;

    public TextPhysicsFormatter(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public String format(double result) {
        return String.format("%." + decimalPlaces + "f", result);
    }

    public String formatTable(double[][] table) {
        StringBuilder sb = new StringBuilder();

        for (double[] row : table) {
            for (double cell : row) {
                sb.append(String.format("%." + decimalPlaces + "f", cell));
                sb.append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
