package adt;

import java.util.Vector;

public class Lista {
	
	public Vector<Integer> numeri;
	
	public Lista(){
		
		numeri = new Vector<Integer>();
	}
	
	public void inserisciIntesta(int n) {
		
		 if(!numeri.contains(new Integer(n))) numeri.add(0,new Integer(n));
		 else{
			 
			 numeri.setSize(numeri.size()+1);
			 numeri.add(0,new Integer(n));
			 
		 }
		
	}
	
	public void inserisciInCoda(int n){
		
		 if(!numeri.contains(new Integer(n))) numeri.addElement(new Integer(n));
		 else{
			 
			 numeri.setSize(numeri.size()+1);
			 numeri.addElement(new Integer(n));
			 
		 }
	}
	
	public void inserisciInPosizione(int n,int pos){
		if(!numeri.contains(new Integer(n))) numeri.add(pos,new Integer(n));
		 else{
			 
			 numeri.setSize(numeri.size()+1);
			 numeri.add(pos,new Integer(n));
			 
		 }
		
	}
	
	public dimensioneLista(List lista){
		return;
	}

	@Override
	public String toString() {
		return "Lista [numeri=" + numeri + "]";
	}
	
	
	

}
