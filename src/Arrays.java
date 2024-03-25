
public class Arrays {

	public static void main(String[] args) {
		int x0, x1, x2, x3, x4;
		x0 = 0;
		x1 = 1;
		x2 = 2;
		x3 = 3;
		x4 = 4;
		int[] sayiDizisi = new int[10];
		sayiDizisi[0] = 3;
		sayiDizisi[1] = 4;
		sayiDizisi[8] = 9;
		sayiDizisi[9] = 6;
		int a = sayiDizisi[8];
		System.out.println(a);
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.println(sayiDizisi[i]);
		}
		// @@@@@@@@@@@@@@@@@
		String[] yaziDizisi = new String[5];
		yaziDizisi[0] = "Dilruba";
		yaziDizisi[1] = "erkan";
		yaziDizisi[2] = "Miroşima";
		for (int i = 0; i < yaziDizisi.length; i++) {
			System.out.println(yaziDizisi[i]);
		}
	}
}