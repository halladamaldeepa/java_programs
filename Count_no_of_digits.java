package myFAQ;

public class Count_no_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total No of digits :"+count);

	}

}
