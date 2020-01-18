package fr.dauphine.ja.xulaurent.shapes;

import static org.junit.Assert.*;
import org.junit.Test;
import fr.dauphine.ja.xulaurent.shapes.model.Ring;
import fr.dauphine.ja.xulaurent.shapes.model.Point;

public class RingTest {
	
	@Test
	public void equalsTest() {
		Ring r1 = new Ring(new Point(1,1), 2, 2);
		Ring r2 = new Ring(new Point(1,1), 2, 2);
		Ring r3 = new Ring(new Point(1,1), 1, 1);
		
		assertTrue(r1.equals(r2));
		assertFalse(r1.equals(r3));
	}
	
	public void containsTest() {
		Ring r1 = new Ring(new Point(1,1), 5, 2);
		Ring r2 = new Ring(new Point(1,1), 3, 2);
		Ring r3 = new Ring(new Point(1,1), 6, 1);
		Point p = new Point(1,1);
		Point p1 = new Point(2,2);
		
		assertFalse(Ring.contains(p, r1, r2, r3));
		assertTrue(Ring.contains(p1, r1, r2,r3));
	}
}
