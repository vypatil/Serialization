package serialization.pro.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializedDemo2 {

	public static void main(String[] args) {

		
		try {
			
			FileInputStream file = new FileInputStream("tree.name");
			
			ObjectInputStream obj = new ObjectInputStream(file);
			
			obj.readObject();
			
			System.out.println(" DeSerialized succesfull ");
		}
		
		catch (Exception e) {
			
			System.out.println(" Not Deserialized ");
			e.printStackTrace();
		}
	}

}
