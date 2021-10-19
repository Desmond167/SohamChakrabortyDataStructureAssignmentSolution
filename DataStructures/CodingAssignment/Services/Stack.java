package DataStructures.CodingAssignment.Services;

///////////////// Class implementing Stack DS /////////////////
public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    //__________ Method to check whether Stack is empty or not __________//
    boolean isEmpty()
    {
        return (top < 0);
    }
    public Stack()
    {
        top = -1;
    }
    
 //__________ Method to push item in Stack __________//
    public boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
//            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
  //__________ Method to pop item from Stack __________//
    public int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    
    public void printStack(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ a[i]);
    }
  }
}
