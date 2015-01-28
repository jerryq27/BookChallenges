package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Gerardo on 1/14/2015.
 */
public class FollowMe extends JPanel {

    private int mouseX = 180, mouseY = 180;
    private String message = "Hello";

    public FollowMe() {
        setPreferredSize(new Dimension(400, 400));

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {
                mouseX = 180;
                mouseY = 180;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, mouseX, mouseY);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Follow Me");
        frame.setResizable(false);

        frame.add(new FollowMe());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
