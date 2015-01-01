package Chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Gerardo on 12/23/2014.
 */
public class RetailPriceCalculator extends JFrame {

    private JLabel priceLabel, markupPercLabel;
    private JTextField priceField, markupPercField;
    private JButton calculate;
    private JPanel pricePanel, percentagePanel, buttonPanel;

    public RetailPriceCalculator() {

        setTitle("Retail Price Calculator");
        setSize(300, 175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        pricePanel = new JPanel();
        percentagePanel = new JPanel();
        buttonPanel = new JPanel();

        priceLabel = new JLabel("Item Cost: ");
        markupPercLabel = new JLabel("Markup Percentage: ");

        priceField = new JTextField(10);
        markupPercField = new JTextField(10);

        calculate = new JButton("Calculate");

        addComponents();
        add(pricePanel);
        add(percentagePanel);
        add(buttonPanel);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(priceField.getText());
                double percentage = Double.parseDouble(markupPercField.getText());
                double calculatedTotal = price + (price * percentage);

                JOptionPane.showMessageDialog(null, "The calculated total of the item is $" + calculatedTotal + ".", "Results", 1);
            }
        });
        setVisible(true);
    }

    public void addComponents() {
        pricePanel.add(priceLabel);
        pricePanel.add(priceField);

        percentagePanel.add(markupPercLabel);
        percentagePanel.add(markupPercField);

        buttonPanel.add(calculate);
    }

    public static void main(String[] args) {
        new RetailPriceCalculator();
    }
}
