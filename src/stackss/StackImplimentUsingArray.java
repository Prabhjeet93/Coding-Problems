package stackss;

public class StackImplimentUsingArray {
	
	//push, pop, isEmpty, isFull, peek
	
	int size;
	int arr[];
	int top;
	
	StackImplimentUsingArray(int size){
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		
	}
	
	public void push(int a) {
		if(!isFull()) {
			top++;
			arr[top]=a;
			System.out.println("Pushed Element : "+a);
		}
		else
		{
			System.out.println("Stack is full");	
		}
	}
	
	public int pop() {
		
		if(!isEmpty()) {
			int popped=top;
			top--;
			System.out.println(" Popped element is : "+arr[popped]);
			return arr[popped];
		}
		else {
			System.out.println("There is no element inside Stack");
			return -1;
		}
			
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
		
  }
	
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1==top);
	}

	
	public static void main(String[] args) {
		
		StackImplimentUsingArray sa = new StackImplimentUsingArray(5);
		sa.peek();
		sa.push(2);
		sa.pop();
		sa.isEmpty();
		sa.isFull();
		
		sa.push(4);
		sa.push(3);
		sa.push(1);
		sa.push(9);
		sa.isEmpty();
		sa.isFull();
		sa.peek();
		sa.push(28);
		sa.push(4);
		sa.peek();
		
	}

}
