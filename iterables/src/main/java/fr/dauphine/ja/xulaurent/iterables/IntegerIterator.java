package fr.dauphine.ja.xulaurent.iterables;

import java.util.Iterator;

public class IntegerIterator implements Iterator<Integer>{
	
	private int deb;
	private int fin;
	
	public IntegerIterator(int deb, int fin) {
		this.deb = deb;
		this.fin = fin;
	}

	public boolean hasNext() {
		if (this.deb <= this.fin) {
			return true;
		}
		else {
		return false;
		}
	}

	public Integer next() {
		if (hasNext()) {
			return deb++;
		}
		else {
			return null;
		}
	}
}