package chethan;

public class stringupper {
public static void main(String[]args) {
	String s="program";
	char ch[]=s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		if(ch[i]>='A'&& ch[i]<'Z') {
			ch[i]=(char)(ch[i]);
		}
	}
	for(int i=0; i<ch.length; i++) {
		System.out.println(ch[i]);
	}
}
}
