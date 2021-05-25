package queue;

public class QueueOperations {
	public static void main(String[] args) {	
		Queue queue = new Queue(10);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.print();
		queue.remove();
		queue.print();
	}
}
