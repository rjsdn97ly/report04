package queue_04;

public class LinkedQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char deleteItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deleteItem = LQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deleteItem = LQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		LQ.printQueue();
		
		deleteItem = LQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		LQ.printQueue();
		
		deleteItem = LQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		LQ.printQueue();

	}

}
