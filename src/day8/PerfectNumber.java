package day8;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num=6, sum=0;
		
		
			for(int i=1; i<num; i++)
			{
				int rem = num%i;
				
				if(rem==0)
				{
					sum=sum+i;
				}
			}
			
			if(sum==sum)
			{
				System.out.println(num+"is a perfect number");
			}
			else
			{
				System.out.println(num+"is not a perfect num");
			}
		}
		
		
		
		

	

}
