package Chapter14;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by Gerardo on 2/5/2015.
 */
public class Thermometer extends JPanel {

    private JSlider slider;
    private final int MAX_CELCIUS = 100;
    private int temperature = 0;

    public Thermometer() {
        setPreferredSize(new Dimension(300, 300));
        constructSlider();
        add(slider);
    }

    private void constructSlider() {
        slider = new JSlider(JSlider.HORIZONTAL);
        slider.setMaximum(MAX_CELCIUS);
        slider.setMinimum(0);
        slider.setValue(0);

        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                temperature = slider.getValue();
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        drawThermometer(g2d);

    }

    private void drawThermometer(Graphics2D g2d) {
        if(temperature >= 80)
            g2d.setColor(Color.RED);
        else if(temperature <= 20)
            g2d.setColor(Color.CYAN);
        else
            g2d.setColor(Color.GREEN);

        g2d.fillRect(125, 250 - temperature, 50, temperature);

        g2d.setColor(Color.BLACK);
        g2d.drawRect(125, 150, 50, 100);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Thermometer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(new Thermometer());
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}