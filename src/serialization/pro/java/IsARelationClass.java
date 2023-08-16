
package serialization.pro.java;

import java.io.Serializable;

class Parent implements Serializable {

	public static void main(String[] args) {
		
		System.out.println("Inside parent class main method !!!");
	}
}

public class IsARelationClass extends Parent {

	int id ;
	String name; 
	
	public IsARelationClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "IsARelationClass [id=" + id + ", name=" + name + "]";
	}
	
	
}
