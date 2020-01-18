package fr.dauphine.ja.xulaurent.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.xulaurent.shapes.model.Ring;

public class RingDrawable implements Drawable{
	
	private Ring r;
	private CircleDrawable cdIn;
	private CircleDrawable cdOut;
	
	public RingDrawable(Ring r) {
		this.r = r;
		this.cdIn = new CircleDrawable(r.getCircleIn());
		this.cdOut = new CircleDrawable(r.getCircleOut());
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		this.cdOut.draw2(g);
		g.setColor(Color.white);
		this.cdIn.draw2(g);
	}
	
	
}
