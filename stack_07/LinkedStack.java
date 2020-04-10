package stack_07;

class StackNode {
	
	int data;
	StackNode link;

}

class LinkedStack {
	private StackNode top;

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	public void push(int item) {
		// TODO Auto-generated method stub
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;		
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
		
	}
}
