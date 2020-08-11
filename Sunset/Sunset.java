import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/* an animation of a sunset
 */

public class Sunset extends GraphicsProgram {
	
	private static final double PAUSE_TIME = 1000 / 36.0;

	private static final double DY = 1;

	private static final double SUN_SIZE = 50;

	private static final double TERRAIN_HEIGHT = 100;

	public void run() {

		// sky
		GRect sky = new GRect(0, 0, getWidth(), getHeight());
		sky.setFilled(true);
		sky.setFillColor(Color.blue);
		add(sky);

		// sun
		GOval sun = new GOval(getWidth() / 2, getHeight() / 2, SUN_SIZE, SUN_SIZE);
		sun.setFilled(true);
		sun.setFillColor(Color.orange);
		add(sun);

		// terrain
		GRect t = new GRect(0, getHeight() - TERRAIN_HEIGHT, getWidth(), TERRAIN_HEIGHT);
		t.setFilled(true);
		t.setFillColor(Color.green);
		add(t);

		// movement
		while (sun.getY() < t.getY()) {
			if (sun.getY() < t.getY()-100) {
				
			}
			sun.move(0, DY);
			pause(PAUSE_TIME);
		}
		sky.setFilled(true);
		sky.setFillColor(Color.orange);
	}
}
