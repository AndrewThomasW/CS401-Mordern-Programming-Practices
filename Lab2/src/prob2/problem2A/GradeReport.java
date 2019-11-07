package prob2.problem2A;

public class GradeReport {
	//fields
	private String grade;
	private Student student;

	//constructor
	GradeReport(Student s) {
		this.student = s;
	}

	//methods
	public String getGrade() {
		return grade;
	}

	public void setGrade(String g) {
		this.grade = g;
	}

	public Student getStudent() {
		return student;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s ", student.getName(), grade);
	}

}
