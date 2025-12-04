package array;

public class AvarageOfArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,8,};
		int sum=0;
		{
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
				
			}
			double avg =(sum/a.length);
			System.out.println("Avarage of an array : "+avg);
			
		}
	

	}

}
