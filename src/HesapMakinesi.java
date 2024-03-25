import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1, sayi2;
		Scanner input = new Scanner(System.in);
		System.out.println("sayi1 i giriniz");
		sayi1 = input.nextInt();
		System.out.println("2. sayiyi giriniz");
		sayi2 = input.nextInt();
		int operator;
		System.out.println("sayilara yaptırmak istediğiniz işlemi giriniz");
		System.out.println("toplama 1 \n" + "çıkartma 2 \n" + "çarpma 3 \n" + "bölme 4");
		operator = input.nextInt();
		if (operator == 1) {
			System.out.println("toplam: " + (sayi1 + sayi2));
		} else if (operator == 2) {
			System.out.println(sayi1 - sayi2);
		} else if (operator == 3) {
			System.out.println(sayi1 * sayi2);
		} else if (operator == 4) {
			System.out.println(sayi1 / sayi2);
		} else {
			System.out.println("lütfen geçerli bir operator giriniz");
		}

	}

}
