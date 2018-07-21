package serialization.externalization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest{
	public static void main(String[] args){
		Student s= new Student(1,"Avinash","Bihta","651615");
		try {
			FileOutputStream fos = new FileOutputStream("studentfile.ser");
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.close();
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}