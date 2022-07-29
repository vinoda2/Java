package com.xworkz.Variables;

public class VariableTypeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		VariableTypes variable=new VariableTypes();
		variable.id=12;
		variable.name="KTM_Bike";
		VariableTypes.brand="KTM";
		
		//local variable
		String branch="Bangalore";
		System.out.println("branch name:"+branch);
		
		//accessing instance variables and methods
		System.out.println(variable.id);
		System.out.println(variable.name);
		variable.instanceMethod();
		
		//accessing Static variable and methods by using class name
		System.out.println(VariableTypes.brand);
		VariableTypes.staticMethod();
		
		//accessing static variable by using object reference, But it is not standard format
		//System.out.println(variable.brand);
		//variable.staticMethod();
	}

}
