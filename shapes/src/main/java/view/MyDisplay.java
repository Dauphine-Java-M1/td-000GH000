package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Circle;
import model.LigneBrisee;
import model.Point;

public class MyDisplay extends JPanel{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay display = new MyDisplay();
		frame.add(display);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		World w = new World();
		Point p1 = new Point(100, 100);
		Point p2 = new Point(100, 150);
		Point p3 = new Point(20, 250);
		Circle c1 = new Circle(p1 , 50);
		LigneBrisee ligne1 = new LigneBrisee();
		ligne1.add(p1);
		ligne1.add(p2);
		ligne1.add(p3);
		w.addDrawable(new DrawCircle(c1));
		w.addDrawable(new DrawableLine(ligne1));
		for (Drawable d : w.getDrawables()) {
			d.draw(g);
		}
	}
}