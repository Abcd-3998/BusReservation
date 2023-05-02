import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Booking> booking=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		while(userOpt==1){
			
			
		
		System.out.println("Enter 1 to Booking and 2 to Exit");
		userOpt=scanner.nextInt();
		if(userOpt==1)
		{
			Booking bookings=new Booking();
			if(bookings.isAvailable(booking,buses))
			{
				booking.add(bookings);
				System.out.println("Your Booking is confirmed");
			}
			//System.out.println("bOOKING.......");
			else
			{
				System.out.println("Sorry,Bus is full,Try another Bus or Date");
				
			}
			
		}
		else
		{
			System.out.println("EXIT....");
		}
		
		}
		
	}

}
