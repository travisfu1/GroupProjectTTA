package unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//Comments are version with arrays
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
	// private double[] grades;
	private ArrayList<Double> grades;

	public Grades() {
		setGrades("");
	}

	public Grades(String gradeList) {
		setGrades(gradeList);
	}

	public void setGrades(String gradeList) {
		// Scanner key = new Scanner(gradeList);
		// int gradeCount = key.nextInt();
		// grades = new double[gradeCount];
		// gradeList.substring(gradeList.indexOf("-"));
		// int index = 0;
		// while (key.hasNext()) {
		// if (key.hasNextDouble())
		// grades[index++] = key.nextDouble();
		// else if (key.hasNextInt())
		// grades[index++] = (double) key.nextInt();
		// else
		// key.next();
		// }
		Scanner key = new Scanner(gradeList);
		int gradeCount = key.nextInt();
		grades = new ArrayList<Double>();
		gradeList.substring(gradeList.indexOf("-"));
		int index = 0;
		while (key.hasNext()) {
			if (key.hasNextDouble())
				grades.add(key.nextDouble());
			else if (key.hasNextInt())
				grades.add((double) key.nextInt());
			else
				key.next();
		}
	}

	public void setGrade(int spot, double grade) {
		// grades[spot] = grade;
		grades.set(spot, grade);
	}

	public double getSum() {
		// double sum = 0.0;
		// for (int i = 0; i < grades.length; i++) {
		// sum += grades[i];
		// }
		// return sum;
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		return sum;
	}

	public double getLowGrade() {
		// double low = Double.MAX_VALUE;
		// for (int i = 0; i < grades.length; i++) {
		// low = Math.min(low, grades[i]);
		// }
		// return low;
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			low = Math.min(low, grades.get(i));
		}
		return low;
	}

	public double getHighGrade() {
		// double high = Double.MIN_VALUE;
		// for (int i = 0; i < grades.length; i++) {
		// high = Math.max(high, grades[i]);
		// }
		// return high;
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			high = Math.max(high, grades.get(i));
		}
		return high;
	}

	public int getNumGrades() {
		// return grades.length;
		return grades.size();
	}

	public String toString() {
		// String output = "";
		// for (int i = 0; i < grades.length; i++) {
		// output += grades[i] + " ";
		// }
		// return output;
		String output = "";
		for (int i = 0; i < grades.size(); i++) {
			output += grades.get(i) + " ";
		}
		return output;
	}
}