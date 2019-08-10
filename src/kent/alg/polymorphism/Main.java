package kent.alg.polymorphism;

/**
 * Poloymorphism:
 *  1. Readability
 *  2. Maintainability
 *  3. Expandability
 * @author kentfan
 *
 */
public class Main {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] 
			{ new Dog("a dog") , new Cat("a cat") } ;
		
		for(Animal animal: animals) {
			
			System.out.println(animal.getName() + ":"  );
			
			animal.talk();
		}
	}
}
