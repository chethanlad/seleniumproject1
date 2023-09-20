package chethan;

import java.util.Scanner;

public class arrayadd1 {
public static void main(String[]args) {
	int []x=toread();
	display(x);
	
	int []y=toread();
	display(y);
	
	int res[]=merge(x,y);
	display(res);
}

private static int[] merge(int[] x, int[] y) {
	int[]c=new int[x.length+y.length];
	for(int i=0; i<x.length; i++) {
		c[i]=x[i];
	}
	for(int i=0; i<y.length; i++) {
		c[i+x.length]=y[i];
	}
	return c;
}

private static void display(int[] a) {
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	
}

private static int[] toread() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int size=sc.nextInt();
int []a=new int[size];
System.out.println("enter"+size+"element");
for(int i=0; i<size; i++) {
	a[i]=sc.nextInt();
}
	return a;
}

}
