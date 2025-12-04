package Day6;

public class FirstDigitInANumber {

	public static void main(String[] args) {
		int num = 1234;
		
		while(num>9)
		{
			num=num/10;
		}
		if(num%2==0)
		{
			System.out.println("number stary with even num");
			
		}
		else
		{
			System.out.println("number start with odd digit");
		}
	}

}
