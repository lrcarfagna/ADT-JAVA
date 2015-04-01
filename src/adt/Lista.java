package adt;

import java.util.Vector;

public class Lista {
	
	private Vector elementi;
	
	public Lista(){
		
		elementi = new Vector();
	}
	
	public void insertAtBeginning(int n) {

			 elementi.add(0,new Integer(n)); 
	}
	
	public void insertAtEnd(int n){

			 elementi.addElement(new Integer(n));
	}
	
	public void insertAtPosition(int n,int pos){
		
			 elementi.add(pos,new Integer(n));
	}
	
	public int getDimension(){
		
		return  elementi.size();
	}
	
	public int getFirst(){
		
		return ((Integer)elementi.firstElement()).intValue();	
	}
	
	public int getLast(){
		
		return((Integer)elementi.lastElement()).intValue();
	}
	
	public int getAtPosition(int pos){
		
		return((Integer)elementi.elementAt(pos)).intValue();
	}
	
	public void removeFirst(){
		elementi.removeElementAt(0);
	}
	
	public void removeLast(){
		elementi.removeElementAt(elementi.size());
	}
	
	public void Empty(){
		elementi.removeAllElements();
	}
	
	public void getCapacity(){
		elementi.capacity();
	}

	@Override
	public String toString() {
		return "numeri= {" + elementi + "}";
	}

	
	
	

}
