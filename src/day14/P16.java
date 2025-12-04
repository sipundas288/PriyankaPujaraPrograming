package day14;

public class P16 {

	public static void main(String[] args) {

int n=4;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)
				//if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
