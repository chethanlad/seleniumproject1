package chethan;

public class perfectnumber {
	public static void main(String[]args) {
		int num=26;
		int sum=0;
		int i=1;
		while(i<=num/2) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
			}
		if(sum==num) {
			System.out.println("the is perfetnumber");
		}
		else {
			System.out.println("the number is not a perfectnumber");
		}
	}

}
