import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Scanner;
import java.io.*;

/**@author Lauren Shver 500776374
 * 
*/


public class CarDealershipSimulator 
{

	public static boolean loop = true;


	public static void main(String[] args)
  {                            
		try{
		//~~~project starts here~~~~
	  // Create a CarDealership object
	  	  
		// Then create an (initially empty) array list of type Car
		ArrayList<Car> listOfCarsInCD = new ArrayList<>();
		//create AccountingSystem
		ArrayList <Transaction> listofTransactions = new ArrayList<>();
		AccountingSystem AccountingSystem = new AccountingSystem(listofTransactions);
		CarDealership CD= new CarDealership(listofTransactions);
		//VIN random number generator
		Random r= new Random();
		int high= 499;
		int low= 100;
		
		// Then create some new car objects of different types
		Car c = new Car(r.nextInt(high-low) +low,"Totyota", "blue", 1, 4 ,"SEDAN", 9.5, 500, "2WD", 25000.0);
		Car c1 = new Car(r.nextInt(high-low) +low,"Honda", "red", 1 , 4 ,"SPORTS", 9.2, 450, "2WD", 30300.0);
		Car c2 = new Car(r.nextInt(high-low) +low,"Kia", "white", 1 , 4 ,"MINIVAN", 9.7, 550, "2WD", 22000.0);
		Car c3 = new Car(r.nextInt(high-low) +low,"BMW", "black", 1 , 4 ,"SEDAN", 9.6, 600, "AWD", 55000.0);
		ElectricCar ec = new ElectricCar(r.nextInt(high-low) +low,"Tesla", "red", 0 , 4 ,"SEDAN", 9.1, 425, "AWD", 85000.0, 30);
		Car c4 = new Car(r.nextInt(high-low) +low,"Chevy", "red", 1, 4, "MINIVAN", 9.25, 475, "2WD", 40000.0);
		ElectricCar ec1 = new ElectricCar(r.nextInt(high-low) +low,"ChevyVolt", "green", 0, 4, "SEDAN", 8.9, 375, "AWD", 37000.0, 45);
		Car c5 = new Car(r.nextInt(high-low) +low,"Bentley", "black", 1, 4, "SEDAN", 9.8, 575, "2WD", 150000.0);
		ElectricCar ec2= new ElectricCar(r.nextInt(high-low) +low,"NissanLeaf", "green", 0, 4, "SEDAN", 8.8, 325, "AWD", 32000.0, 55);
		Car c6 = new Car( r.nextInt(high-low) +low ,"Hyundai", "blue", 1, 4, "SEDAN", 9.8, 575, "2WD", 15400.0);
		Car c7 = new Car( r.nextInt(high-low) +low ,"Honda", "red", 1, 4, "SEDAN", 9.8, 670, "2WD", 15000);
		Car c8 = new Car(r.nextInt(high-low) +low, "Toyota", "blue", 1, 4, "MINIVAN", 9.4, 560, "2WD", 40000.0);
		Car c9 = new Car(r.nextInt(high-low) +low, "Mazda", "red", 1, 4, "SEDAN", 9.7, 540, "2WD", 35100.0);
		Car c10 = new Car(r.nextInt(high-low) +low, "BMW", "black", 1, 4, "SPORT", 9.8, 450, "AWD", 72000.0);
		ElectricCar ec3 = new ElectricCar(r.nextInt(high-low) +low, "Tesla", "blue", 0, 4, "SEDAN", 9.5, 435, "AWD", 80300.0, 30);
		ElectricCar ec4 = new ElectricCar(r.nextInt(high-low) +low, "Tesla", "red", 0, 4, "SPORTS", 9.3, 600, "AWD", 90400.0, 40);
		Car c11 = new Car(r.nextInt(high-low) +low, "Cadillac", "red", 1, 4, "SEDAN", 9.0, 500, "AWD", 120000.0);
		Car c12 = new Car(r.nextInt(high-low) +low, "Ford", "white", 1, 4, "TRUCK", 9.2, 600, "AWD", 74000.0);
		Car c13 = new Car(r.nextInt(high-low) +low, "Bentley", "green", 1, 4, "SUV", 9.3, 700, "AWD", 50500.0);
		Car c14 = new Car(r.nextInt(high-low) +low, "Jeep", "orange", 1, 4, "SUV", 9.1, 400, "AWD", 40700.0);
		Car c15 = new Car(r.nextInt(high-low) +low, "Mustang", "black", 1, 4, "SEDAN", 9.0, 500, "AWD", 60000.0);
		ElectricCar ec5 = new ElectricCar (r.nextInt(high-low) +low, "Toyota", "red", 0, 4, "MINIVAN", 8.5, 500, "2WD", 64000.0, 50);
		ElectricCar ec6 = new ElectricCar(r.nextInt(high-low) +low, "Mazda", "green", 0, 4, "SEDAN", 8.9, 450, "AWD", 45000.0, 35);

	  // See the cars file for car object details
		// Add the car objects to the array list
		listOfCarsInCD.add(c);
		listOfCarsInCD.add(c1);
		listOfCarsInCD.add(c2);
		listOfCarsInCD.add(c3);
		listOfCarsInCD.add(ec);
		listOfCarsInCD.add(c4);
		listOfCarsInCD.add(ec1);
		listOfCarsInCD.add(c5);
		listOfCarsInCD.add(ec2);
		listOfCarsInCD.add(c6);
		listOfCarsInCD.add(c7);
		listOfCarsInCD.add(c8);
		listOfCarsInCD.add(c9);
		listOfCarsInCD.add(c10);
		listOfCarsInCD.add(c11);
		listOfCarsInCD.add(c12);
		listOfCarsInCD.add(ec3);
		listOfCarsInCD.add(ec4);
		listOfCarsInCD.add(ec5);
		listOfCarsInCD.add(ec6);
		listOfCarsInCD.add(c13);
		listOfCarsInCD.add(c14);
		listOfCarsInCD.add(c15);
			  
	  System.out.println("Begin Input");

	  // Create a scanner object
		Scanner sc= new Scanner(System.in);
		while(loop == true){
			String input = sc.nextLine();
			String [] split = new String [3];
			String [] salesSplit = new String [3];
			if(input.contains("BUY")){
				split = input.split("\\s+");
				input = "BUY";
			}
			if(input.contains("SALES ")){
				salesSplit = input.split("\\s+");
				input = "SALES ";
			}
			//String constraint= "Q";

			switch (input){
				case "ADD": //calls the add cars method of CarDealership
					CD.addCars(listOfCarsInCD);
				break;

				case "L": //calls the displayinventory method of CarDealdership
					CD.displayInventory();
				break;

				case "SSR": //sorts the list by  ascending safety rating
					Collections.sort(listOfCarsInCD, new SafetyRatingComparator());
				break;

				case "SPR": //sorts the list by  acending price
					Collections.sort(listOfCarsInCD);
				break;

				case "SMR": //sorts the list by ascending max range
					Collections.sort(listOfCarsInCD, new MaxRangeComparator());
				break;

				case "Q": //close the program
					sc.close();
					System.exit(0);
				break;
					
				case "BUY": //buy the car at the index
					CD.buyCar(split[1]);
				break;

				case "RET":
					CD.returnCar();
				break;

				case "SALES":
					AccountingSystem.displaySales();
				break;

				case "SALES ":
					AccountingSystem.displaySpecialSales(salesSplit[1]);
				break;

				default: //invalid entry inputted
					System.out.println("Invalid Entry, Please Try Again");
			}
		}


	}

	catch (NumberFormatException e){
		System.out.println("Invalid Entry, Please Try Again NFE");
		loop = true;
	}
	catch (IndexOutOfBoundsException ee){
		System.out.println("Invalid Entry, Please Try Again IOB");
		loop = true;
	}
	catch (NullPointerException e){
		System.out.println("Invalid Entry, Please Try Again NPE");
	}

	}
}
