package fr.dauphine.ja.xulaurent.shapes;
import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.ja.xulaurent.shapes.model.Circle;
import fr.dauphine.ja.xulaurent.shapes.model.Point;

public class CircleTest {

	@Test
	public void containsTest() {
		Circle c1 = new Circle(new Point(1,1), 3);
		Circle c2 = new Circle(new Point(3,3), 1);
		Circle c3 = new Circle(new Point(4,2), 2);
		Point p = new Point(1,1);
		Point p1 = new Point(4,4);
		Point p2 = new Point(7,4);
		
		assertTrue(Circle.contains(p, c1, c2, c3));
		assertTrue(Circle.contains(p1, c1, c2, c3));
		assertFalse(Circle.contains(p2, c1, c2, c3));
	}
}
