import java.util.Scanner;

public class UcakBiletiFiyat {

	public static void main(String[] args) {
		/*
		 * Km birim fiyatı 10 cent 12 yaşından kücükse %50 indirim 12 24 arasıysa %10
		 * indirim 65 büyüksa %30 indirim gidiş dönüş alırsa %20 indirim bunlara göre
		 * ucak bileti fiyatı hesaplat
		 */
		Scanner input = new Scanner(System.in);
		int yas, yol, secenek;
		double tutar;
		System.out.println("yaşınızı giriniz");
		yas = input.nextInt();
		System.out.println("mesafeyi giriniz");
		yol = input.nextInt();
		System.out.println("Yolculuk tipini seçiniz\n1 = Tek gidiş\n" + "2 = Gidiş + Geliş");
		secenek = input.nextInt();
		tutar = yol * 10;
		if (yol > 0 && yas > 0 && (secenek == 1 || secenek == 2)) {
			// değerleri en başta bir if bloğu ile kontrol ettirdik
			if (yas < 12) {
				tutar = tutar * 5 / 10;
			} else if (12 <= yas && yas < 65) {
				tutar = tutar * 9 / 10;
			} else if (65 < yas) {
				tutar = tutar * 7 / 10;
			}
			if (secenek == 1) {
				tutar = tutar * 8 / 10;
			}
			System.out.println("tutar: " + tutar / 10 + " dolar");
		} else {
			System.out.println("değerleri eksik veya yanlış girdiniz.");
		}
	}

}
