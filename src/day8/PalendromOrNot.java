package day8;

public class PalendromOrNot {

	public static void main(String[] args) {
		
		
		int num=1221;
		int temp =num;
		
		int rev=0;
		
		while(num!=0)
		{
			int ld = num%10;
			rev = rev*10+ld;
			num=num/10;
			
					
		}
		if(rev==temp)
		{
			System.out.println(temp+"is a palendrom");
		}
		else
		{
			System.out.println(temp+"is not a palendrom");
		}

	}

}
