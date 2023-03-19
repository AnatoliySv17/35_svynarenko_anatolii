import java.util.List;

public class TablePhysicsResult extends PhysicsResult {
    private final List<String> columnNames;
    private final List<List<Double>> rows;

    public TablePhysicsResult(String name, double x, double y, double velocityX, double velocityY, double accelerationX, double accelerationY, double forceX, double forceY, List<String> columnNames, List<List<Double>> rows) {
        super(name, x, y, velocityX, velocityY, accelerationX, accelerationY, forceX, forceY);
        this.columnNames = columnNames;
        this.rows = rows;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public List<List<Double>> getRows() {
        return rows;
    }
}
