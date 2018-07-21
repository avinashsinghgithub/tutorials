package serialization.externalization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest2{
	public static void main(String[] args){
		Student s;
		try {
			FileInputStream fos = new FileInputStream("studentfile.ser");
			
			ObjectInputStream oos= new ObjectInputStream(fos);
			s= (Student) oos.readObject();
			System.out.println("Student name is :"+s.contactNum);
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