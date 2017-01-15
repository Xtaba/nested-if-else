//for loop to calculate investment/ mortgage program compound intrest

public class compountIntrest {
	public static void main(String[] args){
		double amount;//A = P(1+R)^n A is amount P is principle R is rate n  is number of years
		double principal = 10000;
		double rate = 0.1;
		
		for(int day=1;day <= 20; day++){ //start on day 1 go to 20
			amount = principal*Math.pow(1+rate, day);
			System.out.println(day + "  "+ amount);
		}
		
	
	}
}