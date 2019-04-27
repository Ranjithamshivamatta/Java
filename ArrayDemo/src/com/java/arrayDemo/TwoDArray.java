package com.java.arrayDemo;
class A{
	public void add(int a){
		System.out.println("In A"+ a);
	}
}
class B extends A{
	B(){
		System.out.println("in cons");
	}
	public void add(int a){
		super.add(a);
		System.out.println("In B"+a);
	}
	public void add(int a, int b){
		System.out.println("In  Overload B"+(a+b));
	}
}
 
interface AB{
	public void kk();
}

class AA implements AB{
	public void kk(){}
}


public class TwoDArray {

	public static void main(String[] args)  {
		B b = new B();
		b.add(10);
		b.add(10, 20);
		                  
    
	
	}

}