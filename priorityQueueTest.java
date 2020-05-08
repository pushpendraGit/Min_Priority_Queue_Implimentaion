
public class priorityQueueTest {

	public static void main(String[] args) throws Priority_is_Empty {
		
		
		Priority_Queue<String> pq = new Priority_Queue<>();
		
		
		pq.insert("abc",15);
		
		pq.insert("def",13);
		
		pq.insert("ghi",90);
		
		pq.insert("fdf",150);
		pq.insert("rgg",120);
		
		System.out.println(pq.getmin());
		
		

	}

}
