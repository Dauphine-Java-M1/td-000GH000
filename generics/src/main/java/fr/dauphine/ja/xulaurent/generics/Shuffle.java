package fr.dauphine.ja.xulaurent.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Shuffle {
	
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println(l1);
		shuffle(l1);
		System.out.println(l1);
		
		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(l2);
		shuffle(l2);
		System.out.println(l2);
	}
	
	private static <T extends Object> void swap(List<T> l, int i, int j) {
		if (l.isEmpty() || l.size() == 1) {
			throw new IllegalArgumentException("List is too short, can't swap");
		}
		T old = l.get(i);
		l.set(i, l.get(j));
		l.set(j, old);
	}
	
	private static <T extends Object> void shuffle(List<T> l) {
		Random rand = new Random();
		int listSize = l.size();
		for (T t : l) {
			int pos1 = rand.nextInt(((listSize - 1) - 0) + 1) + 0;
			int pos2 = rand.nextInt(((listSize - 1) - 0) + 1) + 0;
			swap(l, pos1, pos2);
		}
	}
}
