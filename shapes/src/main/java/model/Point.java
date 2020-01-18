package model;

import java.util.ArrayList;

public class Point {
	
	private int x;
	private int y;
	private static int compteur = 0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		compteur++;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		compteur++;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		
//		System.out.println(p1 == p2); // true because ref object is same
//		System.out.println(p1 == p3); // false because p1 and p3 are two differents object
//		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2)); // indexOf calls equals() method
		System.out.println(list.indexOf(p3));
		System.out.println(p3.equals(list.get(0)));
		System.out.println(list);
	}
	
	public boolean isSameAs(Point p) { 
		return this.x == p.getX() && this.y == p.getY();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		else {
			Point p = (Point) obj;
			return this.isSameAs(p);
		}
	}
	
	public Point translate(int dx, int dy) {
		return new Point(this.x + dx, this.y + dy);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

}
