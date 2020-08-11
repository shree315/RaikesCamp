import java.awt.Color;
import java.awt.event.*;
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class CircleSubdivision extends GraphicsProgram {
	

	public void run() {

		addMouseListeners(); 
		
		GOval c1 = new GOval(0, 0, getWidth(), getHeight());
		c1.setFilled(true);
		c1.setFillColor(Color.black);
		add(c1);
		
		
		
	} // ends the run

	@Override public void mouseDragged (MouseEvent e) {
		
		// object disappears
		GObject discard = getElementAt(e.getX(), e.getY());
		if (discard != null) {
			
			
			// variables for disappeared circle
			double x = discard.getX();
			double y = discard.getY();
			double width = discard.getWidth();
			double height = discard.getHeight();

			// circles
			GOval c2 = new GOval( x, y, width/2, height/2);
			c2.setFilled(true);
			c2.setFillColor(Color.black);
			add(c2);

			GOval c3 = new GOval( x + width/2, y, width/2, height/2);
			c3.setFilled(true);
			c3.setFillColor(Color.black);
			add(c3);
			
			GOval c4 = new GOval( x, y + height/2, width/2, height/2);
			c4.setFilled(true);
			c4.setFillColor(Color.black);
			add(c4);
			
			GOval c5 = new GOval( x + width/2, y + height/2, width/2, height/2);
			c5.setFilled(true);
			c5.setFillColor(Color.black);
			add(c5);
			
			remove(discard);
		}

	}
}
