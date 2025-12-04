package Day4;

import java.util.Scanner;

public class UnlockDeviceWithCorrectPass {

	public static void main(String[] args) {
		int correctPw = 12345;
		System.out.println("Please enter the password");
		Scanner sc = new Scanner(System.in);
		int usePw = sc.nextInt();
		
		if(usePw == correctPw)
		{
			System.out.println("Unlock the device");
		}
		else
		{
			System.out.println("Please try again with valid password");
		}

	}

}