/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      this.drawOlympicRings(g);
      

   }

   public void drawBullsEyes(Graphics g){
      g.setColor(Color.red);
      g.fillOval(100, 100, 128, 128);
      g.setColor(Color.black);
      g.fillOval(124, 124, 80, 80);
      g.setColor(Color.red);
      g.fillOval(148, 148, 32, 32);
   }

   public void drawOlympicRings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(100, 100, 25, 25);
   }

   public void drawTrafficLight(Graphics g){

   }


   public static void main(String[] args) {
      new Shapes();
   }


}
