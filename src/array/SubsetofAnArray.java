package array;

public class SubsetofAnArray {

	public static void main(String[] args) {
		
		int a[]= {10,20};
		int b[]= {10,23,30,40};
		
		int count=0;
		for(int i=0; i<a.length;i++) {
			
			boolean flag=false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				count=1;
				break;
			}
		}
		if(count!=1) {
			System.out.println("a is not subset of b");
		}
		else {
		System.out.println("a is a subset of b");
		}
			

	}

}
