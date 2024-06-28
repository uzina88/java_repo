package java_05;


//자식 클래스 부모 클래스 Point 를 상속
public class Circle extends Point {

	
	public Circle() {
		System.out.println("Circle 자식 생성자 호출 = 기본 생성자");
	}
	
	public Circle(int x, int y) {
		// this가 자기 자신의 주소를 가리키는 것 처럼 super는 하위 클래스가 상위 클래스에 대한 주소를 가지게 된다.
		// 하위 클래스가 상위 클래스에 접근 할 때 사용할 수 있다.
		super(x, y);
		System.out.println("Circle 자식 생성자 호출 = 인자값이 있는 생성자");
	}
}
