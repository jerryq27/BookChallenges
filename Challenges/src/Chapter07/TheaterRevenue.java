package Chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gerardo on 12/26/2014.
 */
public class TheaterRevenue extends JFrame {

    private JLabel adultTicketPrice, adultTicketSold, childTicketPrice, childTicketSold;
    private JTextField adultPriceField, adultSoldField, childPriceField, childSoldField;
    private JButton calculate;

    private final int WIDTH = 200;
    private final int HEIGHT = 250;
    private final float BOX_OFFICE_RECEIPTS = 0.2f;

    public TheaterRevenue() {
        setTitle("Theater Revenue");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        buildComponents();

        setVisible(true);
    }

    private void buildComponents() {
        adultTicketPrice = new JLabel("Adult ticket price amount");
        adultTicketSold = new JLabel("Adult tickets sold");
        childTicketPrice = new JLabel("Child ticket price amount");
        childTicketSold = new JLabel("Child tickets sold");

        adultPriceField = new JTextField(10);
        adultSoldField = new JTextField(10);
        childPriceField = new JTextField(10);
        childSoldField = new JTextField(10);

        calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!adultPriceField.getText().equals("") && !adultSoldField.getText().equals("")
                        && !childPriceField.getText().equals("") && !childSoldField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Fields are all filled!");
                }
                else
                    JOptionPane.showMessageDialog(null, "All fields must be filled!");

            }
        });

        add(adultTicketPrice);
        add(adultPriceField);

        add(adultTicketSold);
        add(adultSoldField);

        add(childTicketPrice);
        add(childPriceField);

        add(childTicketSold);
        add(childSoldField);

        add(calculate);
    }

    public static void main(String[] args) {
        new TheaterRevenue();
    }
}
