package day8;

public class StrongOrNot {

	public static void main(String[] args) {
		
		int num=145;
		int temp=num;
		int sum=0;
		
		while(num!=0)
		{
			int ld = num%10;
			int fact=1;
			
			for(int i=1; i<=ld; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("given number is strong number"+temp);
		}
		else
		{
			System.out.println("given no is not a strong number"+temp);
		}
		
	}

}
