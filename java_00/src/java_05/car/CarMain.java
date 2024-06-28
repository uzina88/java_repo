package java_05.car;

public class CarMain {

	public static void main(String[] args) {
		// carEx1() method 선언
		// 기본 Car, 화물차 Truck, 경차 LightCar 객체 생성 및 내용 확인
		
		// 메소드 호출
		carEx1();
		
	}
	
	// 메소드 생성
	public static void carEx1() {
		// 기본 Car
		Car c1 = new Car();
		c1.setModel("제네시스");
		c1.setWheel(10);
		c1.setSeat(5);
		c1.setFuel("휘발유");
		System.out.println(c1.carInfo());
		
		// 화물차 Truck
		Truck c2 = new Truck();
		c2.setModel("화물차");
		c2.setWheel(10);
		c2.setSeat(3);
		c2.setFuel("경유");
		c2.setWeight(1.0);
		System.out.println(c2.carInfo());
		
		// 화물차 Truck
		LightCar c3 = new LightCar();
		c3.setModel("경차");
		c3.setWheel(4);
		c3.setSeat(4);
		c3.setFuel("전기");
		c3.setDiscountOffer(0.3);
		System.out.println(c3.carInfo());
		
	}

}
