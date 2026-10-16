
import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings2() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
   
   public void paintComponent (Graphics g) {
      this.newDrawRect(g, 10, 10, 500, 500);
      this.newDrawRect2(g, 200, 200, 300, 400);
      this.safeDrawRect(g, -1, 13, 6000, 7);
   }
   
   public void newDrawLine(Graphics g, int x, int y, int x1, int y1){
      g.drawLine(x,y,x1,y1);
   }
   
   // Step 25 Write newDrawRect2 here, which calls drawLine four times.
   public void newDrawRect(Graphics g, int tlx, int tly, int width, int height) {
      g.drawLine(tlx, tly, tlx + width, tly);
      g.drawLine(tlx, tly, tlx, tly + height);
      g.drawLine(tlx + width, tly, tlx + width, tly + height);
      g.drawLine(tlx, tly + height, tlx + width, tly + height);
   }
   
   // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
   //  a rectangle.  It should take drawRect.
   public void newDrawRect2(Graphics g, int tlx, int tly, int brx, int bry) {
      this.newDrawRect(g, tlx, tly, brx-tlx, bry-tly);  
   }

   public void safeDrawRect(Graphics g, int tlx, int tly, int brx, int bry){
      int maxX = this.getSize().width;
      int maxY = this.getSize().height;
      if (tlx >= 0 && tly >= 0 && brx <= maxX && bry <= maxY) {
         this.newDrawRect(g, tlx, tly, maxX, maxY);
      }
      else
         System.out.println("You are off the screen!");
      
   }
}
