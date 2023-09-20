package chethan;
import java.util.Scanner;
public class palandrom {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int num=scan.nextInt();
		int rev=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			}
		if(temp==rev) {
			System.out.println("number is palandrom");
			}
			else{
				System.out.println("number is not palandrom")	;
			}
			scan.close();
		}
	}
