package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest{
	public static void main(String[] args){
		Student s= new Student(1,"Avinash singh","Bihta","651615");
		Student s1= new Student(2,"prabhu singh","Bihta","651615");
		try {
			FileOutputStream fos = new FileOutputStream("C://bea//studentfile.txt");
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.writeObject(s1);
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