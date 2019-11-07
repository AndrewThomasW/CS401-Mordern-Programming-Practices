package prob4;

import java.util.List;

public class StudentSectionFactory {

	public Section createSection(int sectionNumber, String courseName) {
		return new Section(courseName,sectionNumber);
	}
	
	public Student createStudent(String id, String name) {
		return new Student(name,id);
	}
	
	public void newTranscriptEntry(Student student, Section section , String grade) {
		TranscriptEntry et = new TranscriptEntry(student, section, grade);
		//List<TranscriptEntry> grade1 = s.getGrades();
		student.grades.add(et);
		//System.out.println(grade1);
	}
	
}//end_class
