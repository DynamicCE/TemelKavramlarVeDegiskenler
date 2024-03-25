import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * switch(ifade) { case değer : //kodlar break; //opsiyonel case değer2 :
		 * //kodlar break; //opsiyonel default://opsiyonel //kodlar }
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("1le üç arasında bi sayı gir");
		int sayi = input.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("sayi 1 dir");
			break;
		case 2:
			System.out.println("sayı 2 dir");
			break;
		case 3:
			System.out.println("sayı 3 dür");
			break;
		default:
			System.out.println("geçersiz bi sayı girdin");

		}

	}

}
