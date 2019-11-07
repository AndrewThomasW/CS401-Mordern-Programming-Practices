package exercise2AirlineProblem;

import java.util.LinkedList;
import java.util.List;

public class Person {
	//fields
	String name;
	int age;
	List<Role> roleList;
	
	
	//constructor
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		roleList = new LinkedList<>();
		
	}
	
	//methods

	public List<Role> getRoleList() {
		return roleList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
