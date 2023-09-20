package chethan;

public class stringrevers {
public static void main(String[]args) {
	String s="java";
	String str=" ";
	char ch[]=s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		str=ch[i]+str;	
	}
	System.out.println(str);
}
}
