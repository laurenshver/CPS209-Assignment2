import java.util.Comparator;

/**@author Lauren Shver 500776374
 * 
*/

public class Car extends Vehicle implements Comparable<Car>{

    //instance variables
    private String model;
    public int maxRange;
    public double safetyRating;
    private String AWD;
    private double price;

    /**
     * @param VIN ,mfr, color, power, numwheels, model, safetyrating, axrange, AWD, price
     */
    public Car(int VIN,String mfr, String color, int power, int numWheels, String model, double safetyRating, int maxRange, String AWD, double price){
        super(VIN,mfr, color, power, numWheels);
        this.model=model;
        this.safetyRating= safetyRating;
        this.maxRange= maxRange;
        this.AWD= AWD;
        this.price= price;
    }
/** 
 * setters
 */ 
    public void setModel(String model){
        this.model= model;
    }

    public void setMaxRange(int maxRange){
        this.maxRange= maxRange;
    }

    public void setSafetyRating(double safetyRating){
        this.safetyRating= safetyRating;
    }

    public void setAWD (String AWD){
        this.AWD= AWD;
    }

    public void setPrice( double price){
        this.price= price;
    }
    /**
     * @return model string
     */
    public String getModel(){
        return model;
    }
    /**
     * @return maxrange int
     */
    public int getMaxRange(){
        return maxRange;
    }

    /**
     * @return double safetyrating
     */
    public double getSafetyRating(){
        return safetyRating;
    }
    /**
     * @return AWD String
     */
    public String getAWD(){
        return AWD;
    }

    /**
     * @return double price
     */
    public double getPrice(){
        return price;
    }

    /** 
     * @return vehicle display plus model, price, safetyrating, maxrange
    */
    public String display(){
        return super.display() + " " + model + " "+ price+ " SF: " +safetyRating+ " RNG: " +maxRange;
    }
    /**
     * @return true if model, AWD, (power, numwheels and MFR (from super [vehicle])) are equal
     */
    public boolean equals(Object other){
        Car c1Car = (Car) other;
        if (super.equals(c1Car) && this.model.equals(c1Car.model) && this.AWD.equals(c1Car.AWD)) return true;
        return false;
    }

    /**
     * @return comparable method for price of car object
     * @param a car object
     */
    public int compareTo(Car other) {
        if (price >= other.price)
            return 1;
        if (price <= other.price)
            return -1;
        return 0;
    } 

}