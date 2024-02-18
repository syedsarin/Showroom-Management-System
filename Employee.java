package car_showroom_management_system;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility {

	private String employeeId;
	private String empName;
	private int empAge;
	private String empDepartment;

	@Override
	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		UUID uuid  = UUID .randomUUID();
		employeeId = String.valueOf(uuid);
	
		System.out.println("==============================*** ENTER EMPLOYEE DETAILS ***==============================");
		System.out.print("Enter Employee Name :");
		empName = sc.nextLine();
		System.out.print("Enter Employee Age :");
		empAge = sc.nextInt();
		System.out.print("Enter Employee Department :");
		empDepartment = sc.nextLine();
		empDepartment = sc.nextLine();
		System.out.print("Enter Showroom Name :");
		showroom_Name = sc.nextLine();

	}

	@Override
	public void getDetails() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Age :"+empAge);
		System.out.println("Employee Department :"+empDepartment);
		System.out.println("Showroom Name :"+showroom_Name);
		
	}

}
