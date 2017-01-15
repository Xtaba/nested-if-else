//random number generator to generate random numbers like rolling dice
import java.util.Random;

public class dice {
	public static void main(String[] args){
		Random dice = new Random(); //empty parameters
		int number; //temp variable stores number out puts on dice
		
		for(int counter=1; counter<=10; counter++){
			number = 1+dice.nextInt(6); //how many options it has, 0 through 5; 1+ gets 1 through 6
			System.out.println(number +" ");
		}
	}
}