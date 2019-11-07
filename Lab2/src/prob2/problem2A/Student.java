package prob2.problem2A;

public class Student {
	//fields
	private String StudentName;
	private GradeReport report;

	//constructor
	public Student(String StudentName){
		this.StudentName = StudentName;
		this.report = new GradeReport(this);
	}

	//methods
	public String getName() {
		return StudentName;
	}
	public GradeReport getReport() {
		return report;
	}
	
}
