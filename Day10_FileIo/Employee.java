package fileIO;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	
//	Employee(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
	 public void setData(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }


	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
