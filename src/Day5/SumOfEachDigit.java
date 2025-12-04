package Day5;

public class SumOfEachDigit {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		
		while(num!=0)
		{
			int last_digit=num%10;
			sum=sum+last_digit;
			num=num/10;
		}
		System.out.println(sum);

	}

}
