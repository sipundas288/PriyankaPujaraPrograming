package Day5;

public class SumOf10EvenNumberBetweenTheRange {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=1; i<100;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				count++;
				
				if(count==10)
				{
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
