package busbookingsystem;

import java.util.Scanner;

public class Welcome
{
	public void pressNum()
	{
		System.out.println("Press 1 : for registration process");
		System.out.println("Press 2 : for booking process");
		System.out.println("Press 3 : for cancellation process");
	}
	public static void main(String[] args)
	{
		Welcome wel = new Welcome();
		wel.pressNum();
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter number to proceed");
		int num = scan.nextInt();
		switch(num)
		{
		case 1 :
			System.out.println("Welcome to Busbooking system start registration");
			break;
		case 2 :
			System.out.println("Start Booking process ");
			break;
		case 3 :
			System.out.println("Start Cancellation process ");
			break;	
		default :
			System.err.print("Invalid entry..please try with valid number");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
