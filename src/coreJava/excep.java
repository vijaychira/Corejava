package coreJava;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class excep {
	public static void main(String[] args) throws Exception {
		File file=new File("./cat.txt");
		file.createNewFile();
		FileOutputStream fos=new FileOutputStream(file);
		FileWriter fw=new FileWriter(file);

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the text");
		String s=sc.nextLine();
		fw.write(s);
		fw.flush();
//		for(char ch:s.toCharArray()) {
//			bos.write(ch);
//	}
//        fw.write(s);
		
		
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		String text =new String();
		String line=new String();
		while((line=br.readLine())!=null) {
			text+=line +"\n";
		}System.out.println(text);
		
		
//		fos.close();
//		fw.flush();
//		sc.close();
		br.close();
	    fis.close();
	    fw.close();
	}
	}
