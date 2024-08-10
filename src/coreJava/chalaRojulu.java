package coreJava;

import java.util.Arrays;

public class chalaRojulu {
	private String[] names,goals;
	void setname(String[] names) {
		this.names=names;
	}
	void setgoals(String [] goals) {
		
	}
	String[] getname() {
		return names;
	}
	String[] getgoals() {
		return goals;
	}

	public static void main(String[] args) {
		chalaRojulu c=new chalaRojulu();
		String s[]= {"Wolf","Dog"};
		c.setname(s);
		System.out.println(c.getname().toString());
	}

}
