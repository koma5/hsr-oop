package u4;

public class StackTest {

	public static void main(String[] args) {
		Stack myStack = new Stack(5);
		System.out.println("size: " + myStack.size());
		
		myStack.push(5);
		myStack.push("hello");
		myStack.push(6.7);
		
		System.out.println("size: " + myStack.size());
		
		myStack.push(42);
		myStack.push("oneMore");
		
		System.out.println("size: " + myStack.size());
		
		myStack.push("oneTooMany");
		
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		
		myStack.push(myStack);
		
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		
		System.out.println("-----");

		Stack myOtherStack = new Stack(2);
		myOtherStack.push("foo");
		
		System.out.println("peek: " + myOtherStack.peek());
		myOtherStack.push("bar");
		System.out.println("size: " + myOtherStack.size());
		System.out.println("pop: " + myOtherStack.pop());
		System.out.println("pop: " + myOtherStack.pop());

		System.out.println("-----");

		Stack s = new Stack(10);
		Stack k = new Stack(10);

		k.push(3);
		k.pop();

		System.out.println(s.size() + " " + k.size());
		
	}
}
