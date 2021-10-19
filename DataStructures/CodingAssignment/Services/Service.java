package DataStructures.CodingAssignment.Services;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class Service {
	
	LinkedList<Integer> list=new LinkedList<Integer>();
	int max_floor_size=0;
	
	public void addFloors(int no_of_floors) {
		Scanner sc = new Scanner(System.in);
		//
		// ******INSERTION******
		//
		for(int i=0; i<no_of_floors;i++) {
			int day=i+1;
			System.out.println("Enter Floor size for Day "+ day);
			int floor = sc.nextInt();
			if (max_floor_size<floor) {
				max_floor_size=floor;
			}
			list.add(floor);
		}
		sc.close();
	}
	public void printOrder() {
		int max=max_floor_size;
		//creating an instance of Stack class  
		Stack<Integer> stack= new Stack<>(); 
		for(int i=0; i<list.size();i++) {
			int day=i+1;
			System.out.println("For Day "+ day);
			if(list.get(i)!=max) {
				stack.push(list.get(i));
			}
			if(list.get(i)==max) {
				System.out.print(list.get(i));
				max--;
			}
			
//			System.out.println("-----"+stack.empty());
			if(stack.empty()==false) {
				if(stack.peek()==max) {
					try {
						while(stack.peek()==max) {
							System.out.println(stack.pop());
							max--;
						}
					}
					catch(Exception e) {
						continue;
					}
				}
			}
		}
		}
}
