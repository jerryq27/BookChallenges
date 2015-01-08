package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by Gerardo on 1/6/2015.
 */
public class SkateboardDesigner extends JFrame {

    private JList deckList, truckList, wheelList, miscelList;
    private JPanel listPanel, buttonPanel;
    private JButton calculate;

    private String[] decks = {"The Master Thrasher", "The Dictator", "The Street King"};
    private String[] trucks = {"7.75 inch axle", "8 inch axle", "8.5 inch axle"};
    private String[] wheels = {"51mm", "55mm", "58mm", "61mm"};
    private String[] miscels = {"Grip Tape", "Bearings", "Riser pads", "Nuts & bolts kit"};

    public SkateboardDesigner() {
        setTitle("Skateboard Designer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(2, 1));

        constructLists();
        constructButton();
        add(listPanel);
        add(buttonPanel);
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void constructLists() {
        listPanel = new JPanel();

        deckList = new JList(decks);
        truckList = new JList(trucks);
        wheelList = new JList(wheels);
        miscelList = new JList(miscels);

        deckList.setVisibleRowCount(3);
        truckList.setVisibleRowCount(3);
        wheelList.setVisibleRowCount(3);
        miscelList.setVisibleRowCount(3);

        miscelList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane deckScroll = new JScrollPane(deckList);
        JScrollPane truckScroll = new JScrollPane(truckList);
        JScrollPane wheelScroll = new JScrollPane(wheelList);
        JScrollPane miscelScroll = new JScrollPane(miscelList);

        deckScroll.setBorder(BorderFactory.createTitledBorder("Decks"));
        truckScroll.setBorder(BorderFactory.createTitledBorder("Truck Assemblies"));
        wheelScroll.setBorder(BorderFactory.createTitledBorder("Wheels"));
        miscelScroll.setBorder(BorderFactory.createTitledBorder("Miscellaneous Products"));

        listPanel.add(deckScroll);
        listPanel.add(truckScroll);
        listPanel.add(wheelScroll);
        listPanel.add(miscelScroll);
    }

    private void constructButton() {
        buttonPanel = new JPanel();
        calculate = new JButton("Calculate");

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                if(decks[deckList.getSelectedIndex()].equals(decks[0]))
                    total += 60;
                else if(decks[deckList.getSelectedIndex()].equals(decks[1]))
                    total += 45;
                else if(decks[deckList.getSelectedIndex()].equals(decks[2]))
                    total += 50;

                if(trucks[truckList.getSelectedIndex()].equals(trucks[0]))
                    total += 35;
                else if(trucks[truckList.getSelectedIndex()].equals(trucks[1]))
                    total += 40;
                else if(trucks[truckList.getSelectedIndex()].equals(trucks[2]))
                    total += 45;

                if(wheels[wheelList.getSelectedIndex()].equals(wheels[0]))
                    total += 20;
                else if(wheels[wheelList.getSelectedIndex()].equals(wheels[1]))
                    total += 22;
                else if(wheels[wheelList.getSelectedIndex()].equals(wheels[2]))
                    total += 24;
                else if(wheels[wheelList.getSelectedIndex()].equals(wheels[3]))
                    total += 28;

                Object[] selections = miscelList.getSelectedValues();
                for(int dex = 0; dex < selections.length; dex++)
                {
                    if(miscels[0].equals(selections[dex]))
                        total += 10;
                    else if(miscels[1].equals(selections[dex]))
                        total += 30;
                    else if(miscels[2].equals(selections[dex]))
                        total += 2;
                    else if(miscels[3].equals(selections[dex]))
                        total += 3;

                }
                JOptionPane.showMessageDialog(null, "Total amount for the items is $" + total);
            }
        });

        buttonPanel.add(calculate);
    }


    public static void main(String[] args) {
        new SkateboardDesigner();
    }
}