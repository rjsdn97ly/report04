package stack_03;


	
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode {
	
	char data;
	StackNode link;

}

class LinkedStack implements Stack{
	private StackNode top;

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	public void push(char item) {
		// TODO Auto-generated method stub
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : " + item);
		
	}

	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else {
			top = top.link;
		}
		
	}

	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			return top.data;
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Linked Stack is empty!! %n %n");
		}
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
