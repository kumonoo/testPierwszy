package pl.b2b.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestKolekcji {

@Test
public void testKolekcjiZLiczbami() {
        //List - uporzadkowane
	    //Set - nieuporzadkowane
	
	java.util.List<Integer> liczby = new ArrayList<Integer>();
	liczby.add(2);
	liczby.add(3);
	liczby.add(4);
	
	assertEquals(3, liczby.size());
}



	@Test
	public void testKolekcjiZLiczbamiDouble() {
	        //List - uporzadkowane
		    //Set - nieuporzadkowane
		
		java.util.List<Double> liczby = new ArrayList<Double>();
		liczby.add(2.0);
		liczby.add(3.0);
		liczby.add(4.0);
		
		assertEquals(3, liczby.size());
}
	@Test
	public void testKolekcjiCzyListaZawiera() {
	        //List - uporzadkowane
		    //Set - nieuporzadkowane
		
		java.util.List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(3);
		liczby.add(4);
		
		boolean czyZawiera = liczby.contains (2);
		
		assertEquals(true, czyZawiera);
	}
	
	@Test
	public void testKolekcjiCzyListaNieZawieraElementuUsunietego() {
	        //List - uporzadkowane
		    //Set - nieuporzadkowane
		
		java.util.List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(3);
		liczby.add(4);
		
		liczby.remove(0);
		boolean czyZawiera = liczby.contains (2);
		
		assertEquals(false, czyZawiera);
	}
	
	@Test
	public void testKolekcjiCzyListaMarozmiar2() {
	        //List - uporzadkowane
		    //Set - nieuporzadkowane
		
		java.util.List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(3);
		liczby.add(4);
		
		liczby.remove(0);
		
	    assertEquals(2, liczby.size());
	}
}

