import java.util.Random;
import java.util.Scanner;

public class DiceGame{

	public static void main(String args[]){
	int dice1; 
	int dice2; 
	int dice3; 
	int dice4; 
	int initialBudget = 100; 
	int initialBudget2 = 100;
	int bet;
	int match; 
	int sum = 0; 
	int sum2 = 0;
	int k= 0; 
	
	Die game = new Die();
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	System.out.println("Press any number to play (-1 to quit)");
	while(initialBudget != 0 || initialBudget2 != 0){
		while(num != -1){
			System.out.println("Press any number to play (-1 to quit)"); 
			if (num == -1){
				System.exit(0);
			}
			else{
				System.out.println("Please place bet: "); 
				bet = input.nextInt();
				match = bet; 
				k = bet + match;
				initialBudget2 = initialBudget2 - bet;
				initialBudget = initialBudget - bet; 
				if(bet > initialBudget){
					System.out.println("Bet too high please lower bet to continue playing");
				}
				else{
					System.out.println("Computer has matched the bet of " + match);
				}
				dice1 = game.roll();
				dice2 = game.roll();
				sum = dice1 + dice2;
				System.out.println("Your roll is: " + sum); 
				dice3 = game.roll(); 
				dice4 = game.roll();
				sum2 = dice3 + dice4;
				System.out.println("Computer roll is: " + sum2);		
				}
				if(sum > sum2){
					 
					initialBudget = initialBudget + k;
					System.out.println("Congratulations you've won " + k);
					System.out.println("You have " + initialBudget);
					
					
				}
				else if(sum2 > sum){
					System.out.println("Sorry please try again");
					initialBudget2 = initialBudget2 + sum;
					
		}
		if (num == -1){
		System.exit(0);
		}
				else{
					System.out.println("Its a draw");
					}
			}
		}
	}	
	
}