package car_showroom_management_system;

import java.util.Scanner;

public class Main { 
	public static void main_menu() {
		System.out.println();
		System.out.println("===========================================*** WELCOME TO SHOWROOM MANAGEMENT SYSTEM ***============================================");
		System.out.println();
		System.out.println("=====================================================*** ENTER YOUR CHOICE ***======================================================");
		System.out.println("1].ADD SHOWROOM \t\t\t 2]. ADD EMPLOYEES \t\t\t 3].ADD CARS");
		System.out.println();
		System.out.println("4].GET SHOWROOM \t\t\t 5]. GET EMPLOYEES \t\t\t 6].GET CARS");
		System.out.println();
		System.out.println("=======================================================*** ENTER 0 TO EXIT ***========================================================");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Showroom showroom[] = new Showroom[5];
		Employee employee[] = new Employee[5];
		Cars car[] = new Cars[5];
		int carCounter = 0;
		int showroomCounter = 0;
		int employeeCounter = 0;
		int choice = 100;
		while (choice!=0) {
			main_menu();
			System.out.print("Enter Option :");
			choice = sc.nextInt();

			while (choice != 9 && choice != 0) {
				switch (choice) {
				case 1:
					showroom[showroomCounter] = new Showroom();
					showroom[showroomCounter].setDetails();
					showroomCounter++;
					System.out.println();
					System.out.println("1].ADD NEW SHOWROOM");
					System.out.println("9].GO BACK TO MAIN MENU");
					choice = sc.nextInt();
				
	
					break;
				
				case 2:
					employee[employeeCounter] = new Employee();
					employee[employeeCounter].setDetails();
					employeeCounter++;
					System.out.println();
					System.out.println("2].ADD NEW EMPLOYEE");
					System.out.println("9].GO BACK TO MAIN MENU");
					choice = sc.nextInt();
					break;
				
				case 3:
					car[carCounter] = new Cars();
					car[carCounter].setDetails();
					carCounter++;
					System.out.println();
					System.out.println("3].ADD NEW CAR");
					System.out.println("9].GO BACK TO MAIN MENU");
					choice = sc.nextInt();
					break;
				
				case 4:
					for(int i=0; i<showroomCounter; i++)
					{
						showroom[i].getDetails();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].GO BACK MAIN MENU ");
					System.out.println("0].EXIT");
					System.out.println();
					choice = sc.nextInt();
					break;
				
				case 5:
					for(int i=0; i<employeeCounter; i++)
					{
						employee[i].getDetails();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].GO BACK MAIN MENU ");
					System.out.println("0].EXIT");
					System.out.println();
					choice = sc.nextInt();
					break;
					
				case 6:
					for(int i=0; i<carCounter;i++)
					{
						car[i].getDetails();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].GO BACK MAIN MENU ");
					System.out.println("0].EXIT");
					System.out.println();
					choice = sc.nextInt();
					break;
					
					default:
						System.out.println("ENTER VALID CHOICE: ");
						break;
				}
			}
		}

	}

}
