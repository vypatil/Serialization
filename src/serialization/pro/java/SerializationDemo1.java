
package serialization.pro.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(100, "ram");
		
		try {
			
			FileOutputStream file = new FileOutputStream("student1.ser");
			
			ObjectOutputStream obj = new ObjectOutputStream(file);
			
			obj.writeObject(s1);
			
			System.out.println("serialize sucessful");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
