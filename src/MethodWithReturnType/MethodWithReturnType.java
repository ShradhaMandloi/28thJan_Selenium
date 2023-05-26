package MethodWithReturnType;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way to call 
//		int num1=add(10,20);       
//		System.out.println(num1);
		
		//Second way to call
		System.out.println(add(5,6));
		
		MethodWithReturnType m= new MethodWithReturnType();
		int num2=m.mul(3, 4);
		System.out.println(num2);
		
		System.out.println("------------------------------------------------------------------");	

	String s=MethodWithReturnType_Overloading.convertintouppercase("Shradha");
	System.out.println(s);
	
	MethodWithReturnType_Overloading m2=new MethodWithReturnType_Overloading();
	int num3=m2.sub(10, 5);
	System.out.println(num3);
	}
	public static int add(int a, int b) {      // method with int return type
		
		int c=a+b;
		// System.out.println(c);   //only return the value for this method which have void return type
		return c;
	}
	public int mul(int c, int d) {
		int e=c*d;
		return e;
	}


}
