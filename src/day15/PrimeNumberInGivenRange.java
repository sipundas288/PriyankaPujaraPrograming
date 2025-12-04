package day15;

public class PrimeNumberInGivenRange {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++) {
			int count=0;
			
			for(int j=1;j<=i;j++) {
				
				int rem=i%j;
				
				
				if( rem==0) {
					count++;
					
				}
				
				
			}
			if(count==2) {
				System.out.println(i+"prime no");
			}
					
		}

	}
}

