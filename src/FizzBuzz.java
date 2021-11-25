import java.util.Arrays;

public class FizzBuzz {

	private int[] numbers;

	public int[] getNumbers() {
		numbers = new int[100];
		for(int i = 0; i< numbers.length; i++) {
			numbers[i]=i+1;
		}
		return numbers;
	}
    public String fizzbuzzkata(int value) {
		if (value % 3 == 0) {
			return "Fizz";
		} else {
			return Integer.toString(value);
		}

}