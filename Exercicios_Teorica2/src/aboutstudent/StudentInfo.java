package aboutstudent;

public class StudentInfo {
	String name;
	String course;
	Test grades;
	
	public StudentInfo(String name, String course, Test grades) {
		this.name = name;
		this.course = course;
		this.grades = grades;
	}

	void about() {
		System.out.println("Nome: " + name);
		System.out.println("Curso: " + course);
		System.out.println("Media A: " + grades.arithmeticAverage());
		System.out.println("Media P: " + grades.weightedAverage());
	}
}
