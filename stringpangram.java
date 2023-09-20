package chethan;

public class stringpangram {
public static void main(String[]args) {
	String s="abcdefghijklmnopqrstuvwxy";
	boolean res=ispangram(s);
	System.out.println(res);
}

private static boolean ispangram(String s) {
	int count[]=new int[26];
	for(int i=0; i<s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='A'&& ch<='Z') {
			count[ch-65]++;
		}
		if(ch>='a'&& ch<='z'){
				count[ch-97]++;
		}
	}
		for(int i=0; i<count.length; i++) {
			if(count[i]==0) {
				return false;
			}
		}
	return true;
}
}
