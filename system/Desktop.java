package org.system;

public class Desktop extends Computer {
	
	public static void desktopSize() {
		System.out.println("Desktop screen size is 22 inches");
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		
		desk.computerModel();
		desk.desktopSize();
		
	}
	
	
	

}
