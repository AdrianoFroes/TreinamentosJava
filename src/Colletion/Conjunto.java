package Colletion;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		 
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Testo");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size... " + conjunto.size());
		
		
		
		

	}

}
