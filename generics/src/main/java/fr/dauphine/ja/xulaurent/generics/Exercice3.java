package fr.dauphine.ja.xulaurent.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice3 {

	/*public static <T extends CharSequence> List listLength(List<T> list) {
		ArrayList length = new ArrayList();
		for(int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}*/
	
	public static List listLength(List<? extends CharSequence> list) {
		ArrayList length = new ArrayList();
		for(int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static void main(String[] args) {
		List l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}

}