package Zoo;

public class Reptile extends Animals {
	private String says;

	public Reptile() {

	}

	public Reptile(int w, String n) {
		super(w, n);
	}

	@Override
	public void setSays(String s) {
		// TODO Auto-generated method stub
		says = s;
	}

	@Override
	public String getSays() {
		// TODO Auto-generated method stub
		return says;
	}

	public String toString() {
		return super.toString();
	}
}
