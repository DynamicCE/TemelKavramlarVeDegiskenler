import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
		// türkçe mat fen sosyal notları , ort 50 yuksekse sinif atlat
		Scanner input = new Scanner(System.in);
		int t, m, f, s;
		double sonuc;
		System.out.println("türkce gir");
		t = input.nextInt();
		System.out.println("mat gir");
		m = input.nextInt();
		System.out.println("f gir");
		f = input.nextInt();
		System.out.println("s gir");
		s = input.nextInt();
		sonuc = (t + m + f + s) / 4;
		if (sonuc < 50) {
			System.out.println("başaramadın\n ortalaman" + sonuc);
		} else {
			System.out.println("sınıfı başarıyla atladın\n ortalaman " + sonuc);
		}

	}

}
