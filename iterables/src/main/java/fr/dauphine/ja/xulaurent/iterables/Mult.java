package fr.dauphine.ja.xulaurent.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {

	public static void main(String[] args) {
		//		List<Integer> list = new ArrayList<>();
		//		list.add(2);
		//		list.add(4);
		//		list.add(6);
		//		System.out.println(mult(5, list));
		//		System.out.println(list);

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));

		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
	}

	/*public static List<Integer> mult(int coeff, List<Integer> list) {
		List<Integer> multList = new ArrayList<>();
		for (Integer i : list) {
			multList.add(i * coeff);
		}

		return multList;
	}*/

	public static List<Integer> mult(final int coeff, final List<Integer> al) {
		if (al instanceof RandomAccess) {
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int i) {
					return al.get(i) * coeff;
				}

				@Override
				public int size() {
					return al.size();
				}

			};
		}
		else {
			return new AbstractSequentialList<Integer>() {
				@Override
				public ListIterator<Integer> listIterator(final int index) {
					return new ListIterator<Integer>() {
						ListIterator<Integer> listIt = al.listIterator(index);
						
						@Override
						public boolean hasNext() {
							return listIt.hasNext();
						}

						@Override
						public Integer next() {
							return listIt.next() * coeff;
						}

						@Override
						public boolean hasPrevious() {
							return listIt.hasPrevious();
						}

						@Override
						public Integer previous() {
							return listIt.previous() * coeff;
						}

						@Override
						public int nextIndex() {
							return listIt.nextIndex();
						}

						@Override
						public int previousIndex() {
							return listIt.previousIndex();
						}

						@Override
						public void remove() {
							listIt.remove();
						}

						@Override
						public void set(Integer e) {
							listIt.set(e);
						}

						@Override
						public void add(Integer e) {
							listIt.add(e);
						}
					};
					
				}

				@Override
				public int size() {
					return al.size();
				}
			};
			
		}
	}
	
}
