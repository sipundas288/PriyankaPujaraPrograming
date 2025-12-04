package day11;

public class HappyOrSadNumber {

	public static void main(String[] args) {
		int num=13;
		while(true) {
			int sum=0;
		
			while(num!=10)
			{
				int rem=num%10;
				int sq=rem*rem;
				sum=sum+sq;
				num=num/10;	
				
			}
			
			num=sum;
			
			if(sum == 1)
			{
				System.out.println("happy number");
				break;
			}
			else if(sum == 4)
			{
				System.out.println("Sad number");
				break;
			}
		
		}
	}

}
