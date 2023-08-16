package serialization.pro.java;

import java.io.Serializable;

public class TypeOfTree implements Serializable {

	String type;
	int rating;
	
	
	public TypeOfTree(String type, int rating) {
		super();
		this.type = type;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "TypeOfTree [type=" + type + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
}
