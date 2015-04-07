
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener
{
    private Timer t ;
    NoteBox n ;
    JLabel j = new JLabel("j");
    JButton start = new JButton("start");
    
    public GamePanel()
    {

        setLayout(null);
        t = new Timer(1000,this);
        n = new NoteBox();
        j.setBackground(Color.red);
        j.setOpaque(true);
         j.setBounds(64, 64, 100, 100);
         start.setBounds(50, 20, 100 , 200);
         start.addActionListener(this);
        add(j);
        add(start);

        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/guitar.png");
    	g.drawImage(myImage, 0, 0, this);    	


    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o == start){
            t.start();
        }
        if(o == t){
            j.setBounds(64, 64, 200, 200);
        }
    }
}
