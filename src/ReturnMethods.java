
public class ReturnMethods {

	public static void main(String[] args) {
		int finalValue = power(3, 3);
		System.out.println(finalValue);

	}

	static int power(int number1, int number2) {
		int result = 1;
		for (int i = 0; i < number2; i++) {
			result *= number1;
		}
// void olsaydı sout yapardık
		return result;
	}
}
