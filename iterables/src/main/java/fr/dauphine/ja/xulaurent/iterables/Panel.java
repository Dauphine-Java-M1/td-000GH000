package fr.dauphine.ja.xulaurent.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer> implements Iterable<Integer> {

	private int beginning;
	private int end;

	public Panel(int deb, int fin) {
		this.beginning = deb;
		this.end = fin;
	}
	public static void main(String[] args) {
		Iterator<Integer> it = panel1(1, 5);

		for (;it.hasNext();) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		for (Integer i : panel2(1, 5)) {
			System.out.print(i + " ");
		}
		System.out.println();

		List<Integer> l = panel(3,6);
		for(int i: l) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(l.get(1));
		System.out.println(Panel.panel(0, 2).size());
	}

	//	public static Iterator<Integer> panel1(int deb, int fin) {
	//		return new IntegerIterator(deb, fin);
	//	}

	public static Iterator<Integer> panel1(final int deb, final int fin) {
		Iterator<Integer> it = new Iterator<Integer>() {
			int i = deb;

			public boolean hasNext() {
				if (i <= fin) {
					return true;
				}
				else {
					return false;
				}
			}

			public Integer next() {
				if (hasNext()) {
					return i++; 
				}
				else {
					return null;
				}
			}
		};

		return it;
	}

	public static Panel panel2(int deb, int fin) {
		return new Panel(deb, fin);
	}

	public Iterator<Integer> iterator() {
		return panel1(beginning, end);
	}

	public static List<Integer> panel(int deb, int fin) throws IllegalArgumentException{
		if (deb > fin) {
			throw new IllegalArgumentException();
		} 
		return new Panel(deb, fin);
	}

	@Override
	public Integer get(int i) {
		Iterator<Integer> it = panel2(beginning, end).iterator();
		while (i > 0) {
			it.next();
			i--;
		}
		return it.next();
	}

	@Override
	public int size() {
		int size = 0;
		Iterator<Integer> it = Panel.panel2(beginning, end).iterator();
		while (it.hasNext()) {
			it.next();
			size++;
		}
		return size;
	}

}