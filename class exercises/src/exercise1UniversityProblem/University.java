package exercise1UniversityProblem;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hp on 10/18/2019.
 */
public class University {
    //fields
    private List<Department> departmentList;

    //constructor
    public University(){
        departmentList = new LinkedList<>();
    }

    public List<Department> getDepartmentList(){
        return departmentList;
    }
}
