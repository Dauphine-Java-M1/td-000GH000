package fr.dauphine.ja.xulaurent.generics;

public class Maximums {

	public static void main(String[] args) {
		System.out.println(myMax(42, 1664));
		System.out.println(myMax(2014, 86, 13));
		System.out.println(myMax(8.6, 16.64));
		System.out.println(myMax("baa", "aba"));
		System.out.println(myMax());
		//System.out.println(myMax(8.6, "aba"));
		//System.out.println(myMax());
		//System.out.println(compareTo());
	}

	/*public static int myMax(int... numbers) {
		int max = numbers[0];
		for (int i : numbers) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}*/

	public static <T extends Comparable<T>> T myMax(T... t) {
		if (t.length == 0) {
			throw new IllegalArgumentException("need at least 1 args");
		}
		T max = t[0];
		for (T e : t) {
			if (max.compareTo(e) == -1)
				max = e;
		}
		return max;
	}

}
