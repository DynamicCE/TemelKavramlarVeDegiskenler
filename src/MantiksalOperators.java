
public class MantiksalOperators {

	public static void main(String[] args) {
		/* ve : kosul1 && kosul2
		 * veya kosul1 || kosul2
		 * değil !(kosul1 && kosul2)
		 */
int a = 10 ;
int b = 20 ;
int c = 5 ;
int d = 50 ;

boolean kosul1 = a<b  ;
boolean kosul2 = d>c ;
boolean sonuc = (kosul1 && kosul2);
System.out.println(sonuc);
System.out.println(sonuc );
boolean sonuc3 = (kosul1|| sonuc  );
	}

}
