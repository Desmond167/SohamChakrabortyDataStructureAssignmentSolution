package DataStructures.CodingAssignment.Driver;

import java.util.Scanner;

import DataStructures.CodingAssignment.Services.Service;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of floors");
		int no_of_floors = sc.nextInt();
		
		Service obj = new Service();
		obj.addFloors(no_of_floors);
		obj.printOrder();
		
		sc.close();
	}
}
