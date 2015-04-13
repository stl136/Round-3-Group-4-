
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
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
    JLabel up, down, left, right;
    ImageIcon upImage = new ImageIcon("images/up2.jpg");
    ImageIcon downImage = new ImageIcon("images/down2.jpg");
    ImageIcon leftImage = new ImageIcon("images/left2.jpg");
    ImageIcon rightImage = new ImageIcon("images/right2.jpg");

    
    public GamePanel()
    {

        super();
        setLayout(null);
        setSize(700,700);
        
        t = new Timer(1000,this);
        n = new NoteBox();
        j.setBackground(Color.red);
        j.setOpaque(true);
        j.setBounds(64, 64, 100, 100);
        start.setBounds(50, 20, 100 , 200);
        start.addActionListener(this);
         
        
        up = new JLabel(upImage);
        up.setBounds(250, 20, 50, 50);
        
        down = new JLabel(downImage);
        down.setBounds(310, 20, 50, 50);
        
        left = new JLabel(leftImage);
        left.setBounds(370, 20, 50, 50);
        
        right = new JLabel(rightImage);
        right.setBounds(430, 20, 50, 50);
        

         
        
        //add(j);
        //add(start);
        add(up);
        add(down);
        add(left);
        add(right);

        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/g2.png");
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
