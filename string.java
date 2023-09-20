package chethan;

public class string {
public static void main(String[]args) {
	String a="java is a programming";
	int count=0;
	char ch[]=a.toCharArray();
	for(int i=0; i<ch.length; i++) {
		if(ch[i]>'A'&& ch[i]<'Z'||ch[i]>'a'&& ch[i]<'z'|| ch[i]>'0'&& ch[i]<'9' ||ch[i]!=' ' && ch[i]!=',' ) {
			count++;
		}
	}
	System.out.println(count);
}
}
