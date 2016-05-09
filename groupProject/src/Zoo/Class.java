package unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.ArrayList;

//Comments are version with arrays
public class Class {
	private String name;
	// private Student[] studentList;
	private ArrayList<Student> studentList;

	public Class() {
		//name = "";
		//studentList = new Student[0];
		name = "";
		studentList = new ArrayList<Student>();
	}

	public Class(String name, int stuCount) {
		//this.name = name;
		//studentList = new Student[stuCount];
		this.name = name;
		studentList = new ArrayList<Student>();
	}

	public void addStudent(int stuNum, Student s) {
		//studentList[stuNum] = s;
		studentList.add(s);
	}

	public String getClassName() {
		return name;
	}

	public double getClassAverage() {
		//double classAverage = 0.0;
		//for (int i = 0; i < studentList.length; i++) {
		//	classAverage += studentList[i].getAverage();
		//}
		//classAverage = classAverage / studentList.length;
		//return classAverage;
		double classAverage = 0.0;
		for (int i = 0; i < studentList.size(); i++) {
			classAverage += studentList.get(i).getAverage();
		}
		classAverage = classAverage / studentList.size();
		return classAverage;
	}

	public double getStudentAverage(int stuNum) {
		//return studentList[stuNum].getAverage();
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName) {
		//for (int i = 0; i < studentList.length; i++) {
		//	if (studentList[i].getName().equals(stuName))
		//		return studentList[i].getAverage();
		//}
		//return 0.0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().equals(stuName))
				return studentList.get(i).getAverage();
		}
		return 0.0;
	}

	public String getStudentName(int stuNum) {
		//return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage() {
		//double high = Double.MIN_VALUE;
		//String hName = "";
		//for (int i = 0; i < studentList.length; i++) {
		//	// if (studentList[i].getAverage() > high) {	//no comparable
		//	// high = studentList[i].getAverage();
		//	// hName = studentList[i].getName();
		//	// }
		//	// else if(studentList[i].getAverage() == high){
		//	// hName += "" + studentList[i].getName();
		//	// }											//no comparable
		//	for (int j = i + 1; j < studentList.length; j++) {
		//		if (studentList[i].compareTo(studentList[j]) == -1) {
		//			hName = studentList[j].getName();
		//			i = j;
		//			j = studentList.length;
		//		} else if (studentList[i].compareTo(studentList[j]) == 0) {
		//			hName += studentList[i].getName() + " "
		//					+ studentList[j].getName();
		//		} else if (studentList[i].compareTo(studentList[j]) == 1) {
		//			hName = studentList[i].getName();
		//		}
		//	}
		//}
		//return hName;
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) {
			// if (studentList[i].getAverage() > high) {
			// high = studentList[i].getAverage();
			// hName = studentList[i].getName();
			// }
			// else if(studentList[i].getAverage() == high){
			// hName += "" + studentList[i].getName();
			// }
			for (int j = i + 1; j < studentList.size(); j++) {
				if (studentList.get(i).compareTo(studentList.get(j)) == -1) {
					hName = studentList.get(j).getName();
					i = j;
					j = studentList.size();
				} else if (studentList.get(i).compareTo(studentList.get(j)) == 0) {
					hName += studentList.get(i).getName() + " "
							+ studentList.get(j).getName();
				} else if (studentList.get(i).compareTo(studentList.get(j)) == 1) {
					hName = studentList.get(i).getName();
				}
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage() {
		//double low = Double.MAX_VALUE;
		//String hName = "";
		//for (int i = 0; i < studentList.length; i++) {
		//	// if (studentList[i].getAverage() < low) {
		//	// low = studentList[i].getAverage();
		//	// hName = studentList[i].getName();
		//	// }
		//	for (int j = i + 1; j < studentList.length; j++) {
		//		if (studentList[i].compareTo(studentList[j]) == 1) {
		//			hName = studentList[j].getName();
		//			i = j;
		//			j = studentList.length;
		//		} else if (studentList[i].compareTo(studentList[j]) == -1) {
		//			hName = studentList[i].getName();
		//		} else if (studentList[i].compareTo(studentList[j]) == 0) {
		//			hName += studentList[i].getName() + " "
		//					+ studentList[j].getName();
		//		}
		//	}
		//}
		//return hName;
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) {
			// if (studentList[i].getAverage() < low) {
			// low = studentList[i].getAverage();
			// hName = studentList[i].getName();
			// }
			for (int j = i + 1; j < studentList.size(); j++) {
				if (studentList.get(i).compareTo(studentList.get(j)) == 1) {
					hName = studentList.get(j).getName();
					i = j;
					j = studentList.size();
				} else if (studentList.get(i).compareTo(studentList.get(j)) == -1) {
					hName = studentList.get(i).getName();
				} else if (studentList.get(i).compareTo(studentList.get(j)) == 0) {
					hName += studentList.get(i).getName() + " "
							+ studentList.get(j).getName();
				}
			}
		}
		return hName;
	}

	public String getFailureList(double failingGrade) {
		//String output = "";
		//for (int i = 0; i < studentList.length; i++) {
		//	if (studentList[i].getAverage() < failingGrade)
		//		output += studentList[i].getName() + " ";
		//}
		//return output;
		String output = "";
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getAverage() < failingGrade)
				output += studentList.get(i).getName() + " ";
		}
		return output;
	}

	public void sort() {
		//Student replacement = null;
		//for (int i = 0; i < studentList.length; i++) {
		//	for (int j = i + 1; j < studentList.length; j++) {
		//		if (studentList[i].compareTo(studentList[j]) == 1) {
		//			replacement = studentList[i];
		//			studentList[i] = studentList[j];
		//			studentList[j] = replacement;
		//		}
		//	}
		//}
		Student replacement = null;
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = i + 1; j < studentList.size(); j++) {
				if (studentList.get(i).compareTo(studentList.get(j)) == 1) {
					replacement = studentList.get(i);
					studentList.set(i,studentList.get(j));
					studentList.set(j, replacement);
				}
			}
		}
	}

	public String toString() {
		//String output = "" + getClassName() + "\n";
		//for (int i = 0; i < studentList.length; i++) {
		//	output += studentList[i].toString() + " "
		//			+ studentList[i].getAverage();
		//	if (i != studentList.length - 1)
		//		output += "\n";
		//}
		//return output;
		String output = "" + getClassName() + "\n";
		for (int i = 0; i < studentList.size(); i++) {
			output += studentList.get(i).toString() + " "
					+ studentList.get(i).getAverage();
			if (i != studentList.size() - 1)
				output += "\n";
		}
		return output;
	}
}