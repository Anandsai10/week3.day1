package week3.day1.assignments;

public class Students {
	

		public void getStudentInfo(int id)
		{
			System.out.println("Student ID is "+id);
		}
		
		public void getStudentInfo(String name, int id)
		{
			System.out.println("Student Name is "+name);
			//this.getStudentInfo(id);
			
		}
		
		public void getStudentInfo(String email, long phone)
		{
			System.out.println("Student mail id is "+email);
			System.out.println("Student phone number is "+phone);
		}
		
		public static void main(String[] args) {
			Students students = new Students();
			students.getStudentInfo(189823);
			students.getStudentInfo("Anand", 123456);
			students.getStudentInfo("anand@gmail.com", 9346534330L);
			
		}
	}


