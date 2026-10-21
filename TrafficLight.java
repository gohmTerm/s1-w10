import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements MouseListener{
    public int yClick;
	public int xClick;
    public int clickCount;

    public TrafficLight () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (400, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(10.0f));
        g.drawOval(100, 100, 200, 200);
        g.drawOval(100, 350, 200, 200);
		g.drawOval(100, 600, 200, 200);
        if (clickCount == 1){
            g.setColor(Color.red);
            g.fillOval(100, 100, 200, 200);
            g.setColor(Color.white);
            g.fillOval(100, 350, 200, 200);
            g.setColor(Color.white);
		    g.fillOval(100, 600, 200, 200);
        }
        if (clickCount == 2){
            g.setColor(Color.white);
            g.fillOval(100, 100, 200, 200);
            g.setColor(Color.yellow);
            g.fillOval(100, 350, 200, 200);
            g.setColor(Color.white);
		    g.fillOval(100, 600, 200, 200);
        }
        if (clickCount == 3){
            g.setColor(Color.white);
            g.fillOval(100, 100, 200, 200);
            g.setColor(Color.white);
            g.fillOval(100, 350, 200, 200);
            g.setColor(Color.green);
		    g.fillOval(100, 600, 200, 200);
        }

        //if(xClick != -9999 && yClick != -9999)
		    //g.drawOval(xClick, yClick, 100, 100);
	}

	public void mouseMoved(MouseEvent event){

	}

    public void mouseClicked (MouseEvent event) {
		this.xClick = event.getX();
		this.yClick = event.getY();
        clickCount = clickCount + 1;
        if (clickCount > 3){
            clickCount = 1;
        }
		repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}

