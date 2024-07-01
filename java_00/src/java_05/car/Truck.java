package java_05.car;

public class Truck extends Car {

	// Truck 에만 해당하는 매개변수
	private double weight;	// 적재량


	public Truck(String model, int wheel, int seat, String fuel, double weight) {
		super(model, wheel, wheel, fuel);
		this.weight = weight;

	}

	// Truck 기본 생성자
	public Truck() {

	}

	public String carInfo() {
		String result ="";

		// super 는 인자값이 있을 경우에만 사용이 가능
		// this가 자기 자신의 주소를 가리키는 것 처럼 super는 하위 클래스가 상위 클래스에 대한 주소를 가지게 된다.
		// 하위 클래스가 상위 클래스에 접근 할 때 사용할 수 있다.


		result += "[차종] :" + model + "\n";
		result += "[차종] :" + wheel + "\n";
		result += "[차종] :" + seat + "\n";
		result += "[차종] :" + fuel + "\n";
		result += "[적재량] :" + weight + "\n";

		return result;
	}


	// 매개변수 만들고 get set 꼭 만들기!
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}



}
