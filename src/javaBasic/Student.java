package javaBasic;

public class Student {
    private int studentId;
    private String studentName;


    public Student() {
        studentId = 0;
        studentName = "null";
    }


    public Student(int id) {
        studentId = id;
        studentName = "null";
    }

    
    public Student(int id, String name) {
        studentId = id;
        studentName = name;
    }
	 public void display() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Name: " + studentName);
	    }
   
}

