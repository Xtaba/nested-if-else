//variable length argument list, building method not knowing how many argumments to take 

public class varLength {
	public static void main(String[] args){
		System.out.println(avg(43,56,2,3,4,2,3)); //can take any number of numbers
	}
	
	public static int avg(int ... numbers){ //... means we dont know how many arguments we gonna take; type is int 'elipse is ...'
	int total = 0;
	for(int x:numbers) //
		total+=x; //loop through all numbers and adds it to total
	
	return total/numbers.length; 
}
}