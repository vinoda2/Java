/**
 * 
 */
package com.xworkz.Loops;

/**
 * @author Windows
 *
 */
public class ConditionCheck {

	/**
	 * @param args
	 */
	static int count,count1=0;
	static void evenNumberCheck() {
		int[] array = {12,45,6,78,89,90};
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println("even number:"+array[i]);
				count++;
			}else {
				System.out.println("odd number:"+array[i]);
				count1++;
			}
		}
		System.out.println("even number count:"+count);
		System.out.println("odd number count:"+count1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionCheck.evenNumberCheck();
	}

}
