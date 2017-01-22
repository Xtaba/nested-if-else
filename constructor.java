//two string method
import java.util.EnumSet; //has a range method in defined in it


public class constructor {
	public static void main(String[] args){
		for(tuna people: tuna.values() ) //enhanced for loop, array that we need to loop through
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		System.out.println("\nNow for the range of constants!!!\n");
		
		for(tuna people: EnumSet.range(tuna.Ehsun,tuna.erin))//enhanced for loop to go to the range of an array
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
	}
}

//Object, description, year