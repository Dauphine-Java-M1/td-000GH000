package fr.dauphine.ja.xulaurent.shapes;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	
	public static void main(String[] args) {
//		Point p = new Point(2, 3);
//		System.out.println(p.x + " " + p.y);
		
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
//		System.out.println(p1 == p2);
//		System.out.println(p1 == p3);
//		System.out.println(p1.isSameAs(p2));
//		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSameAs(Point p) {
		return this.x == p.getX() && this.y == p.getY();
	}
	
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
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
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}