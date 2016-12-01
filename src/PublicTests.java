import static org.junit.Assert.*;

import org.junit.Test;

public class PublicTests {

	@Test
	public void testEasyInsert() {
		Heap<Integer> h = new Heap<Integer>();
		
		h.insert(8);
		h.insert(5);
		h.insert(3);
		h.insert(7);
		
		assertTrue(h.data.get(0).equals(3));
		assertTrue(h.data.get(1).equals(7));
		assertTrue(h.data.get(2).equals(5));
		assertTrue(h.data.get(3).equals(8));
		
		
	}
	
	
	@Test
	public void testRemoveSmallest() {
		Heap<Integer> myHeap = new Heap<>();
		
		myHeap.insert(6); // 0i
		myHeap.insert(12); // 1i
		myHeap.removeSmallest();
		
		assertTrue(myHeap.data.get(0).equals(12));
		
	}

}
