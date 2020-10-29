import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.text.DateFormatter;

public class Transaction{

    public int transID;
    Random r= new Random();
    SimpleDateFormat sdf= new SimpleDateFormat("EEE, MMM dd, yyyy");
    Calendar calendar = new GregorianCalendar(2019,r.nextInt(12),r.nextInt(30));
    Date date;
    Car car;
    SalesTeam s = new SalesTeam();
    String seller;
    String c;
    String transDate;
    String carDetails;
    Double carPrice;
    int high= 200;
    int low= 100;

    //constructor method w no car
    public Transaction(){
    transID = r.nextInt(high-low) + low;
    seller = s.oneperson();
    transDate = sdf.format(calendar.getTime());
    }

    /**
     * creates a transaction with the inputted car
     * @param boughtCar
     */
    public Transaction(Car boughtCar){
        transID = r.nextInt(high-low) + low;
        seller = s.oneperson();
        transDate = sdf.format(calendar.getTime());
        carPrice = boughtCar.getPrice();
        carDetails = boughtCar.display();
    }

    //GETTERS

    public int getID(){
        return transID;
    }

    public String getSeller(){
        return seller;
    }

    public String getDate(){
        return transDate;
    }

    public int getMonth(){
        return calendar.get(Calendar.MONTH);
    }

    public String getCarDetails(){
        return carDetails;
    }

    public Double getCarPrice(){
        return carPrice;
    }

    /**
     * 
     * @return transaction string
     */
    public String display(){
        System.out.println("ID: " + transID + " " + transDate + " BUY SalesPerson: " + seller + " Car: " + carDetails);
        return "";
    }
}