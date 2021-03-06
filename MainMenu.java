
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class MainMenu extends JPanel implements ActionListener, ItemListener
{
    JButton start, exit;
    
    Font font = new Font("Comic Sans", Font.BOLD,18);
    Font font2 = new Font("Papyrus", Font.BOLD,60);
    Font font3 = new Font("Comic Sans", Font.PLAIN,16);
    
    JRadioButton easy, medium, hard;
    
    GamePanel gp = new GamePanel();
    
    JLabel memo, title;
    
    MyJFrame jFrame;
    
    String[] diffSettings = {"Easy", "Medium", "Hard"};
    
    
    public MainMenu(MyJFrame jFrame)
    {
        
        this.jFrame = jFrame;

        setLayout(null);
        
        
                                
        
        start = new JButton("New Game");
        start.setFont(font);
        start.setForeground(Color.blue);
        
        start.setBounds(20,200,150,50);
        
                
        
        
        exit = new JButton("Exit");
        exit.setFont(font);
        exit.setForeground(Color.blue);
        exit.setBounds(20,300,150,50);

        easy = new JRadioButton("Easy");
	medium = new JRadioButton("Medium");
	hard = new JRadioButton("Hard");
        easy.setBounds(20, 425, 150, 20);
        medium.setBounds(20, 455, 150, 20);
        hard.setBounds(20, 485, 150, 20);
        easy.setFont(font);
        medium.setFont(font);
        hard.setFont(font);
        easy.setForeground(Color.blue);
        medium.setForeground(Color.blue);
        hard.setForeground(Color.blue);
        easy.setSelected(true);
        
        ButtonGroup group = new ButtonGroup();
	    group.add(easy);
	    group.add(medium);
	    group.add(hard);
        

        
        memo = new JLabel("Chosoe your difficulty:");
        memo.setBounds(30, 390, 250, 50);
        memo.setForeground(Color.white);
        memo.setFont(font3);
        
        
        title = new JLabel("Key Board Hero");
        title.setFont(font2);
        title.setBounds(160, 40, 450, 100);
        title.setForeground(Color.red);
        
       
 
        
        start.addActionListener(this);
        exit.addActionListener(this);
        
//        easy.addActionListener(this); 
//        medium.addActionListener(this); 
//        hard.addActionListener(this); 
        
        easy.addItemListener(this);
        medium.addItemListener(this);
        hard.addItemListener(this);
      
        
        
        add(exit);
        add(start);
        add(title);
        add(easy);
        add(medium);
        add(hard);
        add(memo);
        
        
    }
    
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/guitar.jpeg");
    	g.drawImage(myImage, 0, 0, this);    	

    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if (easy.isSelected())
    	 {
            // gp.delay = 50;
             gp.t.setDelay(50);
         }
         
         if (medium.isSelected())
    	 {
             //gp.delay = 40;
             gp.t.setDelay(35);
         }
          
         if (hard.isSelected())
    	 {
             //gp.delay = 30;
             System.out.println("game");
             gp.t.setDelay(20);
         }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    private static class ButtonListener 
    {

        public ButtonListener() 
        {
            
        }
    }
   
    public void actionPerformed(ActionEvent e) 
    {
          Object obj = e.getSource();
         // GamePanel gamePanel = new GamePanel();
          
          if(obj == start) 
          {
      
            jFrame.getContentPane().remove(this);
            jFrame.getContentPane().add(gp);
            jFrame.revalidate();
            
          }
          else 
          {
              
          }
          
          if(obj == exit)
          {
              System.exit(0);
          }
          
           
     	 
         
         
         }
          
          
}




