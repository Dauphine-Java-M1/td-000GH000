package fr.dauphine.ja.xulaurent.shapes.model;

public class Ring {
	
	private Circle cIn;
	private Circle cOut;
	
	public Ring(Point center, int radiusOut, int radiusIn) {
		if (radiusOut < radiusIn) {
			throw new IllegalArgumentException("radiusIn < radiusOut");
		}
		this.cOut = new Circle(center, radiusOut);
		this.cIn = new Circle(center, radiusIn);
	}
	
	public static void main(String[] args) {
		Ring ring = new Ring(new Point(1,1), 1, 1);
		System.out.println(ring);
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Ring)) {
			return false;
		}
		else {
			Ring r = (Ring) o;
			if (cIn.equals(r.getCircleIn()) && cOut.equals(r.getCircleOut())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(Point p) {
		return !this.cIn.contains(p) && this.cOut.contains(p);
	}
	
	public static boolean contains(Point p, Ring...rings) {
		for (Ring r : rings) {
			if (r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	public Circle getCircleIn() {
		return this.cIn;
	}
	
	public Circle getCircleOut() {
		return this.cOut;
	}
	
	public String toString() {
		return this.cIn.getCenter().toString() + ", r outside = " + this.cOut.getRadius() + ", r inside = " + this.cIn.getRadius();
	}
}
