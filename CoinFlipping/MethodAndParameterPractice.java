import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class MethodAndParameterPractice extends GraphicsProgram {
	public static final int STOP_HEIGHT = 120;
	public static final int STOP_WIDTH = 40;

	private void stopLight(int xcoord, int ycoord, Color c) {

		// the grey box
		GRect box = new GRect(xcoord, ycoord, STOP_WIDTH, STOP_HEIGHT);
		box.setFilled(true);
		box.setFillColor(Color.gray);
		add(box);

		int height = STOP_HEIGHT / 3;

		// the red light
		if (c == Color.red) {
		GOval red = new GOval(xcoord, ycoord, STOP_WIDTH, height);
		red.setFilled(true);
		red.setFillColor(Color.red);
		add(red);
		}

		// the yellow light
		if (c==Color.yellow) {
		GOval yellow = new GOval(xcoord, ycoord + height, STOP_WIDTH, height);
		yellow.setFilled(true);
		yellow.setFillColor(Color.yellow);
		add(yellow);
		}

		// the green light
		if (c==Color.green) {
		GOval green = new GOval(xcoord, ycoord + height + height, STOP_WIDTH, height);
		green.setFilled(true);
		green.setFillColor(Color.green);
		add(green);
		}

	} 

	public void run() {
		int x = 100;
		int y = 100;
		stopLight(x, y, Color.red);
	}
		
		x = 200;
		stopLight(x,y);
		

	} // ends the run method
} // ends the practice method
