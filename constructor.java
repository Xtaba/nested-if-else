//overloaded constructor, making multiple constructors

public class constructor {
	public static void main(String[] args){
		
		time timeObject = new time();
		time timeObject1 = new time(3);
		time timeObject2 = new time(3,12); //the object has two parameters goes to time.java finds the one with two constructor
		time timeObject3 = new time(1,22,40);
		
		System.out.printf("%s\n",timeObject.toMilitary());
		System.out.printf("%s\n",timeObject1.toMilitary());
		System.out.printf("%s\n",timeObject2.toMilitary());
		System.out.printf("%s\n",timeObject3.toMilitary());
		
	}
}