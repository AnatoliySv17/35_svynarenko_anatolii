import java.util.List;

public class TablePrinter {
    private final TableConfig tableConfig;

    public TablePrinter(TableConfig tableConfig) {
        this.tableConfig = tableConfig;
    }

    public void print(List<String[]> rows) {
        int[] colWidths = computeColumnWidths(rows);
        String tableBorder = generateBorder(colWidths);
        String tableHeader = generateHeader(colWidths);
        String tableBody = generateBody(rows, colWidths);

        System.out.println(tableBorder);
        System.out.println(tableHeader);
        System.out.println(tableBorder);
        System.out.println(tableBody);
        System.out.println(tableBorder);
    }

    private int[] computeColumnWidths(List<String[]> rows) {
        int numCols = rows.get(0).length;
        int[] colWidths = new int[numCols];

        for (String[] row : rows) {
            for (int i = 0; i < numCols; i++) {
                colWidths[i] = Math.max(colWidths[i], row[i].length());
            }
        }

        return colWidths;
    }

    private String generateBorder(int[] colWidths) {
        StringBuilder sb = new StringBuilder();

        sb.append(tableConfig.getCornerChar());
        for (int colWidth : colWidths) {
            sb.append(repeatChar(tableConfig.getHorizontalChar(), colWidth));
            sb.append(tableConfig.getCornerChar());
        }
        sb.append("\n");

        return sb.toString();
    }

    private String generateHeader(int[] colWidths) {
        StringBuilder sb = new StringBuilder();

        sb.append(tableConfig.getVerticalChar());
        for (int i = 0; i < colWidths.length; i++) {
            sb.append(padString(tableConfig.getHeader()[i], colWidths[i]));
            sb.append(tableConfig.getVerticalChar());
        }
        sb.append("\n");

        return sb.toString();
    }

    private String generateBody(List<String[]> rows, int[] colWidths) {
        StringBuilder sb = new StringBuilder();

        for (String[] row : rows) {
            sb.append(tableConfig.getVerticalChar());
            for (int i = 0; i < row.length; i++) {
                sb.append(padString(row[i], colWidths[i]));
                sb.append(tableConfig.getVerticalChar());
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private String repeatChar(char c, int numTimes) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numTimes; i++) {
            sb.append(c);
        }

        return sb.toString();
    }

    private String padString(String s, int desiredLength) {
        StringBuilder sb = new StringBuilder(s);
        int numSpacesToAdd = desiredLength - s.length();

        for (int i = 0; i < numSpacesToAdd; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
