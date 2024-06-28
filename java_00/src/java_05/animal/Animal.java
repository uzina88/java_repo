package java_05.animal;

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	// 메소트 생성 : 각 각의 객체를 메소드로 반환해준다.
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}

