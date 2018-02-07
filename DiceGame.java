import java.util.Scanner;
public class DiceGame{
	Scanner input = new Scanner(System.in);
	private int num = input.nextInt();
	private int dice1; 
	private int dice2; 
	private int dice3; 
	private int dice4; 
	private int initialBudget = 100; 
	private int initialBudget2 = 100;
	private int bet;
	private int match; 
	private int sum = 0; 
	private int sum2 = 0;
	
	DiceGame game = new Die();
	
	public static void main(String args[]){
		while(initialBudget != 0 || initialBudget2 != 0){
			while(input != -1){
				System.out.println("Press any number to play (-1 to quit)"); 
				if (input = -1){
					Sytem.quit(0);
				}
				else{
					System.out.println("Please place bet: "); 
					bet = num;
					match = bet; 
					sum = bet + match;
					initialBudget2 = initialBudget2 - bet;
					initialBudget = initialBudget - bet; 
					if(bet > initialBudget){
						System.out.println("Bet too high please lower bet to continue playing");
					}
					else{
						System.out.println("Computer has matched the bet of " + match);
					}
					dice1 = Die.roll();
					dice2 = Die.roll();
					sum = dice1 + dice2;
					System.out.println("Your roll is: " + sum); 
					dice3 = Die.roll(); 
					dice4 = Die.roll();
					sum2 = dice3 + dice4;
					System.out.println("Computer roll is: " + sum2);		
					}
					if(sum > sum2){
						System.out.println("Congratulations you've won"); 
						initialBudget = initalBudget + sum;
					}
			else if(sum2 > sum){
				System.out.println("Sorry please try again");
				initialBudget2 = initialBudget2 + sum;
			}
			else{
				System.out.println("Its a draw")
			}
		}
	}	
}
