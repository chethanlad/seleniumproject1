package chethan;

public class programming {
public static void main(String[]args) {
	int a[]= {10,1,23,4};
	int single=0;
	int doublenumner=0;
	for(int i=0; i<=a.length; i++) {
		if(a[i]>=0 && a[i]<=9) {
			single++;
		}
		else if (a[i]>=10 && a[i]<=99) {
			doublenumner++; 
		}
		
	}
	System.out.println(single);
	System.out.println(doublenumner);
}
}
