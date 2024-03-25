
public class Methods2 {

	public static void main(String[] args) {
		f(2);
		System.out.println("ikinci metot");
		f(6);
		power(2, 3);
		power(3, 2);
	}

	/*
	 * public static int f(int x) { int result = (x + 2) * 6; return result;
	 */

	static void f(int x) {
		int result = (x + 2) * 6;
		System.out.println(result);
	}

	static void power(int number1, int number2) {
		int result = 1; // number 1 in üssü
		for (int i = 1; i <= number2; i++) {
			result *= number1;
		}
		System.out.println("Cevap : " + result);
	}
}
