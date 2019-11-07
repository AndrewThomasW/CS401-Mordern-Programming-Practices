/**
 * Created by hp on 10/18/2019.
 */
package exercise1UniversityProblem;

import java.util.List;
import java.util.LinkedList;

public class Department {
    //fields
    private University university;
    private List<Role> roleList;

    //constructor
    public Department(){
        roleList = new LinkedList<>();
    }

    public List<Role> getRoleList(){
        return roleList;
    }
}
