
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainMenu extends JPanel
{
    JButton start, exit;
    
    Font font = new Font("Comic Sans", Font.BOLD,18);
    Font font2 = new Font("Papyrus", Font.BOLD,36);
    
    JComboBox difficulty;
    
    JLabel memo, title;
    
    MyJFrame jFrame;
    
    String[] diffSettings = {"Easy", "Medium", "Hard"};
    
    
    public MainMenu(MyJFrame jFrame)
    {
        
        this.jFrame = jFrame;

        setLayout(null);
        
        this.setBackground(Color.pink);
                                
        
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
        difficulty.setBounds(20, 4250, 250, 100);
        
        memo = new JLabel("Chosoe your difficulty");
        memo.setBounds(30, 400, 150, 50);
        
        title = new JLabel("Key Board Hero");
        title.setFont(font2);
        title.setBounds(220, 20, 450, 100);
       
      
        
        add(exit);
        add(start);
        add(title);
        add(difficulty);
        add(memo);
        
    }


}
