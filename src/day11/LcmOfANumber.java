package day11;

public class LcmOfANumber {

	public static void main(String[] args) {

		int n1=8, n2=12;
		int lcm = 0;
		
		for(int i=1; i<=n1*n2; i++)
		{
			if(i%n1==0 && i%n2==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println("gcd is "+lcm);
		
	}

}
