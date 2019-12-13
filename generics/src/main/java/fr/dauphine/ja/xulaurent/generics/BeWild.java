package fr.dauphine.ja.xulaurent.generics;

import java.util.Arrays;
import java.util.List;


public class BeWild {
	
	private static <T extends Object> void print(List<T> list) {
		for (T o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo", "toto");
		List<Integer> list2 = Arrays.asList(1, 2); 
		// compile pas car la méthode print() attend en paramètre une liste de type Objet 
		//mais on n'a pas explicitement indiqué que String est un sous-type du type Objet (éviter les ClassCastException)
		print(list);
		print(list2);
		printLength(list);
	}
	
	public static <T extends CharSequence> void printLength(List<T> list) {
		for (T o : list) {
			System.out.println(o.length());
		}
	}

}