package hw6IfElseCondition01;

public class Temperature {

	public static void main(String[] args) {
		
		System.out.println("\r\bTemperature of Today\b");
		System.out.println("------------------------");
		
		
		int todaysTemperature =105;
		
		if (todaysTemperature <= 32) {
			System.out.println("Freezing");		
		}
		else if (todaysTemperature <= 55) {
			System.out.println("Pleasent");
		}
		else if(todaysTemperature <= 73) {
			System.out.println("Getting Warmer");			
		}
		else if (todaysTemperature < 101) {
			System.out.println("Hot");			
		}	
		else {
			System.out.println("Ice on my Head Please");
		}

	}

}
