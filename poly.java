package javapg;
class Shapes{
	public int area (int side) {
		System.out.println("I am Square");
		return side*side;
	}

public int area(int l,int b) {
	System.out.println("I am Rectangle");
	return l*b;
}
public float area(float radius) {
	System.out.println("I am Circle");
	return 3.14f*radius*radius;
}
public double area(float b,float h) {
	System.out.println("I am Triangle");
	return 0.5*b*h; 
}
}

public class poly {

		public static void main(String[]args) {
			Shapes Shape=new Shapes();
			int rectangleArea = Shape.area(4,5);
			System.out.println("Area of rectangle;"+rectangleArea);
			int squareArea = Shape.area(4);
			System.out.println("Area of square;"+squareArea);
			float circleArea = Shape.area(4.5f);
			System.out.println("Area of circle:"+circleArea);
			float triangleArea = Shape.area(4,5);
			System.out.println("Area of Triangle:"+triangleArea);

	}
}


