package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Created by Gerardo on 1/12/2015.
 */
public class ConferenceRegistrationSystem extends JFrame {

    private JPanel titlePanel, regPanel, optPanel, workshopPanel, buttonPanel;
    private JRadioButton generalButton, studentButton;
    private ButtonGroup regTypeGroup;
    private JCheckBox optCheckBox;
    private JCheckBox introCheckBox, futureCheckBox, javaCheckBox, networkCheckBox;
    private JTextField totalField;
    private JButton calculate, reset;
    private double total = 0;
    private DecimalFormat formatter = new DecimalFormat("####0.00");

    public ConferenceRegistrationSystem() {
        setTitle("Conference Registration System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        createTitlePanel();
        createRegPanel();
        createOptPanel();
        createWorkshopPanel();
        constructButtonPanel();

        add(titlePanel, BorderLayout.NORTH);
        add(regPanel, BorderLayout.WEST);
        add(optPanel, BorderLayout.CENTER);
        add(workshopPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createTitlePanel() {
        titlePanel = new JPanel();
        titlePanel.setBorder(BorderFactory.createTitledBorder("Total"));

        totalField = new JTextField(10);
        totalField.setEditable(false);
        updateTitle(0, false);

        titlePanel.add(totalField);
    }

    private void createRegPanel() {
        regPanel = new JPanel();
        regPanel.setLayout(new GridLayout(2, 1));
        regPanel.setBorder(BorderFactory.createTitledBorder("Registration Type"));

        generalButton = new JRadioButton("General Registration: $895.00");
        studentButton = new JRadioButton("Student Registration: $495.00");

        regTypeGroup = new ButtonGroup();
        regTypeGroup.add(generalButton);
        regTypeGroup.add(studentButton);

        regPanel.add(generalButton);
        regPanel.add(studentButton);
    }

    private void createOptPanel() {
        optPanel = new JPanel();
        optPanel.setBorder(BorderFactory.createTitledBorder("Optional"));

        optCheckBox = new JCheckBox("Opening night dinner w/ Keynote speech: $30.00");

        optPanel.add(optCheckBox);
    }

    private void createWorkshopPanel() {
        workshopPanel = new JPanel();
        workshopPanel.setBorder(BorderFactory.createTitledBorder("Workshops"));
        workshopPanel.setLayout(new GridLayout(4, 1));

        introCheckBox = new JCheckBox("Intro. to E-commerce: $295.00");
        futureCheckBox = new JCheckBox("The Future of the Web: $295.00");
        javaCheckBox = new JCheckBox("Advanced Java Programming: $395.00");
        networkCheckBox = new JCheckBox("Network Security: $395.00");

        workshopPanel.add(introCheckBox);
        workshopPanel.add(futureCheckBox);
        workshopPanel.add(javaCheckBox);
        workshopPanel.add(networkCheckBox);
    }

    private void constructButtonPanel() {
        buttonPanel = new JPanel();

        calculate = new JButton("Calculate");
        reset = new JButton("Reset");

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTitle(0, true);

                if(generalButton.isSelected())
                    updateTitle(895, false);
                else if(studentButton.isSelected())
                    updateTitle(495, false);

                if(optCheckBox.isSelected())
                    updateTitle(30, false);

                if(introCheckBox.isSelected())
                    updateTitle(295, false);
                if(futureCheckBox.isSelected())
                    updateTitle(295, false);
                if(javaCheckBox.isSelected())
                    updateTitle(395, false);
                if(networkCheckBox.isSelected())
                    updateTitle(395, false);
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTitle(0, true);
            }
        });

        buttonPanel.add(calculate);
        buttonPanel.add(reset);
    }

    private void updateTitle(double num, boolean isReset) {

        if(isReset)
            total = num;
        else
            total += num;

        totalField.setText("$" + formatter.format(total));
    }

    public static void main(String[] args) {
        new ConferenceRegistrationSystem();
    }
}