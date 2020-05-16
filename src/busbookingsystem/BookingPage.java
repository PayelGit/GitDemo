package busbookingsystem;

import java.util.Scanner;

public class BookingPage extends Welcome 
{

	Scanner scan = new Scanner(System.in);
	
	
	public BookingPage(String from, String to , int no_of_seats_rqd , String date)
	{
		System.out.println("Welcome to bus service FROM : " + from + "to : " + to + "in SEAT-NO : " + no_of_seats_rqd + "On : " + date);
	}
	
	
}
