     // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details

     
 class Student{
	String name;
	int rollNumber;
	char grade;
	
	public void displayDetails() {
		System.out.println("Name of the student:"+name);
		System.out.println("Roll number of the student: "+rollNumber);
		System.out.println("Grade of the student:"+grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Student student=new Student();
		student.name="Anna";
		student.rollNumber=23;
		student.grade='A';
		
		student.displayDetails();
	
	}

}

      
