package javaBasic;

public class Main {
	
	 public static void main(String[] args) {
	       
	        Student student1 = new Student();
	        Student student2 = new Student(101);
	        Student student3 = new Student(102, "Ram");

	        System.out.println("Student 1:");
	        student1.display();

	        System.out.println("\nStudent 2:");
	        student2.display();

	        System.out.println("\nStudent 3:");
	        student3.display();
	    
	        
       
       
}

	
}
