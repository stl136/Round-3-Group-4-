
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
    
    public GamePanel()
    {
        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/r10.jpg");
    	g.drawImage(myImage, 0, 0, this);    	
        g.fillRect(100,20,70,80);
        g.setColor(Color.yellow);
        g.drawString("text on a Panel", 100,150);

    }
}
