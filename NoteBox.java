
import java.awt.Color;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
public class NoteBox extends JLabel{
    private int x;
    private final int width = 64;
    private final int height = 64;
    
    
   
    
   public NoteBox(){
       super();
       this.setSize(width, height);
       x = (int) (Math.random()*4);
       
   }
   private void setColor(int x){
       if(x==0){
           ImageIcon red = new ImageIcon("images/down.jpg");
           this.setIcon(red);
           this.setBackground(Color.red);
       }
       if(x==1){
           ImageIcon blue = new ImageIcon("images/up.jpg");
           this.setIcon(blue);
           this.setBackground(Color.BLUE);
       }
       if(x==2){
           ImageIcon green = new ImageIcon("images/left.jpg");
           this.setIcon(green);
           this.setBackground(Color.GREEN);
       }
       if(x==3){
           ImageIcon yellow = new ImageIcon("images/right.jpg");
           this.setIcon(yellow);
           this.setBackground(Color.YELLOW);
       }
   }
   
}
