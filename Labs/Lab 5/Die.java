import java.util.Random;
// cd C:\Users\jonathanarava\Desktop\Lab5
// set Path=%Path%;C:\Program Files\Java\jdk1.8.0_102\bin
// javac Die.java

public class Die{
	Random randomNumber = new Random();
	
	public int roll(){
		int i = randomNumber.nextInt(6);
		int randomNumber = i + 1;
		return randomNumber;
	}
	
	public static void main(String args[]){
		Die test = new Die();
		System.out.println(test.roll());
	}
}

