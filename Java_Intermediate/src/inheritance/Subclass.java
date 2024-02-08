package inheritance;

import Accessmodifier.Student;

public class Subclass extends Student {

	public static void main(String[] args) {
		// we can also access public in sub class
		new Subclass().test(); //calling the test
	}
		public void test() {  //method
		System.out.println(rollNo);
		printRollNumber();
	}

}
