package Chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gerardo on 12/24/2014.
 */
public class MonthlySalesTax extends JFrame {

    private JLabel totalSales;
    private JTextField salesField;
    private JButton calculate;
    private JPanel panel;

    private final double STATE_TAX =  0.04;
    private final double COUNTY_TAX = 0.02;

    public MonthlySalesTax() {
        setTitle("Monthly Sales Tax");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(200, 125));

        panel = new JPanel();
        totalSales = new JLabel("Total sales: ");
        salesField = new JTextField(10);
        calculate = new JButton("Calculate");
        addComponents();
        add(panel);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double input = Double.parseDouble(salesField.getText());

                JOptionPane.showMessageDialog(null, "Count Sales Tax: $" + (input * COUNTY_TAX) +
                                                "\nState Sales Tax: $" + (input * STATE_TAX) +
                                                "\n\nThe total tax is $" + ((input * COUNTY_TAX) + (input * STATE_TAX)));
            }
        });

        setVisible(true);
    }

    private void addComponents() {
        panel.add(totalSales);
        panel.add(salesField);
        panel.add(calculate);
    }

    public static void main(String[] args) {
        new MonthlySalesTax();
    }
}
