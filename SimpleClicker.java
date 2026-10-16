import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
    
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    
	public void paintComponent(Graphics g){
		if(xClick != -9999 && yClick != -9999)
			g.drawOval(xClick, yClick, 100, 100);
		g.drawOval(x, y, 100, 100);
	}

    public void mouseClicked (MouseEvent event) {
		System.out.println ("You're tickling me!");
		this.xClick = event.getX();
		this.yClick = event.getY();
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
