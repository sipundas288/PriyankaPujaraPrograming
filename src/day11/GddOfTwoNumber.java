package day11;

public class GddOfTwoNumber {

	public static void main(String[] args) {

		int n1=36, n2=60;
		
		int gcd=1;
		
		for(int i=1; i<=n1 && i<n2; i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd is "+gcd);
	}

}
