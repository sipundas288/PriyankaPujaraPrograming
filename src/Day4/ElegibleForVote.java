package Day4;

import java.util.Scanner;

public class ElegibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int votingAge = 18;
		int userAge = sc.nextInt();
		
		if(userAge >=votingAge)
		{
			System.out.println("User is elegible for vote");
		}
		else
		{
			System.out.println("User ia not elegible for vote");
		}

	}

}
