package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Setmain {

	public static void main(String[] args) {

		Set hashset = new HashSet();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(45);
		hashset.add(50);
		
		System.out.println("\tHashSet \n" + hashset);
		
		Iterator a = hashset.iterator();
		
		while(a.hasNext()) {
			System.out.print(a.next() + "\t");
		}
		
		System.out.println();
		
		TreeSet tree = new TreeSet();
		
		tree.add(50);
		tree.add(40);
		tree.add(30);
		tree.add(5);
		tree.add(20);
		tree.add(10);
		
		System.out.println("\n \tTreeSet \n" + tree);
		
		
		
	}

}
