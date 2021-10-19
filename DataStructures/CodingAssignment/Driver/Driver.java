package DataStructures.CodingAssignment.Driver;

import java.util.Scanner;
import DataStructures.CodingAssignment.Services.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of floors");
		int no_of_floors = sc.nextInt();
		
		//
		// ******INSERTION******
		//
		/* Start with the empty list. */
        LinkedList list = new LinkedList();
		
		for(int i=0; i<no_of_floors; i++) {
			int day = i+1;
			System.out.println("Enter the floor size given on day : "+ day);
			int floor_size = sc.nextInt();
	        // Insert the values
	        list = list.insert(list, floor_size);
		}
		
		sc.close();
		
		// Print the LinkedList
		list.printOrder(list);
	}
}
