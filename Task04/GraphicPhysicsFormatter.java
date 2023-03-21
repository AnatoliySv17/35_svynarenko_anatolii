/**
 *
 * @author 38095
 */
public class GraphicPhysicsFormatter implements PhysicsFormatter {
    private final int precision;

    @Override
    public String forceFormat(double result) {
        String formatString = "Result: %.2e";
        return String.format(formatString, result);
    }
    public GraphicPhysicsFormatter(int precision) {
        this.precision = precision;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public String format(double value) {
        String formatString = "%." + precision + "f";
        return String.format(formatString, value);
    }

    public String format(String value) {
        return value;
    }

    public String format(Vector2D value) {
        String x = format(value.getX());
        String y = format(value.getY());
        return String.format("(%s, %s)", x, y);
    }

    public String formatTable(PhysicsTable table) {
        StringBuilder sb = new StringBuilder();
        String[] headers = table.getHeaders();
        String[][] data = table.getData();

        // Find column widths
        int[] widths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            widths[i] = headers[i].length();
            for (String[] row : data) {
                widths[i] = Math.max(widths[i], row[i].length());
            }
        }

        // Format headers
        for (int i = 0; i < headers.length; i++) {
            sb.append(pad(headers[i], widths[i]));
            if (i < headers.length - 1) {
                sb.append("  ");
            }
        }
        sb.append("\n");

        // Format data
        for (String[] row : data) {
            for (int i = 0; i < row.length; i++) {
                sb.append(pad(row[i], widths[i]));
                if (i < row.length - 1) {
                    sb.append("  ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private String pad(String s, int length) {
        if (s.length() >= length) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < length - s.length(); i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static class PhysicsTable {
        private String[] headers;
        private String[][] data;

        public PhysicsTable(String[] headers, String[][] data) {
            this.headers = headers;
            this.data = data;
        }

        public String[] getHeaders() {
            return headers;
        }

        public String[][] getData() {
            return data;
        }
    }
}
