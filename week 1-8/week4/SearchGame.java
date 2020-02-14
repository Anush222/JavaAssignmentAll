package SG;

import java.util.Scanner;
import java.util.ranom;

public class SearchGame {

	public static void main(String[] args) {
		int GuessedNum,tobeguessed,triedNumber=0;
		boolean won =false;
		ranom ran=new ranom();
		tobeguessed=ran.nextInt(10000);
		Scanner sc=new Scanner(System.in);
		
		
		while (won==false) {
			System.out.println("Guess a number between 1 to 10000");
			GuessedNum=sc.nextInt();
			triedNumber++;
			if(GuessedNum>10000 || GuessedNum<0) {
				System.out.println("the number you chose is over limits");
			}
			else {
			if(GuessedNum == tobeguessed) {
				won=true;
			}
			else if(GuessedNum<tobeguessed) {
				System.out.println("the number is less than chosen number");
			}
			else if(GuessedNum>tobeguessed) {
				System.out.println("number you entered is greater than provided range");
			}
			}
		}
		
		System.out.println("Winner");
		System.out.println("The number you guessed is" +tobeguessed);
		System.out.println("It took you"+triedNumber+"tries");
        
	}

}
