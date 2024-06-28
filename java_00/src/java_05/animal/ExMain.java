package java_05.animal;

public class ExMain {

	public static void main(String[] args) {

		Animal animal = new Animal();
		
		animal.move();
		
		// public void moveAnimal(Animal animal) 메소드 animal 값을 다르게 호출
		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagle());
	}

}
