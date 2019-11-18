package view;

import java.awt.Graphics;

import model.Circle;

public class DrawCircle implements Drawable {
	
	private final Circle c;
	
	public DrawCircle(Circle c) {
		this.c = c;
	}

	public void draw(Graphics g) {
		g.drawOval(this.c.getCenter().getX(), this.c.getCenter().getY(), this.c.getRayon(), this.c.getRayon());
	}


}
