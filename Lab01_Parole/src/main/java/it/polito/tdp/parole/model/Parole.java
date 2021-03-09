package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	LinkedList<String> parole;
	ArrayList<String> parole2;
		
	public Parole() {
		//TODO
		parole = new LinkedList<String>();
		parole2 = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		parole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		LinkedList<String> paroleOrdinate = new LinkedList<String>(parole);
		Collections.sort(paroleOrdinate, new Comparatore());
		return paroleOrdinate;
	}
	
	public void reset() {
		// TODO
		parole.removeAll(parole);
	}
	
	
	
	public void cancella(String p) {
		parole.remove(p);		
	}

}
