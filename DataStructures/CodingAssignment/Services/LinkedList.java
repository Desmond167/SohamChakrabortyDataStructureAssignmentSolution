package DataStructures.CodingAssignment.Services;
   
// Java program to implement
// a Singly Linked List
public class LinkedList {
   
    Node head; // head of list
    int size=1;
    int max=0;
   
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
   
        int data;
        Node next;
   
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    // Method to insert a new node
    public LinkedList insert(LinkedList list, int data)
    {
    	if (max<data) {
    		max=data;
    	}
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
   
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
            ++size;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
                ++size;
            }
   
            // Insert the new_node at last node
            last.next = new_node;
        }
   
        // Return the list by head
	        return list;
	    }
 // Method to get the LinkedList Size.
    public int size(LinkedList list)
    {
        return size;
    }
 // Method to get the LinkedList Size.
    public int max(LinkedList list)
    {
        return max;
    }
 // Method to get the LinkedList.
    public void printOrder(LinkedList list)
    {
        Node currNode = list.head;
        Stack s = new Stack();
        int max = max(list);
        int day = 1;
        System.out.println("Day:"+ day);
    
        // Traverse through the LinkedList
        while (currNode != null) {
        	if(currNode.data != max) {
        		s.push(currNode.data);
        	}
        	else {
        		System.out.println(currNode.data);
        		int data = currNode.data;
        		if (data-s.peek()==1) {
        			data=s.pop();
        			System.out.println(data);
        		}
        		max--;
        	}
            
            // Go to next node
            currNode = currNode.next;
//            s.printStack();
        }
        day++;
    }
}
