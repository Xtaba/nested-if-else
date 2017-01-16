//Taking array elements and storing them as counters
//Rolling a dice thousands times and storing how many times one number pups up

import java.util.Random;

public class arrayIndex {
	public static void main(String[] args){
		Random rand = new Random(); //object name is rand
		int freq[] = new int[7]; //we have 7 because index starts from 0 and if we need 6 we must go to 7
		
		for(int roll=1; roll<1000; roll++){
			++freq[1+rand.nextInt(6)]; //[number 0 through 5] 1+shifts it 1 over in order for you to get 1 through 6 what ++freq does is add one each time it hits that number
		}
		System.out.println("face\tfrequency"); //header 
		
		for(int face=1; face<freq.length;face++){ //making a table and face start at 1 cause first number on dice is 1
			System.out.println(face+ "\t" +freq[face]); //put the value of each array index
		}
}
}