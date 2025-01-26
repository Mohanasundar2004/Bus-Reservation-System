package Bus_reservation;
import java.util.*;
public class Bus {
    private int  BusNo;
    private boolean AC;
    private int Capacity;
    public Bus(int BusNo,boolean AC,int Capacity){
        this.BusNo=BusNo;
        this.AC=AC;
        this.Capacity=Capacity;
    }
    public void setBusNo(int BusNo){
        this.BusNo=BusNo;
    }
    public int getBusNo(){
        return BusNo;
    }
    public void setAc(Boolean AC){
        this.AC=AC;
    }
    public boolean getAC(){
        return AC;
    }
    public void setCapacity(int Capacity){
        this.Capacity=Capacity;
    }
    public int getCapacity(){
        return Capacity;
    }
    public void Display(){
        System.out.println("BusNo : "+BusNo+" AC : "+AC+" Capacity : "+Capacity);
    }
}
