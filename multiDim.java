//Multi dimensional array, making tables or coordinates
public class multiDim {
	public static void main(String[] args){
		int firstarray[][]={{6,7,8,5},{1,2,3,5}}; //the first array is 0,1; made multi dimensional array here putting array in an array
		int secondarray[][]={{30,20,10,40},{1},{2,3,4}};//call like this: 00,01,02,03,10,20,21,22
		
		System.out.println("this is the first array");
		display(firstarray); //already knows how many number of elements it has
		
		System.out.println("This is the second array");
		display(secondarray);
	}
	
	public static void display(int x[][]){ //this method prints out our array; we just named it x so we can use it
		for(int row=0;row<x.length;row++){ //first argument it takes is a row number second on the next line is a column number
			for(int column=0;column<x[row].length;column++){ //set it equal to zero have it go through the row and increment it by one
				System.out.print(x[row][column]+"\t");//output rows; prints it out with spaces in between
			}
			System.out.println(); //what this does is when you get at the end of the row prints a new row
		}
	}
}