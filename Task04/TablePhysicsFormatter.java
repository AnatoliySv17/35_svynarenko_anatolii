import java.util.List;

public class TablePhysicsFormatter implements PhysicsFormatter {
    private final String[] columnHeaders;

 public TablePhysicsFormatter(String[] columnHeaders) {
    this.columnHeaders = columnHeaders;
}

public String format(PhysicsResult result) {
    if (!(result instanceof TablePhysicsResult)) {
        return null;
    }

    TablePhysicsResult tableResult = (TablePhysicsResult) result;
    List<String> columnNames = tableResult.getColumnNames();
    List<List<Double>> rows = tableResult.getRows();

    StringBuilder sb = new StringBuilder();

    // Print table header
    for (String column : columnHeaders) {
        sb.append(String.format("%-20s", column));
    }
    sb.append("\n");

    // Print table rows
    for (List<Double> row : rows) {
        for (int i = 0; i < columnHeaders.length; i++) {
            if (i < columnNames.size() && columnNames.get(i).equals(columnHeaders[i])) {
                sb.append(String.format("%-20s", row.get(i)));
            } else {
                sb.append(String.format("%-20s", ""));
            }
        }
        sb.append("\n");
    }

    return sb.toString();
}

    @Override
    public String format(double result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}