package inheritance;

public class Admin extends Developer {


	//Adding or deleting the products/application
	public void manage() {
		super.read();
		write();
		System.out.println("manage Code");
}
	public void read() {
		System.out.println("Admin Read Code");
}
}