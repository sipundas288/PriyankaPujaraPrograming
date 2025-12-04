package day8;

public class PrimeNumberBwtRange {

	public static void main(String[] args) {
		int countprimeNo =0;
		
		for(int i=1; i<=10; i++)
		{
			int count = 0;
			
			for(int j=1; j<=i; j++)
			{
				int rem = i%j;
				if(rem==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				countprimeNo++;
			}
			
		}
		System.out.println(countprimeNo);

	}

}
