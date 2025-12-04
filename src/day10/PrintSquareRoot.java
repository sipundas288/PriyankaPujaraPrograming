package day10;

public class PrintSquareRoot {

	public static void main(String[] args) {
		
		
		int  num=16;
		
		boolean flag=false;
		
		for(int i=1; i<=num/2; i++)
		{
			if(num==i*i)
			{
				System.out.println(i+"the square root of the number"+num);
			}
		}
		if(flag==flag)
		{
			System.out.println("no square root");
		}

	}

}
