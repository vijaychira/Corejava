package coreJava;

public class binary {

	public static void main(String[] args) {
		System.out.println("Wolf");

		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		boolean flag=false;
		int element=16;
		int l=0;
		int h=a.length-1;

		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==element) {
				System.out.println("Element is found");
				flag=true;
				break;
			}
			else if(a[m]<element) {
				l=m+1;
			}
			else if(a[m]>element) {
				h=m-1;
			}
		}

		if(flag==false) {
			System.out.println("Element not Found");
		}
	}
}


