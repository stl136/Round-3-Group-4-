
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener
{
    private Timer t ;
    NoteBox n ;
    JLabel j = new JLabel("j");
    JButton start = new JButton("start");
    NoteBox up, down, left, right;
    final int  upX = 310 ;
    int upY = 20;
    int rightY = 20;
    int leftY = 20;
    int downY = 20;
    final int downX = 370;
    int time = 0;
    final int rightX = 430;
    final int leftX = 250;
    ImageIcon upImage = new ImageIcon("images/up2.jpg");
    ImageIcon downImage = new ImageIcon("images/downArrow.png");
    ImageIcon leftImage = new ImageIcon("images/left2.jpg");
    ImageIcon rightImage = new ImageIcon("images/right2.jpg");
    JLabel line1, line2, line3, line4;

    
    public GamePanel()
    {

        super();
        setLayout(null);
        setSize(700,700);
        
        
        
        
        
        t = new Timer(100,this);
//        n = new NoteBox();
//        j.setBackground(Color.red);
//        j.setOpaque(true);
//        j.setBounds(64, 64, 100, 100);
//        start.setBounds(50, 20, 100 , 200);
//        start.addActionListener(this);
//         
        
        up = new NoteBox();
        up.setColor(1);
        up.setBounds(upX, upY, 50, 50);
        
        
        down = new NoteBox();
        down.setColor(2);
        down.setBounds(downX, downY, 50, 50);
        
        left = new NoteBox();
        left.setColor(0);
        left.setBounds(leftX, leftY, 50, 50);
        
        right = new NoteBox();
        right.setColor(3);
        right.setBounds(rightX, rightY, 50, 50);
        

        start = new JButton("Start");
        start.setBounds(50, 20, 50 , 50);
        start.addActionListener(this);
        
        line1 = new JLabel();
        line1.setOpaque(true);
        line1.setBounds(158, 480, 412, 5);
        line1.setBackground(Color.red);
        
        line2 = new JLabel();
        line2.setOpaque(true);
        line2.setBounds(158, 570, 412, 5);
        line2.setBackground(Color.red);
        
        line3 = new JLabel();
        line3.setOpaque(true);
        line3.setBounds(158, 480, 5, 90);
        line3.setBackground(Color.red);
        
        line4 = new JLabel();
        line4.setOpaque(true);
        line4.setBounds(570, 480, 5, 95);
        line4.setBackground(Color.red);
         
        
        add(j);
        add(start);
        add(up);
        add(down);
        add(left);
        add(right);
        add(line1);
        add(line2);
        add(line3);
        add(line4);

        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/g2.png");
    	g.drawImage(myImage, 0, 0, this);    	

        

        
        
        setFocusable(true);
        requestFocusInWindow();
        
        

    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o == start)
        {
            t.start();
           
            

        }
        if(o == t){
             upY = upY + 5;
             
              up.setBounds(upX, upY, 50, 50);
              
              //up arrow
              if(upY==480 )
              {
                 addKeyListener(this);    
              }
              if(upY==570 )
              {
                 this.removeKeyListener(this); 
              }
              
              
              
              //right arrow
              if(rightY==480 )
              {
                 addKeyListener(this);    
              }
              if(upY==570 )
              {
                 this.removeKeyListener(this); 
              }
              
              //left arrow
              if(leftY==480 )
              {
                 addKeyListener(this);    
              }
              if(leftY==570 )
              {
                 this.removeKeyListener(this); 
              }
              
              
              //down arrow
              if(downY==480 )
              {
                 addKeyListener(this);    
              }
              if(downY==570 )
              {
                 this.removeKeyListener(this); 
              }
              
              
              
             validate();
             repaint();
             time++;
             if(time >=30)
             {
                 right.setBounds(rightX, rightY, 50, 50);
                 rightY = rightY + 5;

             }
             
             if(time >=50)
             {
                 down.setBounds(downX, downY, 50, 50);
                 downY = downY + 5;

             }
             
              if(time >=80)
             {
                 left.setBounds(leftX, leftY, 50, 50);
                 leftY = leftY + 5;

             }
        }
    }

    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP )
                {
                    System.out.println("up");
                    //x>460
                    //if up is somewhere in the area, then score
                    //turn score false
                }
        
        if (key == KeyEvent.VK_DOWN )
                {
                    System.out.println("down");
                }
        
        if (key == KeyEvent.VK_LEFT )
                {
                    System.out.println("left");
                }
        
        if (key == KeyEvent.VK_RIGHT )
                {
                    System.out.println("right");
                }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
