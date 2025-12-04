package Day6;

public class SmallestDigitInANumber {

	public static void main(String[] args) {
		int num =1234;
		int min = num%10;
		num = num/10;
		
		while(num!=0)
		{
			int ld = num%10;
			if(ld<min);
			{
				min =ld;
				
			}
			num= num/10;
		}
		System.out.println(min);

	}

}
