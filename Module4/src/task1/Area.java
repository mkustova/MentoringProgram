package task1;

public class Area extends Shape {

	public void rectangleArea(int length, int breadth) {
		System.out.println("The length is: " + length + ". The breadth is: " + breadth + ". The area of rectangle is " + length * breadth);
	};

	public void squareArea(int side) {
		System.out.println("The side is: " + side + ". The area of square is " + (int)Math.pow(side, 2));
	};

	public void circleArea(int radius) {
		System.out.println("The radius is: " + radius + ". The area of circle is " + (int)(3.14 * Math.pow(radius, 2)));
	};
}
