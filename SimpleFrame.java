import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class SimpleFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 300;
	private Image icon;

	public SimpleFrame() {
		setTitle("First GUI Program");
		icon = new ImageIcon("src/Chapter10/res/linux.png").getImage();
		setIconImage(icon);
		//setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation(300, 300);
		setResizable(true);
		setUndecorated(false);
		
		// use toolkit for size
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		//setSize(width / 2, height / 2);
		
		
		Container pane = getContentPane();
		//SimpleComponent sc = new SimpleComponent();
		//sc.setBackground(Color.blue);
		//pane.add(sc);
		GridLayout grid = new GridLayout(8,8);
        pane.setLayout(grid); // Need to set layout to add multiple Jpanels using GridLayout for the checkerboard
		Color light = new Color(130,12,12);
        Color dark = new Color(0,0,0);
		// SimpleJPanel panel = new SimpleJPanel();
		// SimpleJPanel pane2 = new SimpleJPanel();		
		// pane.add(panel);
		// pane.add(pane2);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
					pane.add(new SimpleJPanel(light, i, false));
					} else {
					pane.add(new SimpleJPanel(dark, i, true));

					}
				} else {
					if (j % 2 == 0) {
						pane.add(new SimpleJPanel(dark, i, true));
					} else {
						pane.add(new SimpleJPanel(light, i, false));
					}
				}
			}
		}
		pack();  // use this when using preferredSize in a component
	}
}
