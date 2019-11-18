package view;

import java.util.ArrayList;

public class World {
	private ArrayList<Drawable> drawables;
	
	public World() {
		this.drawables = new ArrayList<Drawable>();
	}
	
	public ArrayList<Drawable> getDrawables() {
		return this.drawables;
	}
	
	public void addDrawable(Drawable d) {
		this.drawables.add(d);
	}
}
