import java.awt.Color;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;



public class CheckerPanel extends JPanel{
    private BufferedImage img = new BufferedImage(85, 85, BufferedImage.TYPE_INT_ARGB);
    //private BufferedImage lightPiece = new BufferedImage(85, 85, BufferedImage.TYPE_INT_ARGB);//ImageIO.read(new File("res/Rebel.jpeg"));
    private Image darkPiece;
    private ImageIcon lightP = new ImageIcon("res/Rebel.jpeg");
    private Image lightPiece = new ImageIcon("res/Rebel.jpeg").getImage();
    private Graphics g = img.createGraphics();
    private int x = 0;
    private int y = 0;

    public CheckerPanel(Color c, int row, boolean paint){
        //super();
        setBackground(c);
        setPreferredSize(new Dimension(100, 100));
        // if (paint) {
        //     System.out.println(row);
        //     paintComponet(g, row);
        // }
        darkPiece = new ImageIcon("res/Imperial.jpeg").getImage();
        x = darkPiece.getWidth(null)/2;
        y = darkPiece.getHeight(null)/2;

    }

    public  void paintComponet(Graphics g){
        super.paintComponent(g);
        //this.setBackground(Color.WHITE);

        //g.setColor(Color.CYAN);
        //g.drawOval(50, 50, 25, 25);
            g.drawImage(darkPiece, x, y, null);
        //lightP.paintIcon(this, g, x, y);
            //g.drawImage(lightPiece, x, y, null);
        
    }
}
