package Accessmodifier;

public class Student {
	/*public int rollNo=101; 	//Variable
	
	public Student() {		//Constructor
		rollNo=102;			
	}
	public void printRollNumber() {		//Method
		System.out.println(rollNo);
	}
	//with in the class we are accessing
	private void abc() {
		printRollNumber();
		System.out.println(rollNo);*/
	
private int rollNo=101; 	//Variable
	
private Student() {		//Constructor
		rollNo=102;			
	}
private void printRollNumber() {		//Method
		System.out.println(rollNo);
	
	}
public static void main(String[] args) {
	Student s=new Student();
	
}
public void abc() {
	printRollNumber();
}

	}


