package day12;

public class P4 {

	public static void main(String[] args) {
			
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n;j++)
			{
				if(j==3 &&i==1)
				{
				System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}

}
