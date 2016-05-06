package Zoo;

public abstract class Animal implements Locatable {
	String name;
	int weight;
	String message; 

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
	public Animal(String n, int w, String s) {
		name = n;
		weight = w;
		message = s;
	}

	@Override
	public void setName(String nombre) {
		// TODO Auto-generated method stub
		name=nombre;
	}

	@Override
	public void setWeight(int wt) {
		weight=wt;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	
	public abstract void setTalk( String message);
	public abstract String getTalk(); 
	
	public String toString() {
		return "The animals name is " + name + ". Its weight is " + weight + "and it says " + getTalk();
	}
}
