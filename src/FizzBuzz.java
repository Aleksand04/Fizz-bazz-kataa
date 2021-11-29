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
		else if (value % 3 == 0 || value % 5 == 0) {
			if (value % 3 == 0 && value % 5 == 0) {
				return "Fizzbuzz";
			} else if (value % 3 == 0) {
				return "Fizz";
			
			} else {
				return "Buzz";
			}
		} else {
			return Integer.toString(value);
		}
		return "";

}