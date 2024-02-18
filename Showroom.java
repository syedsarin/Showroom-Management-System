package car_showroom_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Showroom implements Utility {
	String showroom_Name;
	private String showroom_Address;
	private String manager_Name;
	private int total_Employees;
	int total_Cars_In_Stock;

	

	
	public String getShowroom_Address() {
		return showroom_Address;
	}
	public String getManager_Name() {
		return manager_Name;
	}

	public int getTotal_Employees() {
		return total_Employees;
	}

	
	
	@Override
	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("====================*** ENTER SHOWROOM DETAILS ***====================");
		System.out.println();
		System.out.print("Enter Showroom Name    :");
		showroom_Name = sc.nextLine();
		System.out.print("Enter Showroom Address :");
		showroom_Address = sc.nextLine();
		System.out.print("Enter Manager Name     :");
		manager_Name = sc.nextLine();
		System.out.print("Enter Toltal Employees :");
		total_Employees = sc.nextInt();
		System.out.print("Enter Total Number Of Cars :");
		total_Cars_In_Stock = sc.nextInt();
		
	}catch (InputMismatchException e) {
		System.err.println("Please Provide Valid Input");
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void getDetails() {
		System.out.println("Showroom Name :"+showroom_Name);
		System.out.println("Showroom Address :"+showroom_Address);
		System.out.println("Manager Name :"+manager_Name);
		System.out.println("Total Employees :"+total_Employees);
		System.out.println("Total Cars: "+total_Cars_In_Stock);
		

	}

}
