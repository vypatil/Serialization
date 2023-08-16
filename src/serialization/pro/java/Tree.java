package serialization.pro.java;

import java.io.Serializable;

public class Tree implements Serializable {
	
	String name;
	int code;
	TypeOfTree obj;
	
	
	public Tree(String name, int code, TypeOfTree obj) {
		super();
		this.name = name;
		this.code = code;
		this.obj = obj;
	}


	@Override
	public String toString() {
		return "Tree [name=" + name + ", code=" + code + ", obj=" + obj + "]";
	}
	
	
	
	
	
	
}
