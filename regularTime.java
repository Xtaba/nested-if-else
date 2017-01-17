//how to make time class

public class regularTime {
	public static void main(String[] args){
		time timeObject = new time();
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		timeObject.setTime(13, 27, 6); //passed it from time.java in the setTime function
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
				
	}
}