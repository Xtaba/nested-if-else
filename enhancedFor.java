//Enhanced for statement, specialize to loop through all the elements in your array

public class enhancedFor {
	public static void main(String[] args){
		int ehsun[] = {3,2,1,7,6};  //array initializer
		int sum = 0;  //holds the total here
		
		for(int x: ehsun){ //takes two thing, 1st type of data. Int is a type and x is a identifier, 2ed it takes name of the array
			sum += x; //sum of all number
		}
		
		System.out.println(sum);
	}
}