import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;

/**
 * @author: Adam Aguirre 
 * Assignment 9 
 * 04/06/2021
 */
public class CheckerPanel extends JPanel {
	private Image darkPiece = new ImageIcon("res/Imperial.jpeg").getImage();
	private Image lightPiece = new ImageIcon("res/Rebel.jpeg").getImage();
	private Image img;

	public CheckerPanel(Color c, int row, boolean p) {
		setBackground(c);
		setPreferredSize(new Dimension(100, 100));
		if (p) {
			if (row < 3) {
				img = darkPiece;
			}
			if (row > 4) {
				img = lightPiece;
			}
		} else {
			img = null;
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int w = getWidth();
		int h = getHeight();
		// need to find the center of the screen by subtracting half the image w/h from
		// screen w/h
		if (img != null) {
			g.drawImage(img, w / 2 - (img.getWidth(null) / 2), h / 2 - (img.getHeight(null) / 2), null);
		}
	}
}