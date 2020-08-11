import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {

	public static final int PAUSE_TIME = 33;
	public static final int SIZE = 50;
	public static final int DX = 2;
	public static final int GRAVITY = 1;
	public static final double FRICTION_FACTOR = .9;

	public void run() {

		GOval ball = new GOval(0, 0, SIZE, SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.green);
		add(ball);

		double dy = 2;

		while (ball.getX() < getWidth()) {
			ball.move(DX, dy);
			if (ball.getY() > getHeight() - SIZE && dy > 0 ) {
				dy = -dy * FRICTION_FACTOR;
			} else {
				dy = dy + GRAVITY;
				pause(PAUSE_TIME);
			}
		}
	}
}
