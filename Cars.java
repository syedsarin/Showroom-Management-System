package car_showroom_management_system;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
	String carName;
	String carColor;
	String carFuelType;
	double carPrice;
	String carType;
	String carTransmission;

	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================*** ENTER CAR DETAILS ***====================");
		System.out.print("Enter Car Name :");
		carName = sc.nextLine();
		System.out.print("Enter Car Color");
		carColor = sc.nextLine();
		System.out.print("Enter Car Fuel Type (Petrol/Diesel):");
		carFuelType = sc.nextLine();
		System.out.print("Enter Car Price :");
		carPrice = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Car Type (Sedan/Suv):");
		carType = sc.nextLine();
		System.out.print("Enter Car Transmission Type(Automatic/Manual) :");
		carTransmission = sc.nextLine();
		total_Cars_In_Stock++;
	}

	@Override
	public void getDetails() {
		System.out.println("====================*** CAR DETAILS ***====================");
		System.out.println("CAR NAME :"+carName);
		System.out.println("CAR COLOR :"+carColor);
		System.out.println("CAR FUEL TYPE :"+carFuelType);
		System.out.println("CAR PRICE :"+carPrice);
		System.out.println("CAR TYPE :"+carType);
		System.out.println("CAR TRANSMISSION :"+carTransmission);
	}
}
