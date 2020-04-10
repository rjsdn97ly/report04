package stack_01;

public class Array_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stackSize = 5;
		char deleteItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deleteItem = S.pop();
		if(deleteItem != 0) {
			System.out.println("delete Item : " + deleteItem);
		}
		S.printStack();

	}

}
