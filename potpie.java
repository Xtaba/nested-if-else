//two string method /composition
public class potpie {
	private int month; //variable
	private int day;  //private
	private int year;  //no value
	
	public potpie(int m, int d, int y){ //pass the parameters 
		month = m; //4
		day = d;  //5
		year = y;  //6
		
		System.out.printf("The constructor for this is %s\n", this);  //everytime I create and object print this
	}  //reference to current object
	
	public String toString(){  //refrence to string look to me when you need and strring
		return String.format("%d/%d/%d", month, day, year);
	}
}
