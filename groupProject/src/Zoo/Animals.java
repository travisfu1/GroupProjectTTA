package Zoo;

public abstract class Animals {
	private String name;
	private int weight;
	
	public Animals(String nombre){
		name = nombre;
		
	}
	
	public Animals(int pounds){
		weight = pounds; 
	}
	
	public Animals(String nombre, int pounds){
		name = nombre;
		weight = pounds; 
	}
		
	public abstract String talk();
	
	public String toString(){
		return name + " says " + talk(); 
	}
}
