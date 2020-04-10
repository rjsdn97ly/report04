package queue_02;

public class CircularQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queueSize = 4;
		char deleteItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deleteItem = cQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('D');
		cQ.printQueue();
		
		cQ.enQueue('E');
		cQ.printQueue();

	}

}
