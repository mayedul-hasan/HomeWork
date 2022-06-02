package hw5Q2Constructor;

public class Computer {
	
	public String Brand = "Apple";
	public String Model = "MacBook Air";
	public String operatingSystem = "MacOS Mojave";
	public int price = 800;
	public char Grade = 'A';
	public boolean madeInUSA = false;
	
		
	public Computer() {
		System.out.println("This is from default Constructor--");
		
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.Brand = brand;
		this.Model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.Grade = grade;
		this.madeInUSA = madeInUSA;
		
		System.out.println("My Brand:"+ brand + "\nModel:"+model+ "\nOperating System:" + operatingSystem+ "\nPrice:" + price + "\nGrade:"+ grade+ "\nMade in USA:"+madeInUSA );
	}
		
}
