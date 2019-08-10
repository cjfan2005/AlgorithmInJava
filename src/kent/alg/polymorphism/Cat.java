package kent.alg.polymorphism;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println("cat talk");
		
	}

	@Override
	public void eat() {
		System.out.println("cat eat");
		
	}

	@Override
	public void mating(Animal animal) {
		System.out.println("cat mating ");
		
	}

	// special action for CAT
	public void scratch() {
		System.out.println("cat scratch only ");
	}
}
