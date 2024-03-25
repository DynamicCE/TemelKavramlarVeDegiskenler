package OOP3;

public class ObjectFactory {

	public static void main(String[] args) {
		// SınıfAdı objeAdı = new SınıfAdı () ;
		Car rlsroyce = new Car(); // objeyi oluşturduk. rlsroyce bellekte bu objenin yerini tutar
		rlsroyce.color = "silver";
		rlsroyce.model = 1984; // objenin fieldlerini tanımladık
		rlsroyce.engine = 1.4;
		rlsroyce.doors = 2;

		System.out.println(rlsroyce.model);
		System.out.println(rlsroyce.model);
		System.out.println(rlsroyce.model);
		System.out.println(rlsroyce.model);
	}

}
