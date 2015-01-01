package Chapter07;

import javax.swing.*;
/**
 * Created by Gerardo on 12/24/2014.
 */
public class TravelExpenses extends JFrame {

    private final double MEALS_COST = 37.00;
    private final double PARKING_COST = 10.00;
    private final double TAXI_COST = 20.00;
    private final double LODGING_COST = 95.00;
    private final double VEHICLE_COST_PER_MILE = 0.27;

    public TravelExpenses() {

        setTitle("Property Task");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 200);
        buildComponents();

        setVisible(true);
    }

    private void buildComponents() {
        JPanel mainPanel = new JPanel();

        JLabel dayLabel = new JLabel("Days: ");
        JLabel airfareLabel = new JLabel("Airfare: ");
        JLabel carLabel = new JLabel("Car: ");
        JLabel milesLabel = new JLabel("Miles: ");
        JLabel parkingLabel = new JLabel("Parking: ");
        JLabel taxiLabel = new JLabel("Taxi: ");
        JLabel confSemLabel = new JLabel("Conf/Sem: ");
        JLabel lodgingLabel = new JLabel("Lodging: ");

        mainPanel.add(dayLabel);
        mainPanel.add(airfareLabel);
        mainPanel.add(carLabel);
        mainPanel.add(milesLabel);
        mainPanel.add(parkingLabel);
        mainPanel.add(taxiLabel);
        mainPanel.add(confSemLabel);
        mainPanel.add(lodgingLabel);

        add(mainPanel);
    }

    public static void main(String[] args) {
        new TravelExpenses();
    }
}