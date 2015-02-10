package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Gerardo on 2/5/2015.
 */
public class GridFiller extends JPanel {

    private boolean[][] filledSquares;

    public GridFiller() {
        setPreferredSize(new Dimension(400, 400));
        addMouseListener(new ClickListener());

        filledSquares = new boolean[4][4];
        fillBooleans();
    }

    private void fillBooleans() {
        for(int row = 0; row < filledSquares.length; row++)
        {
            for(int col = 0; col < filledSquares[row].length; col++)
            {
                filledSquares[row][col] = false;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        drawGrid(g2d);
        drawCircles(g2d);
    }

    private void drawGrid(Graphics2D g2d) {
        for(int row = 0; row < 4; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                g2d.drawRect(row * 100, col * 100, 100, 100);
            }
        }
    }

    private void drawCircles(Graphics2D g2d) {
        for(int row = 0; row < filledSquares.length; row++)
        {
            for(int col = 0; col < filledSquares[row].length; col++)
            {
                if(filledSquares[row][col] == true)
                    g2d.fillOval(col * 100, row * 100, 100, 100);
            }
        }
    }

    private void checkClick(int clickX, int clickY) {
        for(int row = 0; row < filledSquares.length; row++)
        {
            for(int col = 0; col < filledSquares[row].length; col++)
            {
                if(clickX >= col * 100 && clickY >= row * 100)
                {
                    if(clickX <= ((col + 1) * 100) && clickY <= ((row + 1) * 100))
                    {
                        if(filledSquares[row][col] == false)
                            filledSquares[row][col] = true;
                        else if(filledSquares[row][col])
                            filledSquares[row][col] = false;

                        repaint();
                    }
                }
            }
        }
    }

    private class ClickListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            checkClick(e.getX(), e.getY());
        }

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Grid Filler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(new GridFiller());
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}