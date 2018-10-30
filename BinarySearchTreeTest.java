package edu.olemiss.csci211;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {
	
	/** A class useful for testing.
	 * 
	 * @author rhodes
	 *
	 */
	public class RaceHorse implements  Comparable<RaceHorse> {
		
		private int jerseyNumber;
		private String horseName;
		
		public RaceHorse(int jerseyNumber, String name) {
			
			this.jerseyNumber = jerseyNumber;
			this.horseName = name;
		}

		// This constructor allows us to make a bogus racehorse using
		// just the jersey number. This is useful for contains()
		public RaceHorse(int jerseyNumber) {
			
			this.jerseyNumber = jerseyNumber;
			this.horseName = "A Horse With No Name";
		}
 

		public int compareTo(RaceHorse h) {
			
			return this.jerseyNumber - h.jerseyNumber;
		}

		
		
	}
	
	

	@Test
	public void constructor1() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();  
	}

	
	@Test
	public void add1() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		
		assertEquals("6", t.toString());
	}

	@Test
	public void add2() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(5);
		
		assertEquals("5 6", t.toString());  //  We need to call the toString() explicitly
											// so JUnit knows to compare two strings, not a string and a tree.
	}

	@Test
	public void add3() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(5);
		t.add(7);
		
		assertEquals("5 6 7", t.toString()); 
	}
	
	@Test
	public void add4() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(5);
		t.add(7);
		t.add(8);
		t.add(4);
		
		assertEquals("4 5 6 7 8", t.toString()); 
	}

	
	@Test
	public void contains1() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		
		assertTrue(t.contains(6));
	}

	@Test
	public void contains2() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		
		assertFalse(t.contains(4));
	}
	
	@Test
	public void contains3() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(6);
		t.add(8);
		
		assertTrue(t.contains(8));
	}

	@Test
	public void contains4() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(6);
		t.add(8);
		
		assertFalse(t.contains(4));
	}

	@Test
	public void contains5() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(6);
		t.add(6);
		t.add(8);
		
		assertTrue(t.contains(6));
	}

	
	@Test
	public void contains6() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(10);
		t.add(15);
		t.add(5);
		t.add(1);
		t.add(7);
		t.add(12);
		t.add(17);
		assertFalse(t.contains(6));
	}

	
	@Test
	public void contains7() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(10);
		t.add(15);
		t.add(5);
		t.add(1);
		t.add(7);
		t.add(12);
		t.add(17);
		assertTrue(t.contains(17));
	}

	@Test
	public void contains8() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(10);
		t.add(15);
		t.add(5);
		t.add(1);
		t.add(7);
		t.add(12);
		t.add(17);
		assertTrue(t.contains(5));
	}

	@Test
	public void contains9() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(10);
		t.add(15);
		t.add(5);
		t.add(1);
		t.add(7);
		t.add(12);
		t.add(17);
		assertTrue(t.contains(10));
	}

	@Test
	public void contains10(){
	
		RaceHorse r1= new RaceHorse(1,"Chatanooga Choo Choo");
		RaceHorse r2= new RaceHorse(2,"Vaya con Dios");
		RaceHorse r3= new RaceHorse(3,"Sarsasparilla");
		
		BinarySearchTree<RaceHorse> t = new BinarySearchTree<RaceHorse>();
		
		t.add(r1);
		t.add(r2);
		t.add(r3);
		
		assertTrue(t.contains(new RaceHorse(1)));
		assertFalse(t.contains(new RaceHorse(4)));
		
		
	}
	
	
	
}
