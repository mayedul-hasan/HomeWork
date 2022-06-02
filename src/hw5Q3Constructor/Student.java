package hw5Q3Constructor;

public class Student {
	public String stName;
	public byte stID;
	public  char sex;
	public boolean isProgrammer;
	public float grade;
	
	//default constructor
	public Student() {
		System.out.println("This is student details--");	
	}
	
	//Parameterized constructor	
	public Student(String stName, byte stID, char sex, boolean
			isProgrammer, float grade) {
		this.stName = stName;
 		this.stID = stID;
		this.sex =sex;
		this.isProgrammer =isProgrammer;
		this.grade=grade;
		
		System.out.println("Student Name is:" + stName + "\nStudent ID:" + stID +
				"\nSex:" + sex + "\nIs he Programmer:" + isProgrammer + "\nStudent Grade:" + grade);
	}
	
	

}
