package day7;

public class SumOfFactorsOfANumber {

	public static void main(String[] args) {
		int num=10, sum=0;
		int temp=num;
		System.out.println("Factor's of given number"+temp+"are");
	
		for(int i=1; i<=10; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				
				sum=sum+i;
				
			}
			
		}
		System.out.println("sum of factors :"+sum);
		
	}

}
