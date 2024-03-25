1
public class Methods {

	public static void main(String[] args) {

		int sayi1 = 13, sayi2 = 15;

		System.out.println(toplama(sayi1, sayi2));
		System.out.println(merhaba("Erkan"));
		System.out.println(yılBul(21));
		bye();
		System.out.println(yılBul(21));
	}

	public static int toplama(int a, int b) {
		int cevap;
		cevap = a + b;
		return cevap;

	}

	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}

	public static String yılBul(int yaş) {
		int yıl = 2021 - yaş;
		return yıl + " yılında doğdunuz.";
	}

	public static void bye() {
		System.out.println("görüşürüz");
	}
}
