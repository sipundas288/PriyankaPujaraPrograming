package array;

public class CopyingArrayElement {

	public static void main(String[] args) {
		
		int a[]= {10,20,34};
		int[] b= new int[a.length];
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];	
		}
		System.out.println("=====a elements=======");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("==========");
		System.out.println("=============b elements");
		for(int i=0;i< b.length;i++) {
		System.out.println(b[i]);	
		}
	}

}
