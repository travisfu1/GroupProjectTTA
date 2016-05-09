package Zoo;

public abstract class Animals {
	
	private int weight;
	private String name; 
	
	public Animals(){
		weight = 10; 
		name = "Andy";
	}
	
	public Animals(int w){
		
	}
	
	public void setWeight(int w){
		weight = w; 
	}
	public int getWeight(){
		return weight; 
	}

	public void setName(String n){
		name = n; 
	}
	public String getName(){
		return name; 
	}
	
	public abstract void setSays(String s);
	public abstract String getSays();
	
	public String toString(){
		return name + " weighs " + weight + " lbs. and says " + getSays();
	}
}
