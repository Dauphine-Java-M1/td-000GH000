package fr.dauphine.ja.xulaurent.iterables;

import java.util.Iterator;

public class Panel implements Iterable<Integer>{
	
	private int deb;
	private int fin;
	
	public Panel(int deb, int fin) {
		this.deb = deb;
		this.fin = fin;
	}
	public static void main(String[] args) {
		Iterator<Integer> it = panel1(1, 5);

		for (;it.hasNext();) {
			System.out.println(it.next());
		}
		
		for (Integer i : panel2(1, 5)) {
			System.out.println(i);
		}
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
		return panel1(deb, fin);
	}
	
}