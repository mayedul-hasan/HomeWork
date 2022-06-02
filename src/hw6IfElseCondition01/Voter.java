package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] args) {
		
		System.out.println("Please add a valid age--");
		int age = 21;
		
		if (age > 18) {
			System.out.println("\nI am a Voter");
		}	
		else {
			System.out.println("\nI am not a Voter");
		}
		
	}
}