package serialization.pro.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DesSerializationDemo1 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("student1.ser");
			
			ObjectInputStream obj = new ObjectInputStream(file);
			
			Student1 deseriobject = (Student1) obj.readObject();
			
			System.out.println(deseriobject);
			System.out.println("Deserialized sucessfully");
		}
		
		catch (Exception e) {
			
			System.out.println("Not deserialized");
			e.printStackTrace();
		}
	}
}
