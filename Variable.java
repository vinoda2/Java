package com.xworkz.variable;
/* variable have two types 
 * 1.Instance variables
 * 2.Static variables
 * we can directly declare within the class
 */
public class Variable {
	int a=12;//primitive variable
	static int b=23;//static primitive variable
	String str="hello";//reference variable
	static String str1="Java";//static reference variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v=new Variable();
		System.out.println("Reference variable:"+v.str);
		System.out.println("static Reference variable:"+str1);
		System.out.println("primitive variable:"+v.a);
		System.out.println("static primitive variable:"+b);
	}

}
