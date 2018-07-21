package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	int id;
	//String name;
	String address;
	String contactNum;
	Student(int id, String name,String address,String contactNum){
		this.id=id;
	//	this.name=name;
		this.address=address;
	}
	
	void displaySerialVersionUID(){
	//	System.out.println(serialVersionUID);
	}

}

