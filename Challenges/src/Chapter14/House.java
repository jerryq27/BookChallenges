package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Gerardo on 1/29/2015.
 */
public class House extends JPanel {

    private int[] roofX = {65, 197, 330}; //X-coordinates of the roof.
    private int[] roofY = {175, 110, 175}; //Y-coordinates of the roof.

    private boolean doorOpened = false, rWindowOpen = false, lWindowOpen = false;

    public House() {
        setPreferredSize(new Dimension(400, 400));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Check the door. 177, 235, 40, 65
                if(e.getX() >= 177 && e.getX() <= 217 && e.getY() >= 235 && e.getY() <= 300)
                {
                    if(!doorOpened)
                        doorOpened = true;
                    else
                        doorOpened = false;

                    repaint();
                }

                //Check the left window. 95, 185, 50, 50
                if(e.getX() >= 95 && e.getX() <= 145 && e.getY() >= 185 && e.getY() <= 235)
                {
                    if(!lWindowOpen)
                        lWindowOpen = true;
                    else
                        lWindowOpen = false;

                    repaint();
                }

                //Check the right window. 249, 185, 50, 50
                if(e.getX() >= 249 && e.getX() <= 299 && e.getY() >= 185 && e.getY() <= 235)
                {
                    if(!rWindowOpen)
                        rWindowOpen = true;
                    else
                        rWindowOpen = false;

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
            public void mouseExited(MouseEvent e) {}
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        drawHouse(g2d);
        drawRoof(g2d);
        drawDoor(g2d);
        drawWindows(g2d);
    }

    private void drawHouse(Graphics2D g2d) {
        g2d.drawRect(85, 175, 225, 125); //Draw the house.
    }

    private void drawRoof(Graphics2D g2d) {
        g2d.drawPolygon(roofX, roofY, 3); //Draw the roof.
    }

    private void drawDoor(Graphics2D g2d) {
        if(!doorOpened)
        {
            g2d.drawRect(177, 235, 40, 65); //Draw the closed door
            g2d.fillOval(210, 265, 5, 5);
        }
        else if(doorOpened)
            g2d.fillRect(177, 235, 40, 65); //Draw the open door.
    }

    private void drawWindows(Graphics2D g2d) {

        if(!lWindowOpen)
        {
            g2d.drawRect(95, 185, 50, 50); //Draw the left window.
            g2d.drawLine(95, 208, 145, 208);
            g2d.drawLine(120, 185, 120, 235);
        }
        else if(lWindowOpen)
            g2d.fillRect(95, 185, 50, 50); //Draw the open window.

        if(!rWindowOpen)
        {
            g2d.drawRect(249, 185, 50, 50); //Draw the right window.
            g2d.drawLine(249, 208, 299, 208);
            g2d.drawLine(274, 185, 274, 235);
        }
        else if(rWindowOpen)
            g2d.fillRect(249, 185, 50, 50); //Draw the open window.
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(new House());
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}