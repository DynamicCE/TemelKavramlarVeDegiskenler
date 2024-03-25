import java.util.Scanner;

public class WhileOrnekler {

	public static void main(String[] args) {
		/*
		 * // ornek1 1 den 100 e kadar sayıların çift olanlarını yazdır int i = 1; while
		 * (i <= 100) { if (i % 2 == 0) { System.out.println("i çift =" + i); } i++; }
		 */
		// Negatif girilene kadar girişleri kabul et, tekleri topla.
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("bir sayi giriniz"); int sayi = input.nextInt(); int
		 * toplam = 0; while (sayi >= 0) {
		 * 
		 * if (sayi % 2 == 1) { toplam += sayi; } System.out.println(toplam);
		 * System.out.println("sayi giriniz"); sayi = input.nextInt(); }
		 * System.out.println("negatif değer girdiniz.");
		 */
		// girilen sayıya kadar olan 2 nin üssünü ekrana yazdır
		Scanner input = new Scanner(System.in);
		System.out.println("bi sayi giriniz");
		int sayi = input.nextInt();
		int k = 1;
		while (k < sayi) {
			k *= 2;
			System.out.println("s" + k);
		}

	}
}
