package OOP;

// inheritance== extends ile başka bir classtan özellik almak
public class Car extends Vehicle {
	@Override
	public void start() { // bu işlem overriding, vehicle'da,
		// olan bir methodu superclassta şekillendirebilirim
		System.out.println("Araba çalışıyor");
	}

}
