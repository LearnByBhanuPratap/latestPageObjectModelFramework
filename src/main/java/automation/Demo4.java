package automation;

public class Demo4 {
	public static void main(String[] args) {
		factorial(6);

	}

	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is : " + fact);
	}

}
