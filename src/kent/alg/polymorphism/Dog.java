package kent.alg.polymorphism;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println("dog talk");
		
	}

	@Override
	public void eat() {
		System.out.println("dog eat ");
		
	}

	@Override
	public void mating(Animal animal) {
		System.out.println("dog mating");
		
	}

}
