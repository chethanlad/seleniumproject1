package chethan;

public class nenonumber {
public static void main(String[]args) {
	int num=9;
	int mul=num*num;
	int sum=0;
	while(mul>0) {
		int rem=mul%10;
		sum=sum+rem;
		mul=mul/10;
	}
	if(num==sum) {
		System.out.println("the number is neno");
	}
	else {
		System.out.println("the number is not a neno");
	}
}
}
