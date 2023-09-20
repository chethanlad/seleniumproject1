package chethan;

public class spynumber {
public static void main(String[]args) {
	int num=123;
	int sum=0;
	int mul=1;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem;
		mul=mul*rem;
		num=num/10;
		}
	if(sum==mul) {
		System.out.println("the given number is spy");
	}
	else {
		System.out.println("the given number is not a spy");
	}
}
}
