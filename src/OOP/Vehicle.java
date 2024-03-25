package OOP;

public class Vehicle implements Engine {
	int numberOfSeats;
	int numberOfWheels;
	int aroundOfswheel;

	@Override
	public void start() {
		System.out.println("araç çalışıyor ");
	}

	@Override
	public void stop() {
		System.out.println("arac durdu");

	}

}
