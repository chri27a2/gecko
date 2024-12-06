import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class CustomPanel extends JPanel {
    private int squareX = 10;
    private int squareY = 10;
    private boolean isMousePressed = false;

    public CustomPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isMousePressed = true;
                squareX = e.getX();
                squareY = e.getY();
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isMousePressed) {
                    squareX = e.getX();
                    squareY = e.getY();
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the parent class's paint method

        if (isMousePressed) {
            g.setColor(Color.RED);
            g.fillRect(squareX - 10, squareY - 10, 20, 20); // Center the square on the mouse
        }
    }
}
