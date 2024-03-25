import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double yaricap, alan, cevre, pi = 3.14;
		System.out.println("dairenin yarı çapını giriniz");
		yaricap = input.nextDouble();
	    alan = pi * yaricap*yaricap;
	    cevre = 2*pi*yaricap;
	    System.out.println("alan: "+ alan +" cevre: "+cevre );
	    

	}

}
