package day9;

public class ArmStrongNumberOrNot {

	public static void main(String[] args) {
		
		int num = 153, n1 = num, n2 = num;
		int count = 0; 
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		int sum = 0;
		
		while(n1==0)
		{
			int ld = n1/10;
			
			int pow=1;
			for(int i=1; i<=count; i++)
			{
				pow = pow*ld;
			}
			sum = sum+pow;
			
			n1=n1/10;
		}
		
		if(sum==n2)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
		
	}

}
