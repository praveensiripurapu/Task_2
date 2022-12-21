import java.util.*;
public class Guess_Number{
public static void main(String[] args) {
Random Random_number=new Random( );
int right_guess=Random_number.nextInt(100);
int turns=0;
Scanner scan=new Scanner(System.in);
System.out.println("Guess a number between 1 to 100,you will have 10 turns!");
System.out.println("best of luck! :)");
int guess;
int i=0;
boolean win=false;
while(win==false) {
	guess=scan.nextInt();
	turns++;
	if(guess==right_guess) {
		win=true;
	}
	else if(i>8) {
		System.out.println("you loose! the right answer was:"+right_guess);
		return;
	}
	else if(guess<right_guess) {
		i++;
		System.out.println("your Guess is lower than the right guess!Turns left:"+(10-i));
	}
	else if(guess>right_guess) {
		i++;
		System.out.println("Your guess Is Higher Than The Right Guess! Turns left::"+(10-i));
	}
}
	System.out.println("You win!!,Congratulations");
	System.out.println("Then number was "+right_guess);
	System.out.println("You used "+turns+" turns to guess the right number");
	System.out.println("Your score is "+((11-turns)*10)+" out of 100");
	

	
	}
}