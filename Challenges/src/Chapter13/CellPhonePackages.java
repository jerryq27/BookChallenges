package Chapter13;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerardo on 1/7/2015.
 */
public class CellPhonePackages extends JFrame {

    private JMenuBar menuBar;
    private JMenu packages, phones, other;
    private JMenuItem package1, package2, package3;
    private JMenuItem phone1, phone2, phone3;
    private JMenuItem other1, other2;

    private JLabel packageLabel, phoneLabel, otherLabel, totalLabel;
    private JTextField packageField, phoneField, otherField, totalField;

    public CellPhonePackages() {
        setTitle("Cell Phone Packages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        constructLabels();
        constructMenuBar();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void constructLabels() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(190, 100));

        packageLabel = new JLabel("Package ");
        packageField = new JTextField(10);
        phoneLabel = new JLabel("Phone ");
        phoneField = new JTextField(10);
        otherLabel = new JLabel("Other ");
        otherField = new JTextField(10);
        totalLabel = new JLabel("Total");
        totalField = new JTextField(10);

        packageField.setEditable(false);
        phoneField.setEditable(false);
        otherField.setEditable(false);
        totalField.setEditable(false);

        panel.add(packageLabel);
        panel.add(packageField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(otherLabel);
        panel.add(otherField);
        panel.add(totalLabel);
        panel.add(totalField);

        add(panel);
    }

    private void constructMenuBar() {
        menuBar = new JMenuBar();
        constructPackageMenu();
        constructPhoneMenu();
        constructOtherMenu();

        menuBar.add(packages);
        menuBar.add(phones);
        menuBar.add(other);

       setJMenuBar(menuBar);
    }

    private void constructPackageMenu() {
        packages = new JMenu("Packages");

        package1 = new JMenuItem("300 minutes/month");
        package2 = new JMenuItem("800 minutes/month");
        package3 = new JMenuItem("1500 minutes/month");

        packages.add(package1);
        packages.add(package2);
        packages.add(package3);
    }

    private void constructPhoneMenu() {
        phones = new JMenu("Phones");

        phone1 = new JMenuItem("Model 100");
        phone2 = new JMenuItem("Model 110");
        phone3 = new JMenuItem("Model 200");

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
    }

    private void constructOtherMenu() {
        other = new JMenu("Other");

        other1 = new JMenuItem("Voice mail");
        other2 = new JMenuItem("Text messaging");

        other.add(other1);
        other.add(other2);
    }


    public static void main(String[] args) {
        new CellPhonePackages();
    }
}
