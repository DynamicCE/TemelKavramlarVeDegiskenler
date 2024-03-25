package OOP2;

public class Classes {

	public static void main(String[] args) {
		// SınıfAdı objeAdı = new SınıfAdı () ;
		HesapMakinesi makine1 = new HesapMakinesi();
		makine1.sayi1 = 10;
		makine1.sayi2 = 20;
		System.out.println(makine1.sayi1);
		HesapMakinesi makine2 = new HesapMakinesi();
		makine2.sayi1 = 20;
		System.out.println(makine2.sayi1);
	}

}
