package chethan;

public class binarysearch {
	public static void main(String[]args) {
		int a[]= {10,20,30,40};
		int low=0;
		int high=a.length-1;
		int ele=50;
		while(high>=low) {
			int mid=low+high/2;
			if(ele==a[mid]) {
				System.out.println("element is present");
			break;
			}
			else {if(ele>a[mid]) {
				low=mid+1;
				
			}
			else { if(ele<a[mid]) {
					high=mid-1;
				
				}
			}
		}
	}
		System.out.println("element is not present");

}
}

