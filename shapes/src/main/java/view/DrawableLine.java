package view;

import java.awt.Graphics;

import model.LigneBrisee;
import model.Point;

public class DrawableLine implements Drawable {
	
	private LigneBrisee ligne;
	
	public DrawableLine(LigneBrisee ligne) {
		this.ligne = ligne;
	}
	
	public void draw(Graphics g) {
		Point p1 = null;
		Point p2 = null;
		for (int i = 0; i < ligne.nbPoints() - 1; i++) {
			p1 = ligne.getPoints().get(i);
			p2 = ligne.getPoints().get(i+1);
			g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}
	}

}
