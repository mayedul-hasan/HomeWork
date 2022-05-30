package hw5Q2Constructor;



public class Computer {
	
	public String Brand = "Apple";
	public String Model = "MacBook Air";
	public String operatingSystem = "MacOS Mojave";
	public int price = 800;
	public char Grade = 'A';
	public boolean madeInUSA = false;
	
	public String Default = "This is from default Constructor--";
	
	
	
	public Computer() {
		System.out.println(Default);
		
	}
	
	public void computerInfo() {
		System.out.println("Computer Details");
		System.out.println("computer brand:" + Brand + "\ncomputer model:" + Model +"\ncomputer OS:" +
		operatingSystem + "\ncomputer price:" + price + "\ncondition:" + Grade + "\nMade In USA:" + madeInUSA);
		}

}
