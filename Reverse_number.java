package myFAQ;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println("befor reversing the number is: "+num);
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("After reversing the number is: "+rev);

	}

}
