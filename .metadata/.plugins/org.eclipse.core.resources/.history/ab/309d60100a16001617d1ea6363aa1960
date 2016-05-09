package Zoo;

public class Weight 
{
	private double weight;
	private String unit; 
	
	public Weight()
	{
		
	}
	
	public Weight(double w, String let)
	{
		setValue(per);
		setLetter(let);
	}


	/**
	 * @return the value
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double grade) {
		this.grade = grade;
	}

	/**
	 * @return the letter
	 */
	public String getLetter() {
		if(getGrade()>=90)
			letter="A";
		else if(getGrade()>=80)
			letter="B";
		else if(getGrade()>=70)
			letter="C";
		else if(getGrade()>=60)
			letter="D";
		else
			letter="F";
		
		return letter;
	}

	/**
	 * @param letter the letter to set
	 */
	public void setLetter(String letter) {
		this.letter = letter;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return grade + "\n"+ ""+ getLetter();
	}
}
