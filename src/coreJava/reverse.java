package coreJava;

public class reverse {

	public static void main(String[] args) {
		
		String name="Preethi";
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='e')
			name.toUpperCase().charAt(i);
			System.out.print(name.charAt(i));
		}
	}
}
