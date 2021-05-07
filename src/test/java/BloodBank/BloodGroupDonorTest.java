package BloodBank;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
/**
 * Test case to validate and to add donor
 * to their blood group
 *
 */

public class BloodGroupDonorTest {

	@Test
	public void test() {
		boolean valid=BloodGroupDonor.addDonars("lingtan", "A+");
		System.out.println("\n");
		assertTrue(valid);
		
	}
	@Test
	public void test1()
	{
		boolean valid=BloodGroupDonor.addDonars("lavanya", "A+");
		System.out.println("\n");
		assertTrue(valid);
	}
	@Test
	public void test2() {
		boolean valid=BloodGroupDonor.addDonars("lingtan", "A+");
		System.out.println("\n");
		assertFalse(valid);
		
	}
	@Test
	public void test3() {
		boolean valid=BloodGroupDonor.addDonars("kirthi", "O+");
		System.out.println("\n");
		assertTrue(valid);
	}
	
	@Test
	public void test4() {
		boolean valid=BloodGroupDonor.addDonars("surya", "A1B+");
		System.out.println("\n");
		assertTrue(valid);
		
	}
	@Test
	public void test5()
	{
		BloodGroupDonor.displayNames("A+");
	}
}
