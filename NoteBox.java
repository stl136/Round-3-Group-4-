
import java.awt.Color;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
public class NoteBox extends JLabel{
    public int x;
    private final int width = 50;
    private final int height = 50;
    
    
   
    
   public NoteBox(){
       super();
       this.setSize(width, height);
       x = (int) (Math.random()*4);
       
   }
   public void setColor(int x){
       if(x==0){
           ImageIcon red = new ImageIcon("images/left2.jpg");
           this.setIcon(red);
           this.setBackground(Color.red);
       }
       if(x==1){
           ImageIcon blue = new ImageIcon("images/up2.jpg");
           this.setIcon(blue);
           this.setBackground(Color.BLUE);
       }
       if(x==2){
           ImageIcon green = new ImageIcon("images/downArrow.png");
           this.setIcon(green);
           this.setBackground(Color.GREEN);
       }
       if(x==3){
           ImageIcon yellow = new ImageIcon("images/right2.jpg");
           this.setIcon(yellow);
           this.setBackground(Color.YELLOW);
       }
   }
   
   public void Move(int x, int y)
   {
      y = y + 50;
      
   }
   
}
