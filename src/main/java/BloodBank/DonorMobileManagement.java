package BloodBank;

import java.util.ArrayList;

public class DonorMobileManagement {
	static ArrayList<DonorCredentials> list = new ArrayList<DonorCredentials>();
	/**
	 * user defined function to validate mobile number
	 * @param mobileNum
	 * @return
	 */
	public static boolean addMobileNumber(DonorCredentials mobileNum) 
	{   boolean valid=false;
	{   
		
		String num=String.valueOf(mobileNum.mobileNo);
		if(num.length()==10)
		{
			if(num.startsWith("7")|| num.startsWith("8") || num.startsWith("9"))
				
		{   list.add(mobileNum);
			valid=true;
			System.out.println(mobileNum.mobileNo);
			System.out.println("Valid credentials");
			
		}
			else
				System.out.println("Invalid Credentials");
			
		}
		else 
			System.out.println("InValid credentials");
			    	
	}
	return valid;
}
	public static void displayCustomerList()
	{   
		System.out.println(list);
	}

}
