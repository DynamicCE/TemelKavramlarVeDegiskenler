package OOP;

public class ObjectFactory {

	public static void main(String[] args) {
		Pen zeroPen = new Pen();
		zeroPen.color = "blue";

		Pen firstPen = new Pen();
		firstPen.color = "Pembe";
		firstPen.height = 10;
		String message = "ilk kalem üretildi.";
		firstPen.writeMessage(message);
		Pen secondPen = new Pen();
		secondPen.color = "Mavi";
		secondPen.height = 10;
		secondPen.writeMessage(secondPen.color + " " + secondPen.height);
		Car car = new Car();
		car.aroundOfswheel = 25;
		car.numberOfSeats = 4;
		Bicycle bicycle = new Bicycle();
		bicycle.aroundOfswheel = 35;
		bicycle.numberOfSeats = 1;

		Vehicle car2 = new Car();
		Engine engine = new Car();

		car.start();
		bicycle.start();
		car2.start();
		car2.stop();
		// süper üst klass adıyla array tanımlayıp içerisine nesneleri atayabilirz.
		Vehicle[] vehicles = new Vehicle[10];
		vehicles[0] = car;
		vehicles[2] = bicycle;
		vehicles[3] = car2;
	}

}
