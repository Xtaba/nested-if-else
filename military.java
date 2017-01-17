//how to make time class

public class military {
	public static void main(String[] args){
		time timeObject = new time();
		System.out.println(timeObject.toMilitary());
		timeObject.setTime(13, 27, 6); //passed it from time.java in the setTime function
		System.out.println(timeObject.toMilitary());
		
	}
}