//Pass array in a methods

public class arrayMethod {
	public static void main(String[] args){
		int ehsun[] = {1,2,3,4,5}; //made an array name ehsun
		change(ehsun); //take that array ehsun and pass it to method change
		
		for(int y: ehsun) //print it out on screen
			System.out.println(y);
	}
	
	public static void change(int x[]){ //type and variable name with [] which take parameter of one array
		for (int counter = 0; counter<x.length; counter++)
			x[counter]+=5; // we take each value in the array and we add 5 to it 
	}
}