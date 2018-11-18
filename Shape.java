package Shapes;

public abstract class Shape {
	
	
		
		public abstract void draw();

	public static void main(String[] args) {
		Line l1=new Line();
		l1.draw();
		Rectangle r1=new Rectangle();
		r1.draw();
		Cube c1=new Cube();
		c1.draw();

	}

}
