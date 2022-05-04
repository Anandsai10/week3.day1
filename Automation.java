package week3.day1.assignments;

public class Automation implements Language, TestTool {

	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java("selenium");
		auto.selenium("java");
	}
	
	final public void java(String newvalue) {
		System.out.println("This is Java :" +newvalue);
		
	}
	
	public void selenium(String newword) 
	{
		this.java(newword);
	}

	public void selenium() {
		// TODO Auto-generated method stub
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
	}
}
