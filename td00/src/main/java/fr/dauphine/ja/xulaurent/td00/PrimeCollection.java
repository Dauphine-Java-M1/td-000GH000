package fr.dauphine.ja.xulaurent.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers = new ArrayList<>();
	}
	
	public void initRandom(int n, int m) {
		int min = 1, max = m;
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			this.numbers.add(rand.nextInt((max - min) + 1 ) + min);
		}
	}
	
	private static boolean isPrime(int p) {
		int num = (int)Math.ceil((Math.sqrt(p)));
		if (p == 0 || p == 1) {
			return false; // vous avez dit en amphi que 1 n'est pas un nombre premier
		}
		for (int i = 2; i <= num; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void printPrimes() {
		for (int i = 0; i < this.numbers.size(); i++) {
			if (isPrime(this.numbers.get(i))) {
				System.out.println(this.numbers.get(i) + " ");
			}
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection pc = new PrimeCollection();
        pc.initRandom(100, 2000);
        pc.printPrimes();
    }
    
}
