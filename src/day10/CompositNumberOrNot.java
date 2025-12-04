package day10;

public class CompositNumberOrNot {

	public static void main(String[] args) {
		
		int num=11, count=0;
		
		for(int i=1; i>=num;i++)
		{
			while(num%i==0)
				count++;
				

		}
		if(count>=2)
		{
			System.out.println(num+"is composite number");
		}
		else
		{
			System.out.println(num+"is not a cpmposit number");
		}
	}

}
