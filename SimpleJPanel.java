import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SimpleJPanel extends JPanel{
	private Image img;
	
	public SimpleJPanel(Color c, int row, boolean p) {
		setBackground(c);
		setPreferredSize(new Dimension(100, 100));	
		if (p) {
			if(row < 3){
				img = new ImageIcon("res/Imperial.jpeg").getImage();		
			}
			if (row > 4) {
				img = new ImageIcon("res/Rebel.jpeg").getImage();		
			}
		} else {
			img = null;
		}
		

	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Font f1 = new Font("BlackAdder ITC", Font.ITALIC, 30);
		// g.setFont(f1);
		// g.drawString("Hello JPanel", 20, 30);
		// Font f2 = new Font("Castellar", Font.ITALIC, 40);
		// g.setFont(f2);
		// Color c1 = new Color(39, 145, 58);
		// g.setColor(c1);
		// g.drawString("How are you", 20, 65);
		// Random rand = new Random();
		// Color c2 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		// g.setColor(c2);
		// g.drawString("How are you today", 20, 105);
		
		// // draw shapes
		// g.drawRect(20, 110, 150, 20);
		// g.fillOval(20, 135, 100, 20);
		// g.fillRoundRect(20, 160, 150, 20, 25, 25);
		// g.drawLine(20, 180, 30, 220);
		// g.drawArc(20, 220, 30, 250, 0, 90);
		
		int w = getWidth();
		int h = getHeight();
		// need to find the center of the screen by subtracting half the image w/h from screen w/h
		if (img != null){
			g.drawImage(img, w / 2 - (img.getWidth(null) / 2), h / 2 - (img.getHeight(null) / 2), null);
		}
		
	}
	
	

}
