//sum of all the elements in your array

public class arraySum {
	public static void main(String[] args){
		int Ehsun[]={4,23,245,3234,432,232};
		int sum = 0; //keeps the total of all elements
		
		for(int counter=0; counter<Ehsun.length; counter++){
			sum += Ehsun[counter]; //stores everything into variable sum
		}
		System.out.println("The sum of these numbers is " +sum);
}
}