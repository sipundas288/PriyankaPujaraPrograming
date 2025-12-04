package day9;

public class PerfectSquarOrNot {

	public static void main(String[] args) {
	
		int num=25;
		
		for(int i=1; i*i<=num; i++)
		{
			if(i*i==num)
			{
				System.out.println(num+"is a perfect squar");
			}
		}
		System.out.println("end");

	}

}
