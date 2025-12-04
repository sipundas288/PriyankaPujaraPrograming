package day14;

public class P22D {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i-j<n && j+i<=3*n-3)
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
