package BloodBank;
import java.util.*;
public class BloodGroupPlaces {
	static ArrayList<String> trichyBloodGroup= new ArrayList<String>();
	static ArrayList<String> chennaiBloodGroup= new ArrayList<String>();
		static
	{
		trichyBloodGroup.add("A+");
		trichyBloodGroup.add("A-");
		trichyBloodGroup.add("B+");
		trichyBloodGroup.add("O+");
		
		chennaiBloodGroup.add("O+");
		chennaiBloodGroup.add("A+");
		chennaiBloodGroup.add("B-");
	}
	/**
	 * User defined function to add blood group
	 * @param availablePlaces
	 * @param bloodType
	 * @return
	 */
	public static boolean addBloodGroup(String availablePlaces,String bloodType)
	{   
		boolean blood=false;
		
		if(availablePlaces.equalsIgnoreCase("trichy")&& !(trichyBloodGroup.contains(bloodType)))
		{ 
		    trichyBloodGroup.add(bloodType);
		    System.out.println(bloodType+"is added in " + availablePlaces);
		    displayBloodGroups(availablePlaces);
		    blood=true;
		   
		 
		}
		    
		 else if(availablePlaces.equalsIgnoreCase("chennai")&& !(chennaiBloodGroup.contains(bloodType)))
		{       
			    displayBloodGroups(availablePlaces);
			 	chennaiBloodGroup.add(bloodType);
			    System.out.println(bloodType+"is added in " + availablePlaces);
			    displayBloodGroups(availablePlaces);
			    blood=true;
			
		}
		 else
		 {
			 displayBloodGroups(availablePlaces);
			 System.out.println(bloodType+" blood group is already exist in "+availablePlaces);
		 }
		return blood;
		
	}
	/**
	 * user defined method remove bloodgroup from a city
	 * @param availablePlaces
	 * @param bloodType
	 */

   public static boolean removeBloodGroup(String availablePlaces,String bloodType)
   {   boolean valid=false;
	   if(availablePlaces.equalsIgnoreCase("trichy") && trichyBloodGroup.contains(bloodType))
	   {        
		   displayBloodGroups(availablePlaces);
		   System.out.println(bloodType+" blood is removed from "+availablePlaces);
		   trichyBloodGroup.remove(bloodType);      
		   displayBloodGroups(availablePlaces);
		   valid=true;
	   }
	  
	   else if(availablePlaces.equalsIgnoreCase("chennai") && chennaiBloodGroup.contains(bloodType))
	   {
		   displayBloodGroups(availablePlaces);
	       System.out.println(bloodType+" blood is removed from "+availablePlaces);
		   chennaiBloodGroup.remove(bloodType);
		   displayBloodGroups(availablePlaces);
		   valid=true;
		}
	   else
	   {
		   System.out.println(bloodType+" blood is not present at "+availablePlaces);
		   
	   }
	   return valid;
			 
		 }
	  
	/**
	 * method to display available blood group in Trichy 
	 * and chennai
	 * @return
	 */
   public static void displayBloodGroups(String place)
   {
	   System.out.println("Available Blood Groups in "+place);
	   if(place.equalsIgnoreCase("chennai")) 
	   {
		   System.out.println(chennaiBloodGroup);
	   }
	   else if(place.equalsIgnoreCase("trichy")) 
	   {
		   System.out.println(trichyBloodGroup);
	   }
		   
   }
	

}
