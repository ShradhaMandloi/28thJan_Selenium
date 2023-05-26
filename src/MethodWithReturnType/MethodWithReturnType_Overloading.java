package MethodWithReturnType;

public class MethodWithReturnType_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s=	convertintouppercase("shradha");
	System.out.println(s);
		MethodWithReturnType_Overloading m=new MethodWithReturnType_Overloading();
	int num1=	m.sub(10, 5);
		System.out.println(num1);
	int num2=	m.add(10, 5);
		System.err.println(num2);
	}
	public static String convertintouppercase(String name) {
		String s1=name.toUpperCase();
		return s1;
	}
	
	public int sub(int e, int f) {
		int g=e-f;
		return g;
	}
	public int add(int h, int i) {
		int j=h+i;
		return j;
	}

}

