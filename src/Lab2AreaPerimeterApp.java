import java.util.Scanner;

public class Lab2AreaPerimeterApp {

	public static void main(String[] args) {
		// Goal is to have the user enter the size of a rectangle.
		// I want to know what the length, width, height, area, perimeter, and volume is
		// I want the user to be able to enter this information for multiple rooms
		// I want to the user to be able answer "continue (yes/no)" and end room
		// information
		
		double length = 0;
		double width = 0;
		double height = 0 ;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		String answer;

		Scanner scnr = new Scanner(System.in);
		
		do {
		
		/*for (int a = 0; a <= 100; a++) {
			System.out.println("Continue Y/N:");
		}*/
		
		System.out.println("Enter Length:");
		length = scnr.nextDouble();
		
		
		System.out.println("Enter width:");
		width = scnr.nextDouble();
		
		System.out.println("Enter height:");
		height = scnr.nextDouble();
		
		
		area = 2*(length + width);
		volume = (length * width * height);
		//perimeter =
		//volume = 
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + 2 *(width + length));
		System.out.println("Volume " + length * width * volume);
		
		System.out.println("Continue? (Y/N)");
		answer = scnr.next();
		
	}while (answer.equalsIgnoreCase("Y"));
}
}
	

