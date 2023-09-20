package chethan;

public class strong {
	public static void main(String[]args) {
		int num=145;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int rem=num%10;
			int fact=1;
			while(rem>1) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
			}
		if(temp==sum) {
			System.out.println("the number is strong");}
		 else {
			System.out.println("the number is not  strong");
		}
}
}
