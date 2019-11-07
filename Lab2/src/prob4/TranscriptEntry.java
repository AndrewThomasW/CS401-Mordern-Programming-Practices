package prob4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	//constructor
	TranscriptEntry(Student student, Section section, String grade){
		this.section = section;
		this.student = student;
		this.grade = grade;
	}
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
