
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class MainMenu 
{
    JButton start, exit;
    
    Font font = new Font("Comic Sans", Font.BOLD,18);
    
    JComboBox difficulty;
    
    JLabel memo;
    
    MyJFrame jFrame;
    
    String[] diffSettings = {"Easy", "Medium", "Hard"};
    
    
    public MainMenu(MyJFrame jFrame)
    {
        
        this.jFrame = jFrame;

                                
        
        start = new JButton("New Game");
        start.setFont(font);
        start.setForeground(Color.blue);
        
        start.setBounds(new Rectangle(20,100,150,50));
        exit.setBounds(new Rectangle(20,200,150,50));
                
        
        
        exit = new JButton("Exit");
        exit.setFont(font);
        exit.setForeground(Color.blue);

        difficulty = new JComboBox(diffSettings);
        //difficulty.setBounds(null);
        
        memo = new JLabel("Chosoe your difficulty");
       
      
    }


}
