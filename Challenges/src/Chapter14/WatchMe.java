package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Gerardo on 1/28/2015.
 */
public class WatchMe extends JPanel {

    private int eye1X = 165, eye1Y = 175;
    private int eye2X = 215, eye2Y = 175;
    private final int WIDTH = 400, HEIGHT = 400;
    private boolean lookingLeft = false, lookingRight = false, lookingUp = false, lookingDown = false;

    public WatchMe() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
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
                lookingUp = false;
                lookingDown = false;
                lookingLeft = false;
                lookingRight = false;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {
                if(e.getX() >= 160 && e.getX() <= 240) //Use eyes to determine position.
                {
                    if(e.getX() < HEIGHT/2 && e.getY() < HEIGHT/2) //Determine where on the screen.
                    {
                        lookingUp = true;
                        lookingDown = false;
                        lookingLeft = false;
                        lookingRight = false;
                        repaint();
                        return;
                    }
                }
                if(e.getX() >= 160 && e.getX() <= 240)
                {
                    if(e.getX() > HEIGHT/2 && e.getY() > HEIGHT/2)
                    {
                        lookingUp = false;
                        lookingDown = true;
                        lookingLeft = false;
                        lookingRight = false;
                        repaint();
                        return;
                    }
                }

                if(e.getY() >= 160 && e.getY() <= 210)
                {
                    if(e.getY() < WIDTH/2 && e.getX() < WIDTH/2)
                    {
                        lookingUp = false;
                        lookingDown = false;
                        lookingLeft = true;
                        lookingRight = false;
                        repaint();
                        return;
                    }
                }
                if(e.getY() >= 160 && e.getY() <= 210)
                {
                    if(e.getY() > WIDTH/2 && e.getX() > WIDTH/2)
                    {
                        lookingUp = false;
                        lookingDown = false;
                        lookingLeft = false;
                        lookingRight = true;
                        repaint();
                        return;
                    }
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Smoother lines.
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(lookingUp)
        {
            g2d.drawOval(160, 160, 30, 50);
            g2d.fillOval(eye1X, eye1Y - 10, 20, 20);

            g2d.drawOval(210, 160, 30, 50);
            g2d.fillOval(eye2X, eye2Y - 10, 20, 20);
        }
        else if(lookingDown)
        {
            g2d.drawOval(160, 160, 30, 50);
            g2d.fillOval(eye1X, eye1Y + 10, 20, 20);

            g2d.drawOval(210, 160, 30, 50);
            g2d.fillOval(eye2X, eye2Y + 10, 20, 20);
        }
        else if(lookingLeft)
        {
            g2d.drawOval(160, 160, 30, 50);
            g2d.fillOval(eye1X - 5, eye1Y, 20, 20);

            g2d.drawOval(210, 160, 30, 50);
            g2d.fillOval(eye2X - 5, eye2Y, 20, 20);
        }
        else if(lookingRight)
        {
            g2d.drawOval(160, 160, 30, 50);
            g2d.fillOval(eye1X + 5, eye1Y, 20, 20);

            g2d.drawOval(210, 160, 30, 50);
            g2d.fillOval(eye2X + 5, eye2Y, 20, 20);
        }
        else
        {
            g2d.drawOval(160, 160, 30, 50);
            g2d.fillOval(eye1X, eye1Y, 20, 20);

            g2d.drawOval(210, 160, 30, 50);
            g2d.fillOval(eye2X, eye2Y, 20, 20);
        }

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Watch Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(new WatchMe());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
