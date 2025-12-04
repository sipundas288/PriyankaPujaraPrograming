package day17;

public class P10 {

	public static void main(String[] args) {
		
		int n=3;
		int a=1;
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)
				{
				System.out.print(a);
				a=a+2;
				}
				else {
				//System.out.print(y+" ");
					}
					
			}
			System.out.println();
		}
	}

}
