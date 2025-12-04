package Day6;

public class ProductOfEachDigitInAGivenNum {

	public static void main(String[] args) {
		
		int num = 12345;
		int product =1;
		
		while(num!=0)
		{
			int ld=num%10;
			product= product*ld;
			num=num/10;
			
		}
		System.out.println(product);
		
	}

}
