package fr.dauphine.ja.xulaurent.shapes;

import java.util.LinkedList;

public class LigneBrisee {
	private LinkedList<Point> points;
	
	public static void main(String[] args) {
		LigneBrisee lb = new LigneBrisee();
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(4, 6);
		Point p4 = new Point(3, 6);
		lb.add(p1);
		lb.add(p2);
		lb.add(p3);
		lb.add(p4);
//		lb.add(null);
//		System.out.println(lb.pointCapacity());
		System.out.println(lb.nbPoints());
		System.out.println(lb.contains(new Point(2, 3)));
		System.out.println(lb.contains(null));
	}
	
	public LigneBrisee() {
		this.points = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		this.points.add(p);
	}
	
	public int nbPoints() {
		return this.points.size();
	}
	
	public boolean contains(Point p) {
		return this.points.contains(p);
	}
}

/* VERSION TAB */
/*public class LigneBrisee {
	private Point[] points;
	private int nbMaxPoints;
	private int i;
	
	public static void main(String[] args) {
		LigneBrisee lb = new LigneBrisee(5);
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(4, 6);
		Point p4 = new Point(3, 6);
		lb.add(p1);
		lb.add(p2);
		lb.add(p3);
		lb.add(p4);
//		lb.add(null);
//		System.out.println(lb.pointCapacity());
//		System.out.println(lb.nbPoints());
//		System.out.println(lb.contains(new Point(2, 3)));
//		System.out.println(lb.contains(null));
	}
	
	public LigneBrisee(int nbMaxPoints) {
		this.nbMaxPoints = nbMaxPoints;
		points = new Point[this.nbMaxPoints];
		i = 0;
	}
	
	public void add(Point p) {
		if (i < this.nbMaxPoints) {
			this.points[i] = p;
			i++;
		}
	}
	
	public int pointCapacity() {
		return nbMaxPoints;
	}
	
	public int nbPoints() {
		return i;
	}
	
	public boolean contains(Point p) {
		for (Point point : points) {
			if (point.isSameAs(p)) {
				return true;
			}
		}
		return false;
	}
}*/