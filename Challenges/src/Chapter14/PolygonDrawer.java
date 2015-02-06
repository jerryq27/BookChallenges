package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Gerardo on 2/5/2015.
 */
public class PolygonDrawer extends JPanel {

    private int[] xCoords = new int[6];
    private int[] yCoords = new int[6];
    private int counter = 0;
    private boolean polygonFinished = false;

    public PolygonDrawer() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(!polygonFinished)
                {
                    xCoords[counter] = e.getX();
                    yCoords[counter] = e.getY();
                    counter++;
                }
                if (counter == 5) {
                    polygonFinished = true;
                    repaint();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {
                if(polygonFinished)
                {
                    counter = 0;
                    polygonFinished = false;
                    repaint();
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        if(polygonFinished)
            g.fillPolygon(xCoords, yCoords, 5);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Polygon Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(new PolygonDrawer());
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}