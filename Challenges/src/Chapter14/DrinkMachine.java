package Chapter14;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerardo on 2/9/2015.
 */
public class DrinkMachine extends JPanel {

    public DrinkMachine() {
        setPreferredSize(new Dimension(300, 300));
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Drink Machine");
        frame.setResizable(false);

        frame.add(new DrinkMachine());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}