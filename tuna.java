
public class tuna {
	private String name;
	private potpie birthday;
	
	
	public tuna(String theName, potpie theDate){
		name = theName;
		birthday = theDate; // reference to a object and not a string
	}

	public String toString(){
		return String.format("My name is %s, my birthday is %s",name, birthday );//we don't neccesarlly need %s for birthday 
	}
}

