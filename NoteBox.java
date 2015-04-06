
import java.awt.Color;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
public class NoteBox extends JLabel{
    int x;
    private final int width = 64;
    private final int height = 64;
    
   public NoteBox(){
       super();
       this.setSize(width, height);
       x = (int) (Math.random()*4);
       
   }
   private void setColor(int x){
       if(x==0){
           ImageIcon red = new ImageIcon();
           this.setIcon(red);
           this.setBackground(Color.red);
       }
       if(x==1){
           ImageIcon blue = new ImageIcon();
           this.setIcon(blue);
           this.setBackground(Color.BLUE);
       }
       if(x==2){
           ImageIcon green = new ImageIcon();
           this.setIcon(green);
           this.setBackground(Color.GREEN);
       }
       if(x==3){
           ImageIcon yellow = new ImageIcon();
           this.setIcon(yellow);
           this.setBackground(Color.YELLOW);
       }
   }
   
}
