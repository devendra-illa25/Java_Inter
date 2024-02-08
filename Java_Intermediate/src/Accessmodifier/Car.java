package Accessmodifier;

public class Car {

	//can we access outside the class but in same package...? yes
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.rollNo);
		s.printRollNumber();
		
	//Public: we can Access them in same class and same package in different classes
		

	}

}
