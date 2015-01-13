package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Created by Gerardo on 1/12/2015.
 */
public class ShadeDesigner extends JFrame {

    private JPanel titlePanel, stylePanel, sizePanel, colorPanel;
    private JRadioButton regButton, foldButton, romanButton;
    private JRadioButton inch25Button, inch27Button, inch32Button, inch40Button;
    private JRadioButton naturalButton, blueButton, tealButton, redButton, greenButton;
    private ButtonGroup styleGroup, sizeGroup, colorGroup;
    private JTextField totalField;

    private final double BASE_PRICE = 50.00;
    private DecimalFormat formatter = new DecimalFormat("##.00");
    private double total = 0;

    public ShadeDesigner() {
        setTitle("Shade Designer");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);

        constructTitlePanel();
        add(titlePanel, BorderLayout.NORTH);
        constructStylePanel();
        add(stylePanel, BorderLayout.WEST);
        constructSizePanel();
        add(sizePanel, BorderLayout.CENTER);
        constructColorPanel();
        add(colorPanel, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void constructTitlePanel() {
        titlePanel = new JPanel();
        titlePanel.setBorder(BorderFactory.createTitledBorder("Total"));

        totalField = new JTextField();
        totalField.setEditable(false);
        updateTotal(BASE_PRICE);

        titlePanel.add(totalField);
    }

    private void constructStylePanel() {
        stylePanel = new JPanel();
        stylePanel.setBorder(BorderFactory.createTitledBorder("Style"));
        stylePanel.setLayout(new GridLayout(3, 1));

        regButton = new JRadioButton("Regular Shades: $0.00");
        foldButton = new JRadioButton("Folding Shades: $10.00");
        romanButton = new JRadioButton("Roman Shades: $15.00");

        foldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(10);
            }
        });
        romanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(15);
            }
        });

        styleGroup = new ButtonGroup();
        styleGroup.add(regButton);
        styleGroup.add(foldButton);
        styleGroup.add(romanButton);

        stylePanel.add(regButton);
        stylePanel.add(foldButton);
        stylePanel.add(romanButton);
    }

    private void constructSizePanel() {
        sizePanel = new JPanel();
        sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
        sizePanel.setLayout(new GridLayout(4, 1));

        inch25Button = new JRadioButton("25 inches wide: $0.00");
        inch27Button = new JRadioButton("27 inches wide: $2.00");
        inch32Button = new JRadioButton("32 inches wide: $4.00");
        inch40Button = new JRadioButton("40 inches wide: $6.00");

        inch27Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(2);
            }
        });
        inch32Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(4);
            }
        });
        inch40Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(6);
            }
        });

        sizeGroup = new ButtonGroup();
        sizeGroup.add(inch25Button);
        sizeGroup.add(inch27Button);
        sizeGroup.add(inch32Button);
        sizeGroup.add(inch40Button);

        sizePanel.add(inch25Button);
        sizePanel.add(inch27Button);
        sizePanel.add(inch32Button);
        sizePanel.add(inch40Button);
    }

    private void constructColorPanel() {
        colorPanel = new JPanel();
        colorPanel.setBorder(BorderFactory.createTitledBorder("Color"));
        colorPanel.setLayout(new GridLayout(5, 1));

        naturalButton = new JRadioButton("Natural: $5.00");
        blueButton = new JRadioButton("Blue: $0.00");
        tealButton = new JRadioButton("Teal: $0.00");
        redButton = new JRadioButton("Red: $0.00");
        greenButton = new JRadioButton("Green: $0.00");

        naturalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotal(5);
            }
        });

        colorGroup = new ButtonGroup();
        colorGroup.add(naturalButton);
        colorGroup.add(blueButton);
        colorGroup.add(tealButton);
        colorGroup.add(redButton);
        colorGroup.add(greenButton);

        colorPanel.add(naturalButton);
        colorPanel.add(blueButton);
        colorPanel.add(tealButton);
        colorPanel.add(redButton);
        colorPanel.add(greenButton);
    }

    private void updateTotal(double amount) {
        total += amount;
        totalField.setText("$" + formatter.format(total));
    }


    public static void main(String[] args) {
        new ShadeDesigner();
    }
}