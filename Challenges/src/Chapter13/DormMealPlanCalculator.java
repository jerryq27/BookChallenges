package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Gerardo on 1/5/2015.
 */
public class DormMealPlanCalculator extends JFrame {

    private JLabel dormLabel, mealLabel;
    private JComboBox dormCBox, mealCBox;
    private JButton calculate;
    private JPanel dormPanel, mealPanel, buttonPanel;

    private String[] dorms = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
    private String[] plans = {"7 Meals/week", "14 Meals/week", "Unlimited Meals"};


    public DormMealPlanCalculator() {

        setTitle("Dorm and Meal Plan Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3, 1));

        buildDormPanel();
        buildMealPanel();
        buildButtonPanel();

        add(dormPanel);
        add(mealPanel);
        add(buttonPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildDormPanel() {
        dormPanel = new JPanel();
        dormLabel = new JLabel("Choose a dorm");
        dormCBox = new JComboBox(dorms);

        dormPanel.add(dormLabel);
        dormPanel.add(dormCBox);
    }

    private void buildMealPanel() {
        mealPanel = new JPanel();
        mealLabel = new JLabel("Choose a meal plan");
        mealCBox = new JComboBox(plans);

        mealPanel.add(mealLabel);
        mealPanel.add(mealCBox);
    }

    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        calculate = new JButton("Calculate");

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dormPrice = 0;
                double mealPrice = 0;
                String dorm;
                String meal;

                dorm = dorms[dormCBox.getSelectedIndex()];
                meal = plans[mealCBox.getSelectedIndex()];

                if(dorm.equals(dorms[0]))
                    dormPrice = 1500;
                else if(dorm.equals(dorms[1]))
                    dormPrice = 1600;
                else if(dorm.equals(dorms[2]))
                    dormPrice = 1200;
                else if(dorm.equals(dorms[3]))
                    dormPrice = 1800;

                if(meal.equals(plans[0]))
                    mealPrice = 560;
                else if(meal.equals(plans[1]))
                    mealPrice = 1095;
                else if(meal.equals(plans[2]))
                    mealPrice = 1500;


                JOptionPane.showMessageDialog(null, "Total cost per semester: $" + (dormPrice + mealPrice));
            }
        });

        buttonPanel.add(calculate);
    }

    public static void main(String[] args) {
        new DormMealPlanCalculator();
    }
}