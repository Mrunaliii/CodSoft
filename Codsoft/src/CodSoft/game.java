package CodSoft;
import java.util.Random;
import java.util.*;
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

					int lower = 1;
					int upper = 100;
					int itt=0;
					
					Random randomNumber = new Random();
					
					int target = randomNumber.nextInt(lower, upper + 1);
					System.out.println("Guess the number betweem "+lower+" and "+upper );
					
					try (Scanner userInput = new Scanner(System.in)) {
						
						int guess = 0;
						while(guess != target) {
							guess = userInput.nextInt();
							
							if(guess == target) {
								System.out.println("Correct");
							} else if(guess < target) {
								System.out.println("Guess number is lower");
							} else {
								System.out.println("Guess number is higher");
							}
							itt++;
						}
					System.out.println("You have guess the number in "+itt+" Iterations");
					}
	}

}
