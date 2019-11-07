package exercise1UniversityProblem;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hp on 10/18/2019.
 */
public class Professor extends Role {
    //fields
     private List<Grade> gradeList;

    //constructor
    public Professor(){
        gradeList = new LinkedList<>();
    }
    
    public List<Grade> getGradeList(){
    	return gradeList;
    }
}
