package Zoo;

public class Animal {
	String name;
	int weight;

	public Animal() {
		name = "unnamed animal";
		weight = 3;
	}

	public Animal(String n) {
		name = n;
		weight = 3;
	}

	public Animal(String n, int w) {
		name = n;
		weight = w;
	}

	public String toString() {
		return "The animals name is " + name + ". Its weight is " + weight;
	}
}
