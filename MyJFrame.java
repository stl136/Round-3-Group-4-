
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;


public class MyJFrame extends JFrame
{
    MainMenu mjp;
    
    
    public MyJFrame()
    {
       
        
        super("KeyBoard Hero!");
        mjp = new MainMenu(this);
        
        
        

        getContentPane().setLayout(new BorderLayout());    
        
        this.getContentPane().add(mjp);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
                
    }
    
}
