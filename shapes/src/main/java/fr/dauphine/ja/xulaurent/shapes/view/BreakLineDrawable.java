package fr.dauphine.ja.xulaurent.shapes.view;

import java.awt.Graphics;
import fr.dauphine.ja.xulaurent.shapes.model.BreakLine;

public class BreakLineDrawable implements Drawable {
	
	private BreakLine bl;
	
	public BreakLineDrawable(BreakLine bl) {
		this.bl = bl;
	}
	
	@Override
	public void draw(Graphics g) {
		int blNbPoints = this.bl.getListPoint().size();
		int[] x = new int[blNbPoints];
		int[] y = new int[blNbPoints];
		
		for (int i = 0; i < blNbPoints; i++) {
			x[i] = this.bl.getListPoint().get(i).getX();
			y[i] = this.bl.getListPoint().get(i).getY();
		}
		g.drawPolyline(x, y, blNbPoints);
	}

}
