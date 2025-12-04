package day10;

public class NeonNumberOrNot {

	public static void main(String[] args) {
		
		int num=11,sum=0;
		
		int square=num*num;
		
		while(square!=0)
		{
			int ld = square%10;
			sum = sum+ld;
			
			square=square/10;
			
		}
		if(sum==square)
		{
			System.out.println(num+"is a neon number");
		}
		else
		{
			System.out.println(num+"is not a neon number");
		}
	}

}
