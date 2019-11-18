package model;

import java.util.ArrayList;

public class Ring extends Shape{
	private Circle externe;
	private Circle interne;
	
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 2);
		Ring r1 = new Ring(p1, 1, 3);
		Ring r2 = new Ring(p1, 1, 3);
		
//		System.out.println(r1.equals(r2));
//		System.out.println(r1);
		System.out.println(r1.contains(p2));
	}
	
	public Ring(Point centre, int interne, int externe) {
		if (externe < interne) {
			this.externe = new Circle(centre, externe);
			this.interne = new Circle(centre, 0); // Si le rayon interne est plus grand que le rayon externe, on considère que c'est une erreur et donc interne vaut 0 par défault 
		}
		else {
			this.externe = new Circle(centre, externe);
			this.interne = new Circle(centre, interne);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ring)) {
			return false;
		}
		else {
			Ring r = (Ring)obj;
			if (r.interne.equals(this.interne) && r.externe.equals(this.externe)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Ring de centre " + this.interne.getCenter() + ", de rayon interne " + this.interne.getRayon() + " et de rayon externe " + this.externe.getRayon();
	}
	
	private boolean contains(Point p) {
		if (!this.interne.contains(p) && this.externe.contains(p)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean contains(Point p, ArrayList<Ring> rings) {
		for (Ring r : rings) {
			if (r.contains(p)) {
				return true;
			}
		}
		return false;
	}

}
