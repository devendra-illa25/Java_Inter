package Demo;

import Accessmodifier.Student;

public class Test {
	public static void main(String []args) {
		//Can we access public in different package in different class...? yes
		Student s=new Student();
		System.out.println(s.rollNo);
		s.printRollNumber();
		
}
}