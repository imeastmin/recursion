package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listmain {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("List Interface!");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator elements = list.iterator();
		
		while(elements.hasNext()) {
			System.out.print(elements.next() + "\t");
		}
		
	}

}
