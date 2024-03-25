import java.util.Scanner;

public class kdvHesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fiyat , kdv; 
		Scanner input = new Scanner(System.in);
System.out.println("ürünün fiyatını giriniz");
fiyat = input.nextDouble();
kdv = fiyat * 0.18 ;
System.out.println("Ürünün kdvsi = " +kdv + "  ürünün son fiyatı = 20" + (fiyat + kdv));
	}

}
