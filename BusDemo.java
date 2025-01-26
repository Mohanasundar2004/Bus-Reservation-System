package Bus_reservation;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Bus> bus=new ArrayList<Bus>();
        ArrayList<Booking> book=new ArrayList<>();
        bus.add(new Bus(1,true,1));
        bus.add(new Bus(2,false,50));
        bus.add(new Bus(3, true, 40));
        int useroption=1;
        while(useroption==1){
            System.out.print("Enter 1 to Book and 2 to Exit : ");
            useroption=s.nextInt();
            if(useroption==1){
                Booking booking=new Booking();
                if(booking.isAvailable(book,bus)){
                    book.add(booking);
                    System.out.println("Your Booking is Confirmed");
                }
                else{
                    System.out.println("Sorry, Bus is Full.Try another bus or Date!");
                }
            }
        }
        if(useroption==2){
            System.out.println("Thank you!!!");
        }
    }
}
