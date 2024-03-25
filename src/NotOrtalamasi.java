import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		int quiz , Sinav1 , Sinav2 ;
		double ortalama ;
		Scanner not = new Scanner(System.in);
		System.out.println("quiz notunu giriniz");
		quiz = not.nextInt();
		System.out.println("vize notunu giriniz");
		Sinav1=not.nextInt();
		System.out.println("final notunu giriniz");
		Sinav2 = not.nextInt();
		ortalama = ((quiz/5)+(Sinav1*0.4 + Sinav2*0.6));
		System.out.println("not ortalaması =" + ortalama) ;
			
		
		
		

	}

}
