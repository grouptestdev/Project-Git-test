package imed;

import junit.framework.TestCase;

public class Calcultest extends TestCase {
	private CalculMet m;

	protected void setUp() throws Exception {
		super.setUp();
		m= new CalculMet();
	}
	
	public void testsomme() {
		assertTrue(m.somme(2, 4)==6);
	}
	
	public void testprod() {
		assertTrue(m.produit(2, 4)==8);
	}
	

}
