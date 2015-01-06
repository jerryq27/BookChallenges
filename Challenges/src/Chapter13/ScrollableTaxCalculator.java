package Chapter13;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class ScrollableTaxCalculator extends JFrame {

    private JLabel messageLabel;
    private JTextField entryField, sliderField;
    private JSlider taxSlider;
    private JButton calculate;
    private JPanel panel;


    public ScrollableTaxCalculator() {

        setTitle("Scrollable Tax Calculator");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        constructPanel();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void constructPanel() {
        messageLabel = new JLabel("Purchase amount ");
        entryField = new JTextField(10);

        taxSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        taxSlider.setMajorTickSpacing(2);
        taxSlider.setMinorTickSpacing(1);
        taxSlider.setPaintTicks(true);
        taxSlider.setPaintLabels(true);
        taxSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sliderField.setText(String.valueOf(taxSlider.getValue()));
            }
        });


        sliderField = new JTextField(10);
        sliderField.setEditable(false);
        sliderField.setText(String.valueOf(taxSlider.getValue()));

        calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(entryField.getText());
                double tax = taxSlider.getValue();
                tax = tax/100;

                JOptionPane.showMessageDialog(null, "The total tax for the item is $" + (amount * tax) + ".", "Total", 1);
            }
        });

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));
        panel.add(messageLabel);
        panel.add(entryField);
        panel.add(sliderField);
        panel.add(taxSlider);
        panel.add(calculate);
    }


    public static void main(String[] args) {
        new ScrollableTaxCalculator();
    }
}
