package BloodBank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BloodGroupPlacesTest {
	/**
     * O+ present in trichy
     * valid case
     */
	@Test
	public void test() {
		boolean valid=BloodGroupPlaces.addBloodGroup("trichy","O+");
		System.out.println("\n");
	    assertFalse(valid);
		
	}
	/**
     * O- is not present in chennai
     * valid case
     */
	@Test
	public void test1()
	{
		boolean valid=BloodGroupPlaces.addBloodGroup("chennai","O-");
		System.out.println("\n");
		assertTrue(valid);
	}
	/**
     * A+ is present in chennai
     * valid case
     */
	@Test
	public void test2()
	{
		boolean valid=BloodGroupPlaces.removeBloodGroup("chennai","A+");
		System.out.println("\n");
		assertTrue(valid);
	}
	/**
     * Z+ is not present in trichy
     * valid case
     */
	@Test
	public void test3()
	{
		boolean valid=BloodGroupPlaces.removeBloodGroup("trichy","Z+");
		System.out.println("\n");
		assertFalse(valid);
	}

}
