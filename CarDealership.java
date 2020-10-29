import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.text.DateFormatter;

/**@author Lauren Shver 500776374
 * 
*/

/**
 * CarDealership
 */
public class CarDealership{ 

    private ArrayList<Car> carInventory; 
    private ArrayList<Car> purchasedCars = new ArrayList<>();
    public Car car;
    public ArrayList<Transaction> salesTransactions;
    //public AccountingSystem aSystem = new AccountingSystem();
    public Transaction transaction;

    /**
     * creates a blank arraylist of cars
     */
    public CarDealership(ArrayList<Transaction> transactions){
        salesTransactions = transactions;
        carInventory= new ArrayList<Car>();
    }
    /**
     * adds all the cars in the list to the blank array
     */
    public void addCars(ArrayList<Car> newCars){
       carInventory= newCars; 
    }

    /**
     * buys the car which is in the indexed position of the arraylist and removes it from the arraylist
     */
    public String buyCar(String VINasString) throws NumberFormatException, NullPointerException{
        int VINasInt = Integer.parseInt(VINasString);
        Car carToBuy = findCarByVIN(VINasInt, carInventory);
        carInventory.remove(carToBuy);
        if(carToBuy != null)
        purchasedCars.add(carToBuy);
        Transaction transaction = new Transaction(carToBuy);
        salesTransactions.add(transaction);
        System.out.print(transaction.display());
        return "";
    }

    /**
     * 
     * @param carID
     * @param cars
     * @return the car that was inputted
     */
    public Car findCarByVIN(int carID, ArrayList<Car> cars){
        for(int i=0; i< cars.size(); i++){
            Car currentCar = cars.get(i);
            if(currentCar.getVIN() == carID){
                return currentCar;
            }
        }
        return null;
    }
/**
 * returns the last car that was bought to the inventory
 * removes the last car bought from sales
 */
    public void returnCar() throws IndexOutOfBoundsException{
        int lastIndex = purchasedCars.size()-1;
        int lastTransaction = salesTransactions.size()-1;
        carInventory.add(purchasedCars.get(lastIndex));
        System.out.print(salesTransactions.get(lastTransaction).display());
        salesTransactions.remove(lastTransaction);
        purchasedCars.remove(lastIndex);
    }
/**
 * displays the arraylist of cars in inventory
 */
    public void displayInventory(){
        for(int i =0; i<=carInventory.size() -1; i++){
           System.out.println(carInventory.get(i).display());
        }
        
    }
 }



