package java_05.car;

public class LightCar extends Car {

	private double discountOffer; 	// 경차 할인

	
	// 기본 생성자
	public LightCar() {
		
	}
	
	public String carInfo() {
		String result ="";
		
		// super(x, y);
		// super 는 인자값이 있을 경우에만 사용이 가능
		// this가 자기 자신의 주소를 가리키는 것 처럼 super는 하위 클래스가 상위 클래스에 대한 주소를 가지게 된다.
		// 하위 클래스가 상위 클래스에 접근 할 때 사용할 수 있다.
		
		result += "[차종] :" + model + "\n";
		result += "[차종] :" + wheel + "\n";
		result += "[차종] :" + seat + "\n";
		result += "[차종] :" + fuel + "\n";
		result += "[경차 할인율] :" + discountOffer + "\n";
		
		return result;
	}
	
	
	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
}
