package exercise1UniversityProblem;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by hp on 10/18/2019.
 */
public class Course {
	
	//fields
    private List<Grade> gradeList;

    //constructor
    public Course(){
        gradeList = new LinkedList<>();
    }

    public List<Grade> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<Grade> gradeList) {
		this.gradeList = gradeList;
	}

}
