
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainMenu extends JPanel implements ActionListener
{
    JButton start, exit;
    
    Font font = new Font("Comic Sans", Font.BOLD,18);
    Font font2 = new Font("Papyrus", Font.BOLD,56);
    Font font3 = new Font("Comic Sans", Font.BOLD,15);
    
    JComboBox difficulty;
    
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

        
        difficulty = new JComboBox(diffSettings);
        difficulty.setFont(font);
        difficulty.setForeground(Color.blue);
        difficulty.setBounds(20, 425, 250, 50);
        
        memo = new JLabel("Chosoe your difficulty");
        memo.setBounds(30, 390, 150, 50);
        difficulty.setFont(font3);
        memo.setForeground(Color.blue);
        
        
        title = new JLabel("Key Board Hero");
        title.setFont(font2);
        title.setBounds(200, 20, 450, 100);
        title.setForeground(Color.red);
        
       
 
        
        start.addActionListener(this);
        exit.addActionListener(this);
        
      
        
        
        add(exit);
        add(start);
        add(title);
        add(difficulty);
        add(memo);
        
    }
    
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/guitar.png");
    	g.drawImage(myImage, 0, 0, this);    	

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
          GamePanel gamePanel = new GamePanel();
          
          if(obj == start) 
          {

            jFrame.remove(this);
            jFrame.add(gamePanel);
            jFrame.revalidate();
            jFrame.pack();
            
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
