package fr.dauphine.ja.xulaurent.shapes.view;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.xulaurent.shapes.controller.MouseController;
import fr.dauphine.ja.xulaurent.shapes.model.BreakLine;
import fr.dauphine.ja.xulaurent.shapes.model.Circle;
import fr.dauphine.ja.xulaurent.shapes.model.Point;
import fr.dauphine.ja.xulaurent.shapes.model.Ring;
import fr.dauphine.ja.xulaurent.shapes.model.Shape;
import fr.dauphine.ja.xulaurent.shapes.model.World;

public class MyDisplay extends JPanel implements Observer{

	private World w;
	private ArrayList<Drawable> drawables;

	public MyDisplay(World w) {
		this.w = w;
		this.drawables = new ArrayList<>();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		World w = new World();
		MyDisplay d = new MyDisplay(w);

		w.addObserver(d);
		frame.add(d);
		Circle c = new Circle(new Point(100,100), 50);
		BreakLine bl = new BreakLine();
		Ring r = new Ring(new Point(300, 100), 30, 20);
		bl.add(new Point(1,1));
		bl.add(new Point(50,50));
		bl.add(new Point(200,250));

		w.add(c);
		w.add(bl);

		d.drawables.add(new CircleDrawable(c));
		d.drawables.add(new BreakLineDrawable(bl));
		d.drawables.add(new RingDrawable(r));

		MouseController mc = new MouseController(c, w);
		frame.addMouseMotionListener(mc);
		while (true) {
			frame.repaint();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		for (Drawable d : this.drawables) {
			d.draw(g);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
	}
}
