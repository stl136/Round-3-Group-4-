
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
        setLayout(null);
        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/guitar.png");
    	g.drawImage(myImage, 0, 0, this);    	
        

    }
}
