
import java.awt.Color;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
public class NoteBox extends JLabel{
    public int x;
    private final int width = 50;
    private final int height = 50;
    public boolean keys = false;
    ImageIcon red= new ImageIcon("images/Untitled2.png"),blue = new ImageIcon("images/Untitled4.png"),green = new ImageIcon("images/Untitled1.png"),yellow = new ImageIcon("images/Untitled3.png"), cross =new ImageIcon("images/cross.png"); ;
    
    
   
    
   public NoteBox(){
       super();
       this.setSize(width, height);
       x = (int) (Math.random()*4);
       
   }
//   public void setColor(int x){
//       if(x==0){
//            red = new ImageIcon("images/Untitled2.png");
//           this.setIcon(red);
//           this.setBackground(Color.red);
//       }
//       if(x==1){
//            blue = new ImageIcon("images/Untitled4.png");
//           this.setIcon(blue);
//           this.setBackground(Color.BLUE);
//       }
//       if(x==2){
//            green = new ImageIcon("images/Untitled1.png");
//           this.setIcon(green);
//           this.setBackground(Color.GREEN);
//       }
//       if(x==3){
//            yellow = new ImageIcon("images/Untitled3.png");
//           this.setIcon(yellow);
//           this.setBackground(Color.YELLOW);
//       }
//       if(x==4)
//       {
//           cross = new ImageIcon("images/cross.png");
//           
//       }
   
   
   public void Move(int x, int y)
   {
      y = y + 50;
      
   }
   
   
   
}
