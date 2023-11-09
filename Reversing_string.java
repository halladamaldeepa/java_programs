package myFAQ;

import java.util.Scanner;

public class Reversing_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		String reverse=null;
		int len=str.length();
		for (int i=len-1;i>0;i--)
		{
			reverse=reverse+charAt(i);
			
		}
		System.out.println("Reverse String is: "+reverse);

	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
