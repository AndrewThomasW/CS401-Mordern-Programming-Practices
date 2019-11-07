package exercise1UniversityProblem;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hp on 10/18/2019.
 */
public class Student extends Role {
    //fields
    private List<Grade> gradeList;

    public List<Grade> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<Grade> gradeList) {
		this.gradeList = gradeList;
	}

	//constructor
    public Student(){
    	
        gradeList = new LinkedList<>();
    }

}
