package Zoo;

public class PygmyGoat extends Animals {
	private String says;

	public PygmyGoat() {

	}

	public PygmyGoat(int w, String n) {
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
