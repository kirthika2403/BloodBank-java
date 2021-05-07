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
	{   boolean validity=false;
	{   
		
		String num=String.valueOf(mobileNum.mobileNo);
		if(num.length()==10 && (num.startsWith("7")|| num.startsWith("8") || num.startsWith("9")))
				
		{   list.add(mobileNum);
			System.out.println("Valid credentials");
			validity=true;
			System.out.println(mobileNum.mobileNo);
			
		}
		else 
		{
			System.out.println("InValid credentials");
		}
			    	
	}
	return validity;
}
	public static void displayCustomerList()
	{   
		System.out.println(list);
	}

}
