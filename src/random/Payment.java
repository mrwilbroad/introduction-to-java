package random;


import java.util.ArrayList;

/**
 * 16 Introduction to Collections and Class ArrayList
 * The Java API provides several predefined data structures, called collections, used to store
 */


public class Payment
{
    private String[] payment = {"Tigo" , "Halotel"};



    public String[] getPayment (){
        return this.payment;
    }

    /**
     * package java.util
     */
    public  void addPayment(String payment){
        ArrayList<String> list = new ArrayList<>();
        list.add("Halotel");
        list.add("Tigo");
        list.add("Visa");
        list.add("MasterCard");
        list.add("Vodacome");

    }

    public String toTime(int hr , int min , int sec){
        if(hr < 0 || hr > 24) hr=0;
        if(min < 0 || min > 60) min=0;
        if(sec < 0 || sec > 60) sec=0;
        return String.format("%02d:%02d:%02d",hr,min,sec);
    }



    @Override
    public String toString() {
        return "Payment Gateway";
    }




}
