package u4;

public class Stack {
	
	private Object[] myArray;
	private int pointer;
	
	public Stack(int capacity) {
		myArray = new Object[capacity];
		pointer = -1;
	}
	
	public void push(Object element) {
		if(!isFull()) {
			myArray[++pointer] = element;
		}
		else {
			System.out.println("Stack is full...");
		}
	}
	
	public Object pop() {
		Object o = peek();
		pointer--;
		return o;
	}
	
	public Object peek() {
		if(!isEmpty()) {
			return myArray[pointer];
		}
		else {
			System.out.println("Stack is empty...");
			return null;
		}
	}
	
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		else {
			return pointer +1;
		}
	}
	
	public boolean isEmpty() {
		if (pointer == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (pointer +1 == myArray.length) {
			return true;
		}
		else {
			return false;
		}
	}

}
