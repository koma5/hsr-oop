package u4;

public class StackTest {

	public static void main(String[] args) {
		Stack myStack = new Stack(5);
		System.out.println(myStack.size());
		
		myStack.push(5);
		myStack.push("hello");
		myStack.push(6.7);
		
		System.out.println(myStack.size());
		
		myStack.push(42);
		myStack.push("oneMore");
		
		System.out.println(myStack.size());
		
		myStack.push("oneTooMany");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		myStack.push(myStack);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		Stack myOtherStack = new Stack(2);
		myOtherStack.push("foo");
		
		System.out.println(myOtherStack.peek());
		myOtherStack.push("bar");
		System.out.println(myOtherStack.size());
		System.out.println(myOtherStack.pop());
		System.out.println(myOtherStack.pop());
		
	}
}
