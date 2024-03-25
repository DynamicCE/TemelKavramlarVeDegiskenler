import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String k_adi, parola;
		System.out.println("kullanici adini giriniz:  ");
		k_adi = input.nextLine();
		System.out.println("parola giriniz");
		parola = input.nextLine();
		if (k_adi.equals("java") && parola.equals("123")) {
			System.out.println("giriş başarılı");

		} else {
			System.out.println("giriş başarısız");
		}

	}

}
