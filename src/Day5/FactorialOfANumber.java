package Day5;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int num=5;
		int product = 1;
		for(int i=num;i>1;i--)
		{
			product=product*i;
		}
		System.out.println(product);

	}

}
