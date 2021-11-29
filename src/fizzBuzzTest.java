import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class fizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sholdReturn100() {
		FizzBuzz fz = new FizzBuzz();
		assertEquals(100, fz.getNumbers().length);
	}
    @Test
    public void multipleOfThreeReturnFizz(){
		FizzBuzz fz = new FizzBuzz();
		
        assertEquals("Fizz", fz.fizzbuzzkata(3));
    }
    @Test
	public void sholdReturnBuzzFor5() {
		FizzBuzz fz = new FizzBuzz();
		assertEquals("Buzz", fz.fizzbuzzkata(5));
	}
    @Test
	public void sholdReturnFizzBuzzForFivteen() {
		FizzBuzz fz = new FizzBuzz();
		assertEquals("Fizzbuzz", fz.fizzbuzzkata(15));
	}

}