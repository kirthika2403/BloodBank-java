package BloodBank;

import java.util.ArrayList;

public class DonorUserCredentialsManagement {
	static ArrayList<DonorCredentials> donorList = new ArrayList<DonorCredentials>();
	/**
	 * user defined function to validate user name
	 * @param customer
	 * @return
	 */    
	
	public static boolean validateUserName(DonorCredentials customer)
	{   boolean valid=false;
		if(customer.customerName != null && customer.customerName.trim().length()>2 )
		{
			if(customer.customerName.trim().matches("^[a-zA-Z]*$"))
			{
				
				System.out.println(customer.customerName+" Valid credentials");
				donorList.add(customer);
				displayCustomerList();
				valid=true;
				
			}
			else
			{
				System.out.println(customer.customerName+" Invalid credentials");
			}
		}
		else
		{
			System.out.println(customer.customerName+" Invalid credentials");
		}
		return valid;
		
	}
	
		
	public static void displayCustomerList()
	{   
		System.out.println(donorList);
	}
}

	
