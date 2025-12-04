package day7;

public class PrintPrimeDigitOfANumber {

	public static void main(String[] args) {
		
		int num = 23479;
				
				while(num!=0)
				{
					int rem =num%10;
					int count=0;
					
					for(int i=1; i<rem; i++)
					{
						if(rem%i==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println(rem);
					}
					num=num/10;
				}

	}

}
