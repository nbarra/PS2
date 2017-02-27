import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pgkEmpty.MyInteger;
public class TestPS2 {
	
	public static MyInteger value1;
	public static MyInteger value2;
	public static MyInteger value3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		value1 = new MyInteger(5);
		value2 = new MyInteger(3);
		value3 = new MyInteger(8); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
//THis is testing if it is even/odd/prime
	@Test
	public void isNotEvenTest(){
		assertFalse("5 is no an even number", value1.isEven(5));
	}
	
	@Test
	public void isEvenTest(){
		assertTrue("8 is an even number", value3.isEven(8));
	}
	
	@Test
	public void isOddTest(){
		assertTrue("5 is an odd number",value1.isOdd(5));
	}
	
	@Test
	public void isNotOddTest(){
		assertFalse("8 is not an odd number",value3.isOdd(8));
	}
	
	@Test
	public void isPrimeTest(){
		assertTrue("3 is a prime number",value2.isPrime(3));
	}

	@Test
	public void isNotPrimeTest(){
		assertFalse("8 is not a prime number",value3.isPrime(8));
	}
	
//This is testing for int even/odd/prime
	@Test
	public void isEven(){
		assertTrue("This is an even number",value3.isEven(8));
	}
	
	@Test
	public void isNotEven(){
		assertFalse("This is not an even number",value1.isEven(5));
	}
	
	@Test
	public void isOdd(){
		assertTrue("This is an odd number",value2.isOdd(3));
	}
	
	@Test
	public void isNotOdd(){
		assertFalse("This is not an odd number",value3.isOdd(8));
	}
	
	@Test
	public void isPrime(){
		assertTrue("This is a prime number",value2.isPrime(3));
	}
	
	@Test
	public void isNotPrime(){
		assertFalse("This is not a prime number",value3.isPrime(8));
	}
	
//Testing for MyInteger even/odd/prime
	
	@Test
	public void isEvenMyInteger(){
		assertTrue("This is an even number",value3.isEven(8));
	}
	
	@Test
	public void isNotEvenMyInteger(){
		assertFalse("This is not an even number",value1.isEven(5));
	}
	
	@Test
	public void isOddMyInteger(){
		assertTrue("This is an odd number",value2.isOdd(3));
	}
	
	@Test
	public void isNotOddMyInteger(){
		assertFalse("This is not an odd number",value3.isOdd(8));
	}
	
	@Test
	public void isPrimeMyIntger(){
		assertTrue("This is a prime number",value2.isPrime(3));
	}
	
	@Test
	public void isNotPrimeMyInteger(){
		assertFalse("This is not a prime number",value3.isPrime(8));
	}
	
//Is Equals Int
	@Test
	public void isEqualsInt(){
		assertTrue("This number is equal to 5",value1.equals(5));
	}
	
	@Test
	public void isNotEqualsInt(){
		assertFalse("This number is not equal to 5",value2.equals(5));
	}
	
//Is equals my Integer
	@Test
	public void isEqualsMyInteger(){
		assertTrue("This number is equal to 3",value2.equals(3));
	}
	
	@Test
	public void isNotEqualsMyInteger(){
		assertFalse("This number is not equal to 3",value3.equals(3));
	}
}
