package coreJava;

public class march extends Thread {
	march(){
		System.out.println("Ugly mother fucker");
		getup();
	}
	march(int a,int b){
		System.out.println(a+b);
	}
	march(int a,int b,int c){
		System.out.println(a+b+c);
	}
	march(String a,String b,String c){
		System.out.println(a+b+c);
	}
	void getup(){
		System.out.println("Juicy Pussy");
	}
	public static void main(String[] args) {
		Thread t1,t2,t3,t4,t5,t6,t7,t8;
		t1=new Thread(new march(12,13),"WOlf1");
        t2=new Thread(new march(15,13,14),"WOlf2");
		t3=new Thread(new march(16,13),"WOlf1");
		t4=new Thread(new march(17,13,14),"WOlf2");
		t5=new Thread(new march(18,13),"WOlf1");
		t6=new Thread(new march("Wolf","Fun","Midst"),"WOlf2");
		t7=new Thread(new march(14,13,14),"WOlf2");
		t8=new Thread(new march());
		
		System.out.println(t1.getName());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		System.out.println(t7.getStackTrace());
		System.out.println(Thread.currentThread());
	}
}
