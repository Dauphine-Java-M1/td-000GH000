package fr.dauphine.ja.xulaurent.shapes.controller;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.xulaurent.shapes.model.Circle;
import fr.dauphine.ja.xulaurent.shapes.model.Shape;
import fr.dauphine.ja.xulaurent.shapes.model.World;

public class MouseController extends Frame implements MouseMotionListener{
	
	private Circle shape;
	private World world;
	
	public MouseController(Circle s, World world) {
		this.shape = s;
		this.world = world;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.shape.translate(e.getX(), e.getY());
		this.world.changeWorld();
	}

}
