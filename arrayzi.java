package chethan;

import java.util.Arrays;

public class arrayzi {

	public static void main(String[]args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		int i=0; int j=0;
		int c[]=new int[a.length+b.length];
	
while(i<a.length && i<b.length) {
	c[j]=a[i];
	j++;
	c[j]=b[i];
	i++;
	j++;
	
}
while(i<a.length) {
	c[j]=a[i];
	i++;
	j++;
}
while(i<b.length) {
	c[j]=b[i];
	i++;
	j++;
}
System.out.println(Arrays.toString(c));
	}
}
