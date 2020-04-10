package queue_06;

public class DQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char deleteItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertFront('C');
		DQ.printDQueue();
		
		deleteItem = DQ.deleteFront();
		if(deleteItem != 0)
			System.out.println("Front delete Item : " + deleteItem);
		DQ.printDQueue();
		
		deleteItem = DQ.deleteRear();
		if(deleteItem != 0)
			System.out.println("Front delete Item : " + deleteItem);
		DQ.printDQueue();
		
		DQ.insertFront('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();

	}

}
