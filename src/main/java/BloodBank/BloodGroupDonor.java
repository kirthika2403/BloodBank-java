package BloodBank;
import java.util.*;
public class BloodGroupDonor {
static HashMap<String,ArrayList<Long>> donors=new HashMap<String,ArrayList<Long>>();
static HashMap<Long,String> donorDetails=new HashMap<Long,String>();
static ArrayList<Long>donorListO = new ArrayList<Long>();
static ArrayList<Long>donorListA = new ArrayList<Long>();
static ArrayList<Long>donorListA1B = new ArrayList<Long>();
static {
donorDetails.put(7708707278L,"lingtan");
donorDetails.put(9080051127L,"lavanya");
donorDetails.put(7598002794L,"kirthika");
donorDetails.put(7598002796L,"surya");

donors.put("O+" ,donorListO);
donors.put("A+" ,donorListA);
donors.put("A1B+", donorListA1B);

}
	/**
	 * user defined function to add donor to their blood group
	 * @param donor
	 * @param bloodType
	 * @return
	 */
	public static boolean addDonars(String bloodType,Long donorId) { 
		boolean isAdded = false;
		ArrayList<Long> donarNames = donors.get(bloodType);
		if(donarNames.contains(donorId)) {
			System.out.println(donorId+" is already present");
		}
		else {
			donarNames.add(donorId);
			isAdded=true;
			System.out.println(donors);
			
		}
			
		return isAdded;
	}
	
	/**
	 * user defined function to display donor name of particular blood group
	 * @param bloodType
	 */
	public static void displayNames(String bloodType) 
	{
		ArrayList<Long> mobileNum=donors.get(bloodType);
		System.out.println("donor available in "+bloodType+" blood types is ");
		for(Long list:mobileNum)
		{
		  String names=donorDetails.get(list);
		  System.out.println(names);
		}
     }
	
	
}
