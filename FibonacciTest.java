import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void recursiveTest(){
		assertEquals(1, Fibonacci.recursiveFibonacci(1));
		assertEquals(1, Fibonacci.recursiveFibonacci(2));
		assertEquals(8, Fibonacci.recursiveFibonacci(6));
		assertEquals(34, Fibonacci.recursiveFibonacci(9));
		
	}
	
	@Test
	public void iterativeFibonacci(){
		assertEquals(1, Fibonacci.iterativeFibonacci(1));
		assertEquals(1, Fibonacci.iterativeFibonacci(2));
		assertEquals(5, Fibonacci.iterativeFibonacci(5));
		assertEquals(13, Fibonacci.iterativeFibonacci(7));
	}
}
