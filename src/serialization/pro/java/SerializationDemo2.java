package serialization.pro.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo2 {

	public static void main(String[] args) {

		TypeOfTree t1 = new TypeOfTree("fruits", 9);

		Tree t2 = new Tree("mango", 1100, t1);

		try {
			
			FileOutputStream file = new FileOutputStream("tree.name");

			ObjectOutputStream obj = new ObjectOutputStream(file);
			
			obj.writeObject(t2);
			
			System.out.println("serialized complete ");
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
