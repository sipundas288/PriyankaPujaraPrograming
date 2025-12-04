package array;

public class Paliendrome {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		int m=a.length-1;
		int count =0;
		
		for(int i=0; i<a.length/2;i++) {
			if(a[i]==a[m]) {
				m--;
				
			}
			else {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("array is palindrom");
		}
		else {
			System.out.println("array is not palindrome");
		}
	}

}
