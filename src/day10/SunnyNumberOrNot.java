package day10;

public class SunnyNumberOrNot {

	public static void main(String[] args) {
		
		int num = 4;
		
		int sunny =num+1;
		
		for(int i=1; i<=sunny/2; i++)
		{
			if(sunny==i*i)
			{
				System.out.println(num+"ia asunny number");
			
		}
		
		
		}
		System.out.println(num+"not a sunny number");
	}
	}
