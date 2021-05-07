package BloodBank;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
/**
 * 
 *Test case to validate Username
 *
 */
public class DonorUserCredentialsTest {
	
	/**
	 * details of 1st customer
	 * valid credentials
	 */
   @Test
	public void test() {
		
	   	DonorCredentials details=new DonorCredentials();
		details.customerName="kirthika";
		boolean valid=DonorUserCredentialsManagement.addCustomerName(details);
		assertTrue(valid);
		System.out.println("\n");
		
		 }
   /**
    * details of 2nd customer
    * valid details
    */
    @Test
    public void test1()
    {
    			DonorCredentials details=new DonorCredentials();
    			details.customerName="swetha";
    			boolean valid=DonorUserCredentialsManagement.addCustomerName(details);
    			assertTrue(valid);
    			DonorUserCredentialsManagement.displayCustomerList();
    			System.out.println("\n");
    	
    		    			
    }
    /**
     * details of 3rd customer
     * Invalid details
     */
    @Test
    public void test2()
    {
    		DonorCredentials details=new DonorCredentials();
			details.customerName="";
			boolean valid=DonorUserCredentialsManagement.addCustomerName(details);
			assertFalse(valid);
			System.out.println("\n");
						
	}
    /**
     * details of 4th customer
     * Invalid details
     */
    @Test
    public void test3()
    {
    				DonorCredentials details=new DonorCredentials();
    				details.customerName="KI";
    				boolean valid=DonorUserCredentialsManagement.addCustomerName(details);
    				assertFalse(valid);
    				System.out.println("\n");
    }
    /**
     * details of 5th customer
     * Invalid details
     */
    @Test
    public void test4()
    {
    	
    	        DonorCredentials details=new DonorCredentials();
    			details.customerName="swetha99";
    			boolean valid=DonorUserCredentialsManagement.addCustomerName(details);
    			assertFalse(valid);
    			DonorUserCredentialsManagement.displayCustomerList();
    			System.out.println("\n");
    	
    		    			
    }
}
   
