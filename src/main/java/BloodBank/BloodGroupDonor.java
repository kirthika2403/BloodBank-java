package BloodBank;
import java.util.*;
public class BloodGroupDonor {
static HashMap<String, ArrayList<String>> donors=new HashMap<String,ArrayList<String>>();
static ArrayList<String> donorListO = new ArrayList<String>();
static ArrayList<String> donorListA = new ArrayList<String>();
static ArrayList<String> donorListA1B = new ArrayList<String>();
static {
donors.put("O+" ,donorListO );
donors.put("A+" ,donorListA );
donors.put("A1B+", donorListA1B);

}
	/**
	 * user defined function to add donor to their blood group
	 * @param donor
	 * @param bloodType
	 * @return
	 */
	public static boolean addDonars(String donor, String bloodType) { 
		boolean isAdded = false;
		ArrayList<String> donarNames = donors.get(bloodType);
		if(donarNames.contains(donor)) {
			System.out.println(donor+" is already present");
		}
		else {
			donarNames.add(donor);
			isAdded=true;
			System.out.println(donors);
		}
			
		return isAdded;
	}
	public static ArrayList<String> displayBloodGroupName(String bloodType){
		return donors.get(bloodType);
	}
	/**
	 * user defined function to display donor name of particular blood group
	 * @param bloodType
	 */
	public static void displayNames(String bloodType) 
	{
		
		ArrayList<String> names = BloodGroupDonor.displayBloodGroupName(bloodType);
		System.out.println("The donars with "+bloodType+" "+names);
	}
	
}
