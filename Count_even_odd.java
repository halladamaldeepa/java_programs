package myFAQ;

public class Count_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234567;
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		System.out.println("no of even: "+even);
		System.out.println("no of even: "+odd);

	}

}
