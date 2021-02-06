import java.util.Scanner;


public class GasMileage {
	
	public static void main(String[] args) {
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize variables
		double total = 0;
		
		int counter = 1;
		
		int miles = 0;
		
		//Read in the miles for trip #n
		System.out.print("Enter the miles driven for trip #" + counter + ": ");
		miles = input.nextInt();
		
		//start while loop if miles is valid
		while(miles != -1)
		{
			//Read in the gallons for trip #n
			System.out.print("Enter the gallons used for trip #" + counter + ": ");
			int gallons = input.nextInt();
			
			double mpg = (double) miles / gallons;
			
			System.out.printf("MPG for trip #%d: %.2f%n", counter, mpg);
			
			total += mpg;
			
			counter++;
			
			System.out.print("Enter the miles driven for trip #" + counter + ": ");
			miles = input.nextInt();
		}
		
		System.out.printf("Total mpg for all trips: %.2f", total);
		
	}

}
