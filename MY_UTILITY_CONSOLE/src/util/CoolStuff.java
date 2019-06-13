package util;

public class CoolStuff {

	 public static void evaluateGuess(int guess, int number, int count) {
	    	while (true) {
				if (guess == number && count == 1) {
					System.out.println("Amazing - You could win a fortune at the casino !!!");
					break;
				 } else if (guess == number && count <= 3) {
					System.out.println("You are mathematical genius !!!");
					break;
				 } else if (guess == number && count > 3 && count <= 7) {
					System.out.println("Not too bad! You've got potential"); 
					break;
				 } else if (guess == number && count > 7) {
					System.out.println("Don't give up your day job! Number guessing is not your thing.");
					break;
				 } else if (guess > number*10) {
					System.out.println("Naw man, that's way too high !!!");
				 } else if (guess > number+10) {
					System.out.println("Too high!");
				 } else if (guess > number) {
					System.out.println("Wow, that was so close. But, it was too high!"); 
				 } else if (guess < number/10 ) {
					System.out.println("What were you thinking? That is way too low !!!");
				 } else if (guess < number-10) {
					System.out.println("You're getting warm, but that was too low!");
				 } else {
					System.out.println("Close, but no cigar! You're guess was too low.");
				 } 
				count++;
			}
	    	
	    	   	
	    }
	 
	 public static void getDisplayMenu() {
		System.out.println();
		System.out.println();
		System.out.println (
								  "			*********************************************\n"
								+ "			****                                     ****\n"
								+ "			****         AVAILABLE FUNCTIONS         ****\n"
								+ "			****                                     ****\n"
								+ "			*********************************************\n"
								+ "			*       _____________________________       *\n"
								+ "			*      |                             |      *\n"
								+ "			*      |    1)   Addition(+)         |      *\n"
								+ "			*      |_____________________________|      *\n"
								+ "			*       _____________________________       *\n"
								+ "			*      |                             |      *\n"
								+ "			*      |    2)   Subtraction(-)      |      *\n"
								+ "			*      |_____________________________|      *\n"
								+ "			*       _____________________________       *\n"
								+ "			*      |                             |      *\n"
								+ "			*      |    3)   Multiplication(x)   |      *\n"
								+ "			*      |_____________________________|      *\n"
								+ "			*       _____________________________       *\n"
								+ "			*      |                             |      *\n"
								+ "			*      |    4)   Division(/)         |      *\n"
								+ "			*      |_____________________________|      *\n"
								+ "			*       _____________________________       *\n"
								+ "			*      |                             |      *\n"
								+ "			*      |    5)   Modulus(%)          |      *\n"
								+ "			*      |_____________________________|      *\n"
								+ "			*                                           *\n"
								+ "			*********************************************\n");
		System.out.println();
		System.out.println();
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

