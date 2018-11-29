package automation;

public class ReverseNumber {

	public static void main(String[] args) {

		numReverse(12);
		numReverse(123);
		numReverse(1234567);
	}

	public static void numReverse(int a) {
		int num = a;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse of: " + a + "  is = " + reverse);
	}

}
