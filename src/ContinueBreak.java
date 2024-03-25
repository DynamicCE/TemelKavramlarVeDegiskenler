import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		// break = döngüyü durdurur
		// continue = döngüyü durdurmaz ama
		// sonraki adıma gider
		Scanner input = new Scanner(System.in);
		/*
		 * int sayi; while (true) { System.out.println("Bir sayı giriniz"); sayi =
		 * input.nextInt(); if (sayi == 0) { System.out.println("döngü bitti"); break; }
		 * System.out.println(sayi); }
		 */
		for (int i = 1; i <= 10; i++) {

			if (i == 4 || i == 9) {
				System.out.println("atladı =" + i);
				continue; // eğer i 4 veya 9 ise atladı yazacak, aşağıdaki kodu
				// çalıştırmayıp tekrar başa dönecek
			}
			System.out.println("i = " + i);
		}

	}

}
