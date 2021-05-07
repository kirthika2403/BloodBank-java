package BloodBank;

import java.util.ArrayList;

public class DonorUserCredentialsManagement {

	static ArrayList<DonorCredentials> donorList = new ArrayList<DonorCredentials>();
	/**
	 * user defined function to validate user name
	 * @param customer
	 * @return
	 */    
	public static boolean addCustomerName(DonorCredentials customer) 
	{   boolean validity=false;
			
			// check customerName is not null
			if(customer.customerName != null && customer.customerName.trim().length()>2 
					&& customer.customerName.trim().matches("^[a-zA-Z]*$"))
					
			{
				donorList.add(customer);
				System.out.println(customer.customerName);
				System.out.println("Valid credentials");
				validity=true;
				
				
			}
			else
			{
				System.out.println("Invalid credentials");
				
			}
			
		    	
		
		return validity;
	}
		
	public static void displayCustomerList()
	{   
		System.out.println(donorList);
	}
}

	