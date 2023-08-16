package serialization.pro.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo3 {

	public static void main(String[] args) {

		IsARelationClass i1 = new IsARelationClass(500, "vaibhav");

		try {

			FileOutputStream file = new FileOutputStream("Serialization.3");

			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(i1);

			System.out.println(" Serialization Sucessfull ");
		} 

		catch (Exception e) {

			e.printStackTrace();
			System.out.println(" Serialization Not Sucessfull ");
		}
	}

}
