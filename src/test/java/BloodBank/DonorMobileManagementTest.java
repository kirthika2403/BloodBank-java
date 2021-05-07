package BloodBank;

import static org.junit.Assert.*;


import org.junit.Test;
/**
 * 
 * test case to validate mobile number
 *
 */

public class DonorMobileManagementTest {

	
	/**
     * Donor mobile number
     * Valid number
     */
	@Test
	public void test() 
	{
		
		DonorCredentials details=new DonorCredentials();
		details.mobileNo=7598002793L;
		boolean valid=DonorMobileManagement.addMobileNumber(details);
		assertTrue(valid);
		DonorMobileManagement.displayCustomerList();
		System.out.println("\n");

	}
	/**
     * Donor mobile number
     * Valid number
     */
	
	@Test
	public void test1()
	{  
		DonorCredentials details=new DonorCredentials();
		details.mobileNo=9598002793L;
		boolean valid=DonorMobileManagement.addMobileNumber(details);
		assertTrue(valid);
		DonorMobileManagement.displayCustomerList();
		System.out.println("\n");
	}
	/**
     * Donor mobile number
     * InValid number
     */
	@Test
	public void test2()
	{   
		DonorCredentials details=new DonorCredentials();
		details.mobileNo=1598002793L;
		boolean valid=DonorMobileManagement.addMobileNumber(details);
		assertFalse(valid);
		DonorMobileManagement.displayCustomerList();
		System.out.println("\n");
	}

	

}
