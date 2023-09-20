package chethan;

public class npower {
public static void main(String[]args) {
	int num=3;
	int p=3;
	int mul=1;
	while(p>0) {
		mul=mul*num;
		p--;
	}
	System.out.println(mul);
}
}
