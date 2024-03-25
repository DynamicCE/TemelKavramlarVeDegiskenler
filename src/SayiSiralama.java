import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("sirasi ile a b c sayılarını giriniz");
		int enkucuk;
		if (a < b && a < c) {
			enkucuk = a;
		} else if (b < c && b < a) {
			enkucuk = b;
		} else if (c < b && c < a) {
			enkucuk = c;
		}

	}

}
