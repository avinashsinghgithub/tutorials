package serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String address;
	String contactNum;
	public Student(int id, String name,String address,String contactNum){
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNum=contactNum;
	}
	
	/* Student(Object name,int id){
		this.id=id;
		this.name=(String) name;
	}*/
	public Student(){
	}
	void displaySerialVersionUID(){
		System.out.println(serialVersionUID);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		name=(String) in.readObject();
		id=in.readInt();
		address=(String) in.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeInt(id);
		out.writeObject(address);
	}

}

