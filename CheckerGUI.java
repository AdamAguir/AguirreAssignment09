import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.EventQueue;



import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;


public class CheckerGUI extends JFrame{
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> 
		{
            JFrame frame = new JFrame("Checker Board");
            frame.setSize(800,800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Image icon = new ImageIcon("res/Jedi_Order.JPG").getImage();
            frame.setIconImage(icon);

            Color light = new Color(130,12,12);
            Color dark = new Color(0,0,0);

            Container pane = frame.getContentPane();
            GridLayout grid = new GridLayout(8,8);
            pane.setLayout(grid); // Need to set layout to add multiple Jpanels using GridLayout for the checkerboard
            
            

            // make the CheckerPanels
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                        pane.add(new CheckerPanel(light, i, false));
                        } else {
                        pane.add(new CheckerPanel(dark, i, true));

                        }
                    } else {
                        if (j % 2 == 0) {
                            pane.add(new CheckerPanel(dark, i, true));
                        } else {
                            pane.add(new CheckerPanel(light, i, false));
                        }
                    }
                }
            }
            // Pack the checker panels into the frame
            frame.pack();
            frame.setVisible(true);

        });
    }
}
