package fr.dauphine.ja.xulaurent.shapes.model;


public class Circle {

	private Point center;
	private int r;
	
	public Circle(Point p, int r) {
		this.center = p;
		this.r = r;
	}
	
	public static void main(String[] args) {
//		Point p = new Point(1,2);
//		Circle c = new Circle(p,1);
//		
//		Circle c2 = new Circle(p,2);
//		c2.translate(1, 1);
//		
//		System.out.println(c + " ; " + c2);
		/********************/
		Circle c = new Circle(new Point(1,1), 2);
		c.getCenter().translate(1, 1);
		System.out.println(c);
		
		Point p = new Point(1,3);
		System.out.println(c.contains(p));
	}
	
	public void translate(int dx, int dy) {
		this.center = this.center.translate(dx, dy);
	}
	
	public boolean contains(Point p) {
		return Math.pow(p.getX() - this.center.getX(), 2) + Math.pow(p.getY() - this.center.getX(), 2) <= Math.pow(this.r, 2);
	}
	
	public static boolean contains(Point p, Circle...circles) {
		for (Circle c : circles) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			Circle c = (Circle) o;
			return this.center.equals(c.getCenter()) && this.r == c.getRadius();
		}
		else { 
			return false;
		}
	}
	
	public String toString() {
		return this.center.toString() + ", r = " + this.r + ", aire = " + surface();
	}
	
	public double surface() {
		return Math.pow(this.r, 2) * Math.PI;
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public int getRadius() {
		return this.r;
	}
}
