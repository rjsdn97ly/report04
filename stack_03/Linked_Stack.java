package stack_03;


public class Linked_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char deleteItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deleteItem = LS.pop();
		if(deleteItem != 0) {
			System.out.println("delete Item : " + deleteItem);
		}
		LS.printStack();

	}

}

