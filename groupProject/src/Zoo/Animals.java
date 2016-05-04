package Zoo;

public abstract class Animals {
	private String name;
	
	public Animals(String nombre){
		name = nombre;
	}
		
	public abstract String talk();
	
	public String toString(){
		return name + " says " + talk(); 
	}
}
