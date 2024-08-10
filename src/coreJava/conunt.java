package coreJava;

public class conunt {

	public static void main(String[] args) {
		String s="The best of both worlds";
		int length=s.length();
		int spaces=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				spaces++;
			}	
		}
		System.out.println("no of charactrers with spaces are "+length); 
		System.out.println("no of charactrers without spaces are "+(length-spaces)); 
	
	}
}
