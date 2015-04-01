package ese10x;

import adt.*;

public class Ese10X {

	public static void main(String[] args) {
		
		Lista l=new Lista();
		l.insertAtBeginning(5);
		l.insertAtEnd(6);
	    l.insertAtPosition(2, 1);
	    System.out.println(l.getDimension());
		System.out.println(l.toString());
		

	}

}
