
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
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
    int upY = 20,u0Y = 20, u1Y = 20, u2Y = 20, u3Y = 20, u4Y = 20,u5Y = 20, u6Y = 20, u7Y = 20, u8Y = 20, u9Y = 20 ;
    int rightY = 20, r0Y = 20, r1Y = 20, r2Y = 20, r3Y = 20, r4Y = 20, r5Y = 20, r6Y = 20,r7Y = 20,r8Y = 20, r9Y = 20;
    int leftY = 20, l0Y = 20, l1Y = 20, l2Y = 20, l3Y = 20, l4Y = 20, l5Y = 20, l6Y = 20, l7Y = 20, l8Y = 20, l9Y = 20 ;
    int downY = 20, d0Y = 20, d1Y = 20, d2Y = 20, d3Y = 20, d4Y = 20, d5Y = 20, d6Y = 20, d7Y = 20, d8Y = 20, d9Y = 20 ;
    final int downX = 370;
    int time = 0;
    final int rightX = 430;
    final int leftX = 250;
    ImageIcon upImage = new ImageIcon("images/up2.jpg");
    ImageIcon downImage = new ImageIcon("images/downArrow.png");
    ImageIcon leftImage = new ImageIcon("images/left2.jpg");
    ImageIcon rightImage = new ImageIcon("images/right2.jpg");
    JLabel line1, line2, line3, line4, scoreBox;
    public int score = 0;
    Font font = new Font("Comic Sans", Font.BOLD,28);
    
    
    NoteBox[] upArray = new NoteBox[10];
    NoteBox[] downArray = new NoteBox[10];
    NoteBox[] leftArray = new NoteBox[10];
    NoteBox[] rightArray = new NoteBox[10];
    

    
    
    public GamePanel()
    {

        super();
        setLayout(null);
        setSize(700,700);
        

        t = new Timer(50,this);
       
        
        up = new NoteBox();
        up.setIcon(up.blue);
        up.setBounds(upX, upY, 50, 50);
        
        
        down = new NoteBox();
        down.setIcon(down.green);
        down.setBounds(downX, downY, 50, 50);
        
        left = new NoteBox();
        left.setIcon(left.red);
        left.setBounds(leftX, leftY, 50, 50);
        
        right = new NoteBox();
        right.setIcon(right.yellow);
        right.setBounds(rightX, rightY, 50, 50);
        

        start = new JButton("Start");
        start.setBounds(50, 20, 100 , 100);
        start.addActionListener(this);
        start.setFont(font);
        start.setForeground(Color.MAGENTA);
        
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
        
        scoreBox = new JLabel("Score: " + score);
        scoreBox.setFont(font);
        scoreBox.setForeground(Color.MAGENTA);
        scoreBox.setBounds(50, 120, 200 , 200);
        
        
        
        for(int x = 0; x < upArray.length; x ++)
        {
            upArray[x] = new NoteBox();
            upArray[x].setIcon(up.blue);
            
            add(upArray[x]);
        }
        upArray[0].setBounds(upX, u0Y, 50, 50);
        upArray[1].setBounds(upX, u1Y, 50, 50);
        upArray[2].setBounds(upX, u2Y, 50, 50);
        upArray[3].setBounds(upX, u3Y, 50, 50);
        upArray[4].setBounds(upX, u4Y, 50, 50);
        upArray[5].setBounds(upX, u5Y, 50, 50);
        upArray[6].setBounds(upX, u6Y, 50, 50);
        upArray[7].setBounds(upX, u7Y, 50, 50);
        upArray[8].setBounds(upX, u8Y, 50, 50);
        upArray[9].setBounds(upX, u9Y, 50, 50);
        
        
        for(int x = 0; x < downArray.length; x ++)
        {
            downArray[x] = new NoteBox();
            downArray[x].setIcon(down.green);
            
            add(downArray[x]);
        }
        downArray[0].setBounds(downX, d0Y, 50, 50);
        downArray[1].setBounds(downX, d1Y, 50, 50);
        downArray[2].setBounds(downX, d2Y, 50, 50);
        downArray[3].setBounds(downX, d3Y, 50, 50);
        downArray[4].setBounds(downX, d4Y, 50, 50);
        downArray[5].setBounds(downX, d5Y, 50, 50);
        downArray[6].setBounds(downX, d6Y, 50, 50);
        downArray[7].setBounds(downX, d7Y, 50, 50);
        downArray[8].setBounds(downX, d8Y, 50, 50);
        downArray[9].setBounds(downX, d9Y, 50, 50);
        
        
        
            
        for(int x = 0; x < leftArray.length; x ++)
        {
            leftArray[x] = new NoteBox();
            leftArray[x].setIcon(left.red);
            
            add(leftArray[x]);
        }
        leftArray[0].setBounds(leftX, l0Y, 50,50);
        leftArray[1].setBounds(leftX, l1Y, 50,50);
        leftArray[2].setBounds(leftX, l2Y, 50,50);
        leftArray[3].setBounds(leftX, l3Y, 50,50);
        leftArray[4].setBounds(leftX, l4Y, 50,50);
        leftArray[5].setBounds(leftX, l5Y, 50,50);
        leftArray[6].setBounds(leftX, l6Y, 50,50);
        leftArray[7].setBounds(leftX, l7Y, 50,50);
        leftArray[8].setBounds(leftX, l8Y, 50,50);
        leftArray[9].setBounds(leftX, l9Y, 50,50);
        
        
        
        
        for(int x = 0; x < rightArray.length; x ++)
        {
            rightArray[x] = new NoteBox();
            rightArray[x].setIcon(right.yellow);
            
            add(rightArray[x]);
        }
        rightArray[0].setBounds(rightX, r0Y, 50, 50);
        rightArray[1].setBounds(rightX, r1Y, 50, 50);
        rightArray[2].setBounds(rightX, r2Y, 50, 50);
        rightArray[3].setBounds(rightX, r3Y, 50, 50);
        rightArray[4].setBounds(rightX, r4Y, 50, 50);
        rightArray[5].setBounds(rightX, r5Y, 50, 50);
        rightArray[6].setBounds(rightX, r6Y, 50, 50);
        rightArray[7].setBounds(rightX, r7Y, 50, 50);
        rightArray[8].setBounds(rightX, r8Y, 50, 50);
        rightArray[9].setBounds(rightX, r9Y, 50, 50);
        
        
        
        addKeyListener(this);
        
        
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
        add(scoreBox);

        
    }
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/g2.png");
    	g.drawImage(myImage, 0, 0, this);    	

        

        
        
        setFocusable(true);
        requestFocusInWindow();
        
        

    }

    public void actionPerformed(ActionEvent e) 
    {
        Object o = e.getSource();
        if(o == start)
        {
            t.start();
           
            

        }
        if(o == t)
        {
             upY = upY + 5;
             
              up.setBounds(upX, upY, 50, 50);
              
                      if(right.getBounds().y == 575 && right.getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(left.getBounds().y == 575 && left.getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(up.getBounds().y == 575 && up.getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(down.getBounds().y == 575 && down.getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
              
                       
                       
                       //right array
                       if(rightArray[0].getBounds().y == 575 && rightArray[0].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[1].getBounds().y == 575 && rightArray[1].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[2].getBounds().y == 575 && rightArray[2].getIcon() == right.yellow)
                      
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[3].getBounds().y == 575 && rightArray[3].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[4].getBounds().y == 575 && rightArray[4].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[5].getBounds().y == 575 && rightArray[5].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[6].getBounds().y == 575 && rightArray[6].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[7].getBounds().y == 575 && rightArray[7].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[8].getBounds().y == 575 && rightArray[8].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(rightArray[9].getBounds().y == 575 && rightArray[9].getIcon() == right.yellow)
                        {
                            score --;
                            System.out.println(score);
                        }
                       
                       
                       
                       //left array
                      if(leftArray[0].getBounds().y == 575 && leftArray[0].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[1].getBounds().y == 575 && leftArray[1].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[2].getBounds().y == 575 && leftArray[2].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[3].getBounds().y == 575 && leftArray[3].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[4].getBounds().y == 575 && leftArray[4].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[5].getBounds().y == 575 && leftArray[5].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[6].getBounds().y == 575 && leftArray[6].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[7].getBounds().y == 575 && leftArray[7].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[8].getBounds().y == 575 && leftArray[8].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(leftArray[9].getBounds().y == 575 && leftArray[9].getIcon() == left.red)
                        {
                            score --;
                            System.out.println(score);
                        }
                      
                      
                      
                      
                      
                     // up array
                      if(upArray[0].getBounds().y == 575 && upArray[0].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[1].getBounds().y == 575 && upArray[1].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[2].getBounds().y == 575 && upArray[2].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[3].getBounds().y == 575 && upArray[3].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[4].getBounds().y == 575 && upArray[4].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[5].getBounds().y == 575 && upArray[5].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[6].getBounds().y == 575 && upArray[6].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[7].getBounds().y == 575 && upArray[7].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[8].getBounds().y == 575 && upArray[8].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      if(upArray[9].getBounds().y == 575 && upArray[9].getIcon() == up.blue)
                        {
                            score --;
                            System.out.println(score);
                        }
                      
                      
                      //down array 
                       if(downArray[0].getBounds().y == 575 && downArray[0].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[1].getBounds().y == 575 && downArray[1].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[2].getBounds().y == 575 && downArray[2].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[3].getBounds().y == 575 && downArray[3].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[4].getBounds().y == 575 && downArray[4].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[5].getBounds().y == 575 && downArray[5].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[6].getBounds().y == 575 && downArray[6].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[7].getBounds().y == 575 && downArray[7].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[8].getBounds().y == 575 && downArray[8].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
                        }
                       if(downArray[9].getBounds().y == 575 && downArray[9].getIcon() == down.green )
                        {
                            score --;
                            System.out.println(score);
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
             
             if(time >=120)
             {
             upArray[0].setBounds(upX, u0Y, 50, 50);
             u0Y = u0Y +5;
             }
             
             if(time >=140)
             {
             upArray[1].setBounds(upX, u1Y, 50, 50);
             u1Y = u1Y +5;
             }
             if(time>=160){
                 downArray[0].setBounds(downX, d0Y, 50, 50);
                 d0Y = d0Y +5;
             }
             
             if(time>=180){
                 rightArray[0].setBounds(rightX, r0Y, 50, 50);
                 r0Y = r0Y +5;
             }
             if(time>=200){
                 leftArray[0].setBounds(leftX, l0Y, 50, 50);
                 l0Y = l0Y +5;
             }
             if(time >=220)
             {
             upArray[2].setBounds(upX, u2Y, 50, 50);
             u2Y = u2Y +5;
             }
             if(time >=240)
             {
             upArray[3].setBounds(upX, u3Y, 50, 50);
             u3Y = u3Y +5;
             }
             if(time >=260)
             {
             upArray[4].setBounds(upX, u4Y, 50, 50);
             u4Y = u4Y +5;
             }
             
              if(time>=280){
                 downArray[1].setBounds(downX, d1Y, 50, 50);
                 d1Y = d1Y +5;
             }
             
             if(time>=280){
                 rightArray[1].setBounds(rightX, r1Y, 50, 50);
                 r1Y = r1Y +5;
             }
              if(time>=300){
                 downArray[2].setBounds(downX, d2Y, 50, 50);
                 d2Y = d2Y +5;
             }
              if(time>=320){
                 downArray[3].setBounds(downX, d3Y, 50, 50);
                 d3Y = d3Y +5;
             }
             
             if(time>=340){
                 rightArray[2].setBounds(rightX, r2Y, 50, 50);
                 r2Y = r2Y +5;
             }
             if(time>=360){
                 rightArray[3].setBounds(rightX, r3Y, 50, 50);
                 r3Y = r3Y +5;
             }
             
             if(time >=380)
             {
             upArray[5].setBounds(upX, u5Y, 50, 50);
             u5Y = u5Y +5;
             }
             if(time>=380){
                 leftArray[1].setBounds(leftX, l1Y, 50, 50);
                 l1Y = l1Y +5;
             }
             if(time>=400){
                 leftArray[2].setBounds(leftX, l2Y, 50, 50);
                 l2Y = l2Y +5;
             }
             if(time>=420){
                 leftArray[3].setBounds(leftX, l3Y, 50, 50);
                 l3Y = l3Y +5;
             }
              if(time>=440){
                 rightArray[4].setBounds(rightX, r4Y, 50, 50);
                 r4Y = r4Y +5;
             }
              if(time>=440){
                 downArray[4].setBounds(downX, d4Y, 50, 50);
                 d4Y = d4Y +5;
             }
              if(time>=460){
                 downArray[5].setBounds(downX, d5Y, 50, 50);
                 d5Y = d5Y +5;
             }
              if(time>=480){
                 leftArray[4].setBounds(leftX, l4Y, 50, 50);
                 l4Y = l4Y +5;
             }
             if(time>=490){
                 leftArray[5].setBounds(leftX, l5Y, 50, 50);
                 l5Y = l5Y +5;
             }
             
             if(time >=500)
             {
             upArray[6].setBounds(upX, u6Y, 50, 50);
             u6Y = u6Y +5;
             }
             
             if(time>=510){
                 rightArray[4].setBounds(rightX, r4Y, 50, 50);
                 r4Y = r4Y +5;
             }
             if(time>=520){
                 rightArray[5].setBounds(rightX, r5Y, 50, 50);
                 r5Y = r5Y +5;
             }
             if(time>=540){
                 leftArray[6].setBounds(leftX, l6Y, 50, 50);
                 l6Y = l6Y +5;
             }
             if(time>=570){
                 rightArray[6].setBounds(rightX, r6Y, 50, 50);
                 r6Y = r6Y +5;
             }
             if(time>=580){
                 rightArray[7].setBounds(rightX, r7Y, 50, 50);
                 r7Y = r7Y +5;
             }
             
             if(time >=600)
             {
             upArray[7].setBounds(upX, u7Y, 50, 50);
             u7Y = u7Y +5;
             }
             
             if(time>=600){
                 rightArray[8].setBounds(rightX, r8Y, 50, 50);
                 r8Y = r8Y +5;
             }
             if(time>=610){
                 leftArray[7].setBounds(leftX, l7Y, 50, 50);
                 l7Y = l7Y +5;
             }
             if(time >=620)
             {
             upArray[8].setBounds(upX, u8Y, 50, 50);
             u8Y = u8Y +5;
             }
             if(time>=630){
                 leftArray[8].setBounds(leftX, l8Y, 50, 50);
                 l8Y = l8Y +5;
             }
             if(time>=650){
                 leftArray[9].setBounds(leftX, l9Y, 50, 50);
                 l9Y = l9Y +5;
             }
             if(time >=640)
             {
             upArray[9].setBounds(upX, u9Y, 50, 50);
             u9Y = u9Y +5;
             }
             
             if(time>=640){
                 rightArray[9].setBounds(rightX, r9Y, 50, 50);
                 r9Y = r9Y +5;
             }
                     
              if(time>=650){
                 downArray[6].setBounds(downX, d6Y, 50, 50);
                 d6Y = d6Y +5;
             }if(time>=670){
                 downArray[7].setBounds(downX, d7Y, 50, 50);
                 d7Y = d7Y +5;
             }if(time>=690){
                 downArray[8].setBounds(downX, d8Y, 50, 50);
                 d8Y = d8Y +5;
             }if(time>=700){
                 downArray[9].setBounds(downX, d9Y, 50, 50);
                 d9Y = d9Y +5;
             }
              scoreBox.setText("Score: " +score);
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
                   
                    if(up.getIcon() == up.blue)
                    {
                    if(up.getBounds().y  >= 480 && up.getBounds().y  <= 570)
                    {
                        System.out.println("up");
                        up.keys = true;
                        score++;
                        System.out.println(score);
                        up.setIcon(up.cross);
                    }
                    }
                    
                    
                    
                    if(upArray[0].getIcon() == up.blue)
                    {
                    if(upArray[0].getBounds().y  >= 480 && upArray[0].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[0].setIcon(upArray[0].cross);
                    }
                    }
                    else System.out.println("1"+upArray[0].getIcon()+",2="+upArray[0].blue);
                    
                    
                    if(upArray[1].getIcon() == up.blue)
                    {
                    if(upArray[1].getBounds().y  >= 480 && upArray[1].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[1].setIcon(upArray[1].cross);
                    }
                    }
                    
                    
                    if(upArray[2].getIcon() == up.blue)
                    {
                    if(upArray[2].getBounds().y  >= 480 && upArray[2].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[2].setIcon(upArray[2].cross);
                    }
                    }
                    
                    
                    if(upArray[3].getIcon() == up.blue)
                    {
                    if(upArray[3].getBounds().y  >= 480 && upArray[3].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[3].setIcon(upArray[3].cross);
                    }
                    }
                    
                    
                    if(upArray[4].getIcon() == up.blue)
                    {
                    if(upArray[4].getBounds().y  >= 480 && upArray[4].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[4].setIcon(upArray[4].cross);
                    }
                    }
                    if(upArray[5].getIcon() == up.blue)
                    {
                    if(upArray[5].getBounds().y  >= 480 && upArray[5].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[5].setIcon(upArray[5].cross);
                    }
                    }
                    
                    
                    if(upArray[6].getIcon() == up.blue)
                    {
                    if(upArray[6].getBounds().y  >= 480 && upArray[6].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[6].setIcon(upArray[6].cross);
                    }
                    }
                    
                    
                    if(upArray[7].getIcon() == up.blue)
                    {
                    if(upArray[7].getBounds().y  >= 480 && upArray[7].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[7].setIcon(upArray[7].cross);
                    }
                    }
                    
                    
                    if(upArray[8].getIcon() == up.blue)
                    {
                    if(upArray[8].getBounds().y  >= 480 && upArray[8].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[8].setIcon(upArray[8].cross);
                    }
                    }
                    
                    
                    if(upArray[9].getIcon() == up.blue)
                    {
                    if(upArray[9].getBounds().y  >= 480 && upArray[9].getBounds().y  <= 570)
                    {
                        score++;
                        upArray[9].setIcon(upArray[9].cross);
                    }
                    }
                }
        
        if (key == KeyEvent.VK_DOWN )
                {
                    if(down.getIcon() == down.green)
                    {
                    
                    if(down.getBounds().y  >= 480 && down.getBounds().y  <= 570)
                    {
                        System.out.println("down");
                        down.keys = true;
                        score ++;
                        System.out.println(score);
                        down.setIcon(down.cross);
                    }
                    }
                    
                    
                    if(downArray[0].getIcon() == down.green)
                    {
                    if(downArray[0].getBounds().y  >= 480 && downArray[0].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[0].setIcon(downArray[0].cross);
                    }
                    }
                    
                    
                    if(downArray[1].getIcon() == down.green)
                    {
                    if(downArray[1].getBounds().y  >= 480 && downArray[1].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[1].setIcon(downArray[1].cross);
                    }
                    }
                    
                    
                    if(downArray[2].getIcon() == down.green)
                    {
                    if(downArray[2].getBounds().y  >= 480 && downArray[2].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[2].setIcon(downArray[2].cross);
                    }
                    }
                    if(downArray[3].getIcon() == down.green)
                    {
                    if(downArray[3].getBounds().y  >= 480 && downArray[3].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[3].setIcon(downArray[3].cross);
                    }
                    }
                    if(downArray[4].getIcon() == down.green)
                    {
                    if(downArray[4].getBounds().y  >= 480 && downArray[4].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[4].setIcon(downArray[4].cross);
                    }
                    }
                    if(downArray[5].getIcon() == down.green)
                    {
                    if(downArray[5].getBounds().y  >= 480 && downArray[5].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[5].setIcon(downArray[5].cross);
                    }
                    }
                    if(downArray[6].getIcon() == down.green)
                    {
                    if(downArray[6].getBounds().y  >= 480 && downArray[6].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[6].setIcon(downArray[6].cross);
                    }
                    }
                    if(downArray[7].getIcon() == down.green)
                    {
                    if(downArray[7].getBounds().y  >= 480 && downArray[7].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[7].setIcon(downArray[7].cross);
                    }
                    }
                    if(downArray[8].getIcon() == down.green)
                    {
                    if(downArray[8].getBounds().y  >= 480 && downArray[8].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[8].setIcon(downArray[8].cross);
                    }
                    }
                    if(downArray[9].getIcon() == down.green)
                    {
                    if(downArray[9].getBounds().y  >= 480 && downArray[9].getBounds().y  <= 570)
                    {
                        score++;
                        downArray[9].setIcon(downArray[9].cross);
                    }
                    }
                    
                    
                }
        
        if (key == KeyEvent.VK_LEFT )
                {
                   if(left.getIcon() == left.red)
                    {
                        
                    if(left.getBounds().y  >= 480 && left.getBounds().y  <= 570)
                    {
                        System.out.println("left");
                        left.keys = true;
                        score ++;
                        System.out.println(score);
                        //left.setColor(4);
                        left.setIcon(left.cross);
                    }
                    

                    }
                   if(leftArray[0].getIcon() == left.red)
                    {
                    if(leftArray[0].getBounds().y  >= 480 && leftArray[0].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[0].setIcon(leftArray[0].cross);
                    }
                    }
                    if(leftArray[1].getIcon() == left.red)
                    {
                    if(leftArray[1].getBounds().y  >= 480 && leftArray[1].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[1].setIcon(leftArray[1].cross);
                    }
                    }
                    if(leftArray[2].getIcon() == left.red)
                    {
                    if(leftArray[2].getBounds().y  >= 480 && leftArray[2].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[2].setIcon(leftArray[2].cross);
                    }
                    }
                    if(leftArray[3].getIcon() == left.red)
                    {
                    if(leftArray[3].getBounds().y  >= 480 && leftArray[3].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[3].setIcon(leftArray[3].cross);
                    }
                    }
                    if(leftArray[4].getIcon() == left.red)
                    {
                    if(leftArray[4].getBounds().y  >= 480 && leftArray[4].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[4].setIcon(leftArray[4].cross);
                    }
                    }
                    if(leftArray[5].getIcon() == left.red)
                    {
                    if(leftArray[5].getBounds().y  >= 480 && leftArray[5].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[5].setIcon(leftArray[5].cross);
                    }
                    }
                    if(leftArray[6].getIcon() == left.red)
                    {
                    if(leftArray[6].getBounds().y  >= 480 && leftArray[6].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[6].setIcon(leftArray[6].cross);
                    }
                    }
                    if(leftArray[7].getIcon() == left.red)
                    {
                    if(leftArray[7].getBounds().y  >= 480 && leftArray[7].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[7].setIcon(leftArray[7].cross);
                    }
                    }
                    if(leftArray[8].getIcon() == left.red)
                    {
                    if(leftArray[8].getBounds().y  >= 480 && leftArray[8].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[8].setIcon(leftArray[8].cross);
                    }
                    }
                    if(leftArray[9].getIcon() == left.red)
                    {
                    if(leftArray[9].getBounds().y  >= 480 && leftArray[9].getBounds().y  <= 570)
                    {
                        score++;
                        leftArray[9].setIcon(leftArray[9].cross);
                    }
                    }
                }
        
        if (key == KeyEvent.VK_RIGHT )
                {
                    if(right.getIcon() == right.yellow)
                    {
                    
                        if(right.getBounds().y >= 480 && right.getBounds().y  <= 570)

                        {
                            System.out.println("right");
                            right.keys = true;
                            score ++;
                            System.out.println(score);
                            right.setIcon(right.cross);
                        }

                    }
                    if(rightArray[0].getIcon() == right.yellow)
                    {
                    if(rightArray[0].getBounds().y  >= 480 && rightArray[0].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[0].setIcon(rightArray[0].cross);
                    }
                    }
                    if(rightArray[1].getIcon() == right.yellow)
                    {
                    if(rightArray[1].getBounds().y  >= 480 && rightArray[1].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[1].setIcon(rightArray[1].cross);
                    }
                    }
                    if(rightArray[2].getIcon() == right.yellow)
                    {
                    if(rightArray[2].getBounds().y  >= 480 && rightArray[2].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[2].setIcon(rightArray[2].cross);
                    }
                    }
                    if(rightArray[3].getIcon() == right.yellow)
                    {
                    if(rightArray[3].getBounds().y  >= 480 && rightArray[3].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[3].setIcon(rightArray[3].cross);
                    }
                    }
                    if(rightArray[4].getIcon() == right.yellow)
                    {
                    if(rightArray[4].getBounds().y  >= 480 && rightArray[4].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[4].setIcon(rightArray[4].cross);
                    }
                    }
                    if(rightArray[5].getIcon() == right.yellow)
                    {
                    if(rightArray[5].getBounds().y  >= 480 && rightArray[5].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[5].setIcon(rightArray[5].cross);
                    }
                    }
                    if(rightArray[6].getIcon() == right.yellow)
                    {
                    if(rightArray[6].getBounds().y  >= 480 && rightArray[6].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[6].setIcon(rightArray[6].cross);
                    }
                    }
                    if(rightArray[7].getIcon() == right.yellow)
                    {
                    if(rightArray[7].getBounds().y  >= 480 && rightArray[7].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[7].setIcon(rightArray[7].cross);
                    }
                    }
                    if(rightArray[8].getIcon() == right.yellow)
                    {
                    if(rightArray[8].getBounds().y  >= 480 && rightArray[8].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[8].setIcon(rightArray[8].cross);
                    }
                    }
                    if(rightArray[9].getIcon() == right.yellow)
                    {
                    if(rightArray[9].getBounds().y  >= 480 && rightArray[9].getBounds().y  <= 570)
                    {
                        score++;
                        rightArray[9].setIcon(rightArray[9].cross);
                    }
                    }
                    
                
                }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
