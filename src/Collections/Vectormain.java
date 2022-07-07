package Collections;

import java.util.Vector;

public class Vectormain {

	public static void main(String[] args) {

		Vector vector = new Vector(3);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println();
		
		vector = new Vector(2, 3);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	
	}

}
