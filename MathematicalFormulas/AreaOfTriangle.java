import acm.program.*;

public class AreaOfTriangle extends ConsoleProgram {
	public void run() {
		
		println("Area of a triangle");
		
		double width = readInt("The width of the triangle: ");
		double height = readInt("The height of the triangle: ");
		
		double area = width * height * 1/2.0;
		
		println("The area of the triangle is " + area);
		
	}
}
