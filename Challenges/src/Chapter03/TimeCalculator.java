package Chapter03;

import javax.swing.*;

/**
 * Created by Gerardo on 6/14/2014.
 */
public class TimeCalculator {

    public static void main(String[] args) {
        String input, message;
        int seconds, minutes, hours, days;

        input = JOptionPane.showInputDialog(null, "Enter any amount of seconds: ", "Input", 1);
        seconds = Integer.parseInt(input);

        if(seconds < 60)
            message =  seconds + " seconds";
        else if(seconds >= 60 && seconds < 3600)
        {
            minutes = seconds/60;
            message = minutes + ":" + seconds % 60;
        }
        else if(seconds >= 3600 && seconds < 86400)
        {
            hours = seconds/3600;
            minutes = (seconds % 3600) / 60;
            message = hours + ":" + minutes + ":" + (seconds % 3600) % 60;
        }
        else
        {
            days = seconds / 86400;
            hours = (seconds % 86400) / 3600;
            minutes = ((seconds % 86400) % 3600) / 60;
            message = days + ":" + hours + ":" + minutes + ":" + ((seconds % 86400) % 3600) % 60;
        }

        JOptionPane.showMessageDialog(null, "The time format is " + message, "Time Format", 1);
    }
}
