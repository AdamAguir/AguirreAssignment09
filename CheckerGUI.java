import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;

public class CheckerGUI extends JFrame{

    public CheckerGUI(){
            setTitle("Checker Board");
            setUndecorated(false);
            Image icon = new ImageIcon("res/Jedi_Order.JPG").getImage();
            setIconImage(icon);            
            
            Container pane = getContentPane();
            
            GridLayout grid = new GridLayout(8,8);
            pane.setLayout(grid); // Need to set layout to add multiple Jpanels using GridLayout for the checkerboard
            Color light = new Color(130,12,12);
            Color dark = new Color(0,0,0);
            
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
            pack();  // use this when using preferredSize in a component
    }
    public static void main(String[] args) {
		
		
		EventQueue.invokeLater(() -> 
		{
            CheckerGUI frame = new CheckerGUI();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
			frame.setVisible(true); // always last
		});
    }
}

