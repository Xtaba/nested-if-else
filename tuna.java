//enumeration or enum is like classes to declare constants
public enum tuna {
	Ehsun("Nice", "24"), //objects
	Nely("cutie","18"),
	taylor("mistake","22"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iWish", "16"); //long list of constants
	
	private final String desc; //set of thier own variables
	private final String year;
	
	
	tuna(String description, String birthday){ //build a constructor
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc; //returns the info we wanted
	}
	
	public String getYear(){
		return year;
	}
}

