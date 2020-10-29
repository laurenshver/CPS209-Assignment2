/**
 * ElectricCar
 */

 /**@author Lauren Shver 500776374
 * 
*/
public class ElectricCar extends Car{

    //instance variables
    private int rechargeTime;
    private String batteryType;
    
    
    //constructor method
    /**
     * @param VIN, mfr, color, power, numwheels, model, safetyrating, maxrange, AWD, price, recharge time
     */
    public ElectricCar(int VIN,String mfr, String color, int power, int numWheels, String model, double safetyRating, int maxRange, String AWD, double price, int rechargeTime){
        super(VIN, mfr, color, power, numWheels, model, safetyRating, maxRange, AWD, price);
        this.rechargeTime= rechargeTime;
    }
    /** setters
     */
    public void setRechargeTime(int rechargeTime){
        this.rechargeTime= rechargeTime;
    }

    public void setBatteryType( String batteryType){
        this.batteryType = batteryType;
    }
    /**
     * @return recharge time
     */
    public int getRechargeTime(){
        return rechargeTime;
    }

    /**
     * @return battery type
     */
    public String getBatteryTime(){
        return batteryType;
    }
    /**
     * @return toString of Car plus battery type and recharge time
     */
    public String display(){
        return super.display() + " EL, BAT: " + batteryType + " RCH: " + rechargeTime;
    }
}