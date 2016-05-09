package unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Student implements Comparable<Student> {
	private String myName;
	private Grades myGrades;

	public Student() {
		setName("");
		setGrades("");
	}

	public Student(String name, String gradeList) {
		setName(name);
		setGrades(gradeList);
	}

	public void setName(String name) {
		myName = name;
	}

	public void setGrades(String gradeList) {
		myGrades = new Grades(gradeList);
	}

	public void setGrade(int spot, double grade) {
		myGrades.setGrade(spot, grade);
	}

	public String getName() {
		return myName;
	}

	public int getNumGrades() {
		return myGrades.getNumGrades();
	}

	public double getSum() {
		return myGrades.getSum();
	}

	public double getAverage() {
		return getSum() / getNumGrades();
	}

	public double getAverageMinusLow() {
		return (getSum() - getLowGrade()) / (getNumGrades() - 1);
	}

	public double getHighGrade() {
		return myGrades.getHighGrade();
	}

	public double getLowGrade() {
		return myGrades.getLowGrade();
	}

	public int compareTo(Student other) {
		return Double.compare(this.getAverage(), other.getAverage());
	}

	public boolean equals(Student other) {
		if (this.compareTo(other) == 0)
			return true;
		return false;
	}

	public String toString() {
		return myName + " = " + myGrades.toString();
	}
}