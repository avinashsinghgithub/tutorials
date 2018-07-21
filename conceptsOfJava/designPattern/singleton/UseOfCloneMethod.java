package designPattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UseOfCloneMethod {
	public static void main(String [] args) throws CloneNotSupportedException{
		Singleton s=Singleton.getInstance();
		Singleton s1=(Singleton) s.clone();
		Singleton s2=s;
		Singleton s3=Singleton.getInstance();
		if(s1.equals(s)){
			System.out.println("s1 and s are equal");
		}
		if(s1==s){
			System.out.println("s1 and s are equal "+s1);
		}
		if (s2==s){
			System.out.println("s2 and s are equal "+s2);
		}
		if (s3==s){
			System.out.println("s3 and s are equal "+s3);
		}
		try {
			FileOutputStream  fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Singleton s4 =null;
		try{
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 s4= (Singleton)ois.readObject();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (s4==s){
			System.out.println("s4 and s are equal "+s4);
		}else{
			System.out.println("s4 and s are not equal "+s4.name);
		}
			
	}
}
