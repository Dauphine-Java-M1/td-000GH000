package fr.dauphine.ja.xulaurent.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.xulaurent.shapes.model.Circle;

public class CircleDrawable implements Drawable{

	private Circle c;

	public CircleDrawable(Circle c) {
		this.c = c;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		draw2(g);
	}

	public void draw2(Graphics g) {
		g.fillOval(c.getCenter().getX() - c.getRadius() / 2, c.getCenter().getY() - c.getRadius() / 2, c.getRadius(), c.getRadius());
	}

}
