package fr.dauphine.ja.xulaurent.shapes.model;

import java.util.ArrayList;
import java.util.Observable;

public class World extends Observable {
	
	private ArrayList<Shape> shapes;
	
	public World() {
		this.shapes = new ArrayList<>();
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public void changeWorld() {
		//doChangeWorld();
		setChanged();
		notifyObservers();
	}
	
	public ArrayList<Shape> getShapes() {
		return this.shapes;
	}

}
