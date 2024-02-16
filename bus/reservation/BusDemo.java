package bus.reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo{
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(3,true,30));
		int userOpt = 1;
		Scanner scan = new Scanner(System.in);
		for(Bus b :  buses) {
			b.displayBusInfo();
		}
		while(userOpt==1) {
			System.out.println("Enter 1 to book or 2 to exit : ");
			userOpt = scan.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry try another date or bus");
				}
			}
		}
	}
}