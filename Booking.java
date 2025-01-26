package Bus_reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    public String passengerName;
    public int BusNo;
    public Date date;
    public Booking(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Name of Passenger: ");
        passengerName=s.next();
        System.out.print("Enter The Bus Number: ");
        BusNo=s.nextInt();
        System.out.print("Enter the Date(DD-MM-YYYY): ");
        String st=s.next();
        SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
        try{
        date=simple.parse(st);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> book,ArrayList<Bus> bus){
        int capacity=0;
        for(Bus b:bus){
            if(b.getBusNo()==BusNo){
                capacity=b.getCapacity();
            }
        }
        int booked=0;          // booking count
        for(Booking bo:book){
            if(bo.BusNo==BusNo && bo.date.equals(date)){
                booked++;      // how many people already booked
            }
        }
        return booked<capacity;
    }
}
