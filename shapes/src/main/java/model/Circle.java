package model;

import java.util.ArrayList;

public class Circle extends Shape{
	private Point centre;
	private int rayon;
	
	public static void main(String[] args) {
//		Point p = new Point(1, 2);
//		Circle c1 = new Circle(p, 1);
//		
//		Circle c2 = new Circle(p, 2);
//		c2.translate(1, 1);
//		
//		System.out.println(c1 + "" + c2);
		Circle c = new Circle(new Point(1, 2), 3);
		c.getCenter().translate(1, 1);
		System.out.println(c);
		/*******/
		Point p = new Point(1, 1);
		Circle c1 = new Circle(p, 1);
		Circle c2 = new Circle(p, 1);
		System.out.println(c1.equals(c2));
	}
	
	public Circle(Point p, int rayon) {
		this.centre = p;
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		return "Cercle de centre " + this.centre + 
				", de rayon " + this.rayon + 
				", d'aire " + this.surface() + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle)) {
			return false;
		}
		else {
			Circle c = (Circle)obj;
			if (c.centre.equals(this.centre) && this.rayon == c.rayon) {
				return true;
			}
		}
		return false;
	}
	
	public void translate(int dx, int dy) {
		this.centre = new Point(this.centre.getX() + dx, this.centre.getY() + dy);
	}
	
	public Point getCenter() {
		return new Point(this.centre.getX(), this.centre.getY());
	}
	
	public int getRayon() {
		return this.rayon;
	}
	
	public double surface() {
		return Math.PI * Math.pow(this.rayon,2);
	}
	
	public boolean contains(Point p) {
		if (Math.pow((p.getX() - this.centre.getX()), 2) + Math.pow((p.getY() - this.centre.getY()), 2) < Math.pow(this.rayon,2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static public boolean contains(Point p, ArrayList<Circle> circles) {
		for (Circle c : circles) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}
}