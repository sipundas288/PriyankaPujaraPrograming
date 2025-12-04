package day9;

public class AutomorphicOrNot {

	public static void main(String[] args) {

		
		int num=11;
		int square = num*num;
		
		while(num!=0)
		{
			int rem1=num%10;
			
			int rem2 = square%10;
			
			if(rem1==rem2)
			{
				num=num/10;
				square=square/10;
				
			}
			else
			{
				break;
			}
		}
		if(num==0)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("not an Automorphic");
			}
		}
				
	

}
