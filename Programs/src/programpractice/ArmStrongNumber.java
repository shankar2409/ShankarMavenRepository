package programpractice;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=s.nextInt();
		int copy=num;
		int count=0;
		
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=copy;
		int sum=0;
		while(num!=0)
		{
			int remainder=num%10;
			int product=1;
			for(int i=1;i<=count;i++)
			{
				product*=remainder;
			}
			num/=10;
			sum+=product;
		}
		if (sum==copy) {
			System.out.println(sum+"it is a Strong Number");
		}
		else {
			System.out.println(sum+"it is not a Strong Number");
		}
	}
}
