//Average few numbers
import java.util.*;

public class Average {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //Allows you enter numbers,making a new object, we add System.in since it's our new keyboard
		int total = 0;
		int grade; //grade we enter, temp stores in grade
		int average;  //avg variable allows you to average them later
		int counter = 0; //our counter variable
		
		while (counter < 10){
			grade = input.nextInt();
			total = total + grade; //takes the grade and adds it to total whatever it was before
			counter++; //increament counter each time goes through a loop
		}
		average = total/10; //we know it's 10 since thats how many we have entered
		System.out.println("The average is "+ average); //Give you the average here
	
	}
}