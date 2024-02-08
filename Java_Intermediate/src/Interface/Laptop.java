package Interface;

//business doucments

public interface Laptop {  
	//Rules(Methods)
	
	public void copy(); //what to do
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	//public void security();
	
	default void security() {
		System.out.println("please implement"); 
	}
	
	static void audio() {	//it can be used any where.
		System.out.println("Laptop audio code"); 	
	
	}
	
	private void commoncode() {
		System.out.println("Commoncode"); 
	
	}
}
