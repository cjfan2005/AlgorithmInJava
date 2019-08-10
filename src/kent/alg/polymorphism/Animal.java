package kent.alg.polymorphism;

public abstract class Animal {
	
	private String name;
	
	// 封裝, 避免直接存取
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void talk();
	
	public abstract void eat();
	public abstract void mating(Animal animal);
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
