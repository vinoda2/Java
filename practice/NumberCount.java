package com.xworkz.practice;

public class NumberCount {

	public int numberCount(int num) {
		int count=0;
		while(num!=0) {
		 	num=num/10;
		 	count++;	
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCount name = new NumberCount();
		int count=name.numberCount(25678);
		System.out.println("digits present in the nummber:"+count);
	}

}
