package immutable;

public class ImmutableDemo {
	public static void main(String [] args)
	{
		PhoneNumber pnum=new PhoneNumber();
		pnum.setPhoneNumber(12345678);
		Student s1= new Student("Avinash","Singh",pnum);
		s1.display();
		pnum.setPhoneNumber(123);
		s1.display();
	}
}
class Student{
	final private String name;
	final private String address;
	final private PhoneNumber phoneNumber;
	Student(String name,String address,PhoneNumber pnum){
		PhoneNumber studentpnum= new PhoneNumber();// create your own copy of mutable objects
		studentpnum.num=pnum.num;
		System.out.println("constructor got called");
		this.name=name;
		this.address=address;
		this.phoneNumber=studentpnum;
	}
//	void changeMaker(Integer num){// Don't provide methods that modify the mutable objects. 
//		this.num.setPhoneNumber(num);
//	}
	void display(){
		System.out.println(name+" "+address+" "+phoneNumber.getNum());
		//new Hostel (phoneNumber);
		 //passing a mutable reference to a class might result in modification of the 
		 // values in the object. 'num' defined in 'phonenumber' might get updated.
		}
	
}
class PhoneNumber{
	Integer num;
	public void setPhoneNumber(Integer num){
		this.num=num;
	}
	int getNum(){
		return num;
	}
	
}
class Hostel {
	Student s1;
	
	Hostel(PhoneNumber p ){
		PhoneNumber pnum = new PhoneNumber();
		pnum.num=12345;
		p.setPhoneNumber(pnum.num);
		}
	 
}