package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Gerardo on 1/5/2015.
 */
public class ImageViewer extends JFrame {

    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem open, exit;
    private JLabel imageLabel;
    private Image currentImage;

    public ImageViewer() {
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constructMenuBar();
        imageLabel = new JLabel("     Open a picture to display.");
        imageLabel.setPreferredSize(new Dimension(200, 200));
        add(imageLabel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void constructMenuBar() {
        menuBar = new JMenuBar();

        constructFileMenu();
        menuBar.add(file);

        setJMenuBar(menuBar);
    }

    private void constructFileMenu() {
        file = new JMenu("File");

        open = new JMenuItem("Open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File imageFile;
                ImageIcon image;
                JFileChooser chooser = new JFileChooser();
                int status = chooser.showOpenDialog(null);

                if(status == JFileChooser.APPROVE_OPTION)
                {
                    imageFile = chooser.getSelectedFile();
                    image = new ImageIcon(imageFile.getPath());
                    imageLabel.setPreferredSize(new Dimension(image.getIconWidth(), image.getIconHeight()));
                    pack();
                    setLocationRelativeTo(null);
                    imageLabel.setIcon(image);
                }
            }
        });
        exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(open);
        file.add(exit);
    }


    public static void main(String[] args) {
        new ImageViewer();
    }
}