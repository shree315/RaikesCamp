import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawSomething extends GraphicsProgram {
	public void run() {
		//
		GLabel shreeLabel = new GLabel ("HAHAHAHA");
		shreeLabel.setFont("Serif Plain-46");
		shreeLabel.setColor(Color.YELLOW);
		add(shreeLabel, 100, 75);
		
		GRect shreeRect = new GRect (140, 60, 90, 30);
		shreeRect.setFillColor(Color.BLUE);
		shreeRect.setFilled(true);
		add(shreeRect);
		
		GPolygon shreeTriangle1 = new GPolygon(700, 500);
		shreeTriangle1.setFillColor(Color.GREEN);
		shreeTriangle1.setFilled(true);
		add(shreeTriangle1);
		
		
	}
}
