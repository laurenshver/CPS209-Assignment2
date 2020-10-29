import java.util.Random;

/**
 * Vehicle
 */

 /**@author Lauren Shver 500776374
 * 
*/
class Vehicle {

    //instance variables
    //vehicle has 6 fields
    public int ELECTRIC_MOTOR= 0;
    public int GAS_ENGINE =1;
    public String mfr;
    public String color;
    public int power;
    public int numWheels;
    public int VIN;
    Random r= new Random();
    int low= 100;
    int high= 499;

    //vehicle default constructor
    public Vehicle(){
        numWheels=4;
        VIN= r.nextInt(high-low) +low;
    }
    // vehicle constructor
    public Vehicle(int VIN,String mfr, String color, int power, int numWheels){
        this.VIN= VIN;
        this.mfr= mfr;
        this.color= color;
        this.power= power;
        this.numWheels= numWheels;
    }
    //vehicle has 10 methods
    //setters

    public void setVIN(){
        this.VIN= r.nextInt(100);
    }

    public void setMFR(String mfr){
        this.mfr= mfr;
    }

    public void setColor(String color){
        this.color= color;
    }

    public void setPower(int power){
        this.power= power;
    }

    public void setNumWheels(int numWheels){
        this.numWheels= numWheels;
    }

    /**
     * @return Manufacturer
     */
    public String getMFR(){
        return mfr;
    }
    /**
     * @return color
     */
    public String getColor(){
        return color;
    }
/**
 * @return power value
 */
    public int getPower(){
        return power;
    }
/**
 * @return number of wheels
 */
    public int getNumWheels(){
        return numWheels;
    }

    public int getVIN(){
        return VIN;
    }

// display method
/**
 * @return string with VIN, manufacturer name and color of vehicle
 */
    public String display(){
        return "VIN: " +VIN + " " +mfr + " " + color;
    }
// equals method
/**
 * @return true if power, number of wheels and MFR are the same
 */
    public boolean equals(Object other){
        Vehicle vehicle= (Car) other;
        if (this.getPower() == vehicle.getPower() && this.getNumWheels() == vehicle.getNumWheels() && this.getMFR().equals(vehicle.getMFR())) return true;
        return false;
    }
}



