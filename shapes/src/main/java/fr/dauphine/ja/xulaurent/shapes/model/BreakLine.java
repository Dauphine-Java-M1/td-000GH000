package fr.dauphine.ja.xulaurent.shapes.model;
import java.util.LinkedList;
import java.util.Objects;

public class BreakLine extends Shape{

	private LinkedList<Point> listPoint;

	public BreakLine() {
		this.listPoint = new LinkedList<>();
	}

	public static void main(String[] args) {
		BreakLine bl1 = new BreakLine();
		BreakLine bl2 = new BreakLine();
		Point p1 = new Point(1,2);
		Point p2 = new Point(2,4);
		Point p3 = new Point(4,3);

		bl1.add(p1);
		bl1.add(p2);
		bl1.add(p3); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2

		System.out.println(bl1.contains(new Point(1,2)));

		bl2.add(p1);
		//bl2.add(null);
		System.out.println(bl2.contains(new Point(1,3))); // java.lang.NullPointerException
	}

	public void add(Point p) {
		this.listPoint.addLast(Objects.requireNonNull(p));
	}

	/*public int pointCapacity() { // become useless because LinkedList has no capacity limit
	}*/

	public int nbPoints() {
		return this.listPoint.size();
	}

	public boolean contains(Point p) { // don't need try / catch block anymore
		Objects.requireNonNull(p);
		for (Point point : this.listPoint) {
			if (point.equals(p)) { // point may be null if tab not full or added null
				return true;
			}
		}
		return false;
	}
	
	public LinkedList<Point> getListPoint() {
		return this.listPoint;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	private int pointCapacity;
	private Point[] tab;
	private int i;

	public BreakLine(int pointCapacity) {
		this.pointCapacity = pointCapacity;
		this.tab = new Point[pointCapacity];
		this.i = 0;
	}

	public static void main(String[] args) {
		BreakLine bl1 = new BreakLine(2);
		BreakLine bl2 = new BreakLine(2);
		Point p1 = new Point(1,2);
		Point p2 = new Point(2,4);
		Point p3 = new Point(4,3);

		bl1.add(p1);
		bl1.add(p2);
		bl1.add(p3); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2

		System.out.println(bl1.contains(new Point(1,2)));

		bl2.add(p1);
		//bl2.add(null);
		System.out.println(bl2.contains(new Point(1,3))); // java.lang.NullPointerException
	}

	public void add(Point p) {
		if (this.i < this.pointCapacity) {
			this.tab[i] = Objects.requireNonNull(p);
			i++;
		}
	}

	public int pointCapacity() {
		return this.pointCapacity;
	}

	public int nbPoints() {
		return this.i;
	}

	public boolean contains(Point p) {
		Objects.requireNonNull(p);
		try {
			for (Point point : this.tab) {
				if (point.equals(p)) { // point may be null if tab not full or added null
					return true;
				}
			}
			return false;
		}
		catch (NullPointerException e) {
			return false;
		}
	}

	public Point getPoint(int i) {
		return this.tab[i];
	}
	 */
}
