package OOPS;

public class Employee {
	int empid;
	String empname;	//variables
	int salary;
	int deptno;
	
	/*Employee(int id, String name,int sal,int dno){  //constructor with parametes
	empid=id;
	empname=name;
	salary=sal;
	deptno=dno;
	}*/
	
	
	void setdata(int id, String name,int sal,int dno) {
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	
	void display() {			//methods
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(deptno);
		System.out.println(salary);
	}
	
	
	
	public static void main(String [] args) {
		
		//Assigning values to class variables using object- First method
		
	/*	Employee emp1=new Employee(); //Creating an object
		emp1.empid=101;
		emp1.empname="Raj";
		emp1.salary=30000;
		emp1.deptno=20;
		emp1.display();	*/
		
		/* Employee emp2=new Employee(); //Creating an object
		emp2.empid=102;
		emp2.empname="Dev";
		emp2.salary=50000;
		emp2.deptno=25;
		emp2.display();	*/	
		
		//Assigning values to class variables using Constructors- second method
		
		/*Employee emp1=new Employee(101,"RAJ",20000,10);
		emp1.display();
		
		Employee emp2=new Employee(102,"Deva",50000,25);
		emp2.display();*/
		
		
		//Assigning values to class variables using method- Third method
		Employee emp1=new Employee();
		emp1.setdata(15,"RAJ",20000,20);
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.setdata(10,"Deva",50000,25);
		emp2.display();
		
		
	}
	
}
