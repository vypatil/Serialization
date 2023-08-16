
package serialization.pro.java;

import java.io.Serializable;

public class Student1 implements Serializable {

	int id;
	String name;
	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
