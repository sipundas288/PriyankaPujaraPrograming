package array;

public class AvgOfEvenValuesOfAnArray {

	public static void main(String[] args) {
	
		int a[]= {1,2,5,8};
		int sum=0;
		int count =0;
		{
			for(int i=0;i<a.length;i++) {
				if(i%2==0) {
					sum=sum+a[i];
					count++;
				}
			
				
			}
			double avg=(sum/count);
			System.out.println(count);
			System.out.println(sum);
			System.out.println("Avarage of even index value: "+avg);
			
		}

	}

}
