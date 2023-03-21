

import java.awt.Color;
import java.awt.Graphics;

public class GraphicPhysicsFormatter implements PhysicsFormatter {
    private int width;
    private int height;

    public GraphicPhysicsFormatter(int width, int height) {
        this.width = width;
        this.height = height;
    }

    GraphicPhysicsFormatter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String format(double result) {
        return ""; // Not used for graphic output
    }

    public void draw(PhysicsBody result, Graphics g) {
        int x = (int) (result.getX() * width);
        int y = (int) (result.getY() * height);

        g.setColor(Color.BLACK);
        g.fillOval(x - 5, y - 5, 10, 10);
    }
}
