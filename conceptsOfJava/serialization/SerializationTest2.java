package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest2{
	public static void main(String[] args){
		Student s,s1;
		try {
			FileInputStream fos = new FileInputStream("c://bea//studentfile.txt");
			
			ObjectInputStream oos= new ObjectInputStream(fos);
			s= (Student) oos.readObject();
			System.out.println("Student name is :"+s.id);
			s1= (Student) oos.readObject();
			System.out.println("Student name is :"+s1.id);
			oos.close();
			s.displaySerialVersionUID();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}