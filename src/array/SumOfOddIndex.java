package array;

public class SumOfOddIndex {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,8,};
		int sum=0;
		{
			for(int i=0;i<a.length;i++) {
				if(i%2!=0) {
					sum=sum+a[i];
				}
				
			}
			
			System.out.println("Sum of odd index value"+sum);
			
		}

	}

}
