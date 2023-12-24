package programpractice;

import java.util.Scanner;

public class factorialNumber {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the value");
//		int num=sc.nextInt();
//		 int fact=1;
//		 for(int i=num; i>=1;i--)
//		 {
//			fact*=i ;
//		 }
//		 System.err.println("it is factorial"+fact);
		
		//wjap whether the given number is strong number or not 
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter  the number  :");
		int num=s.nextInt(), temp=num;
		int sum=0;
		while (num!=0) {
			int product=1;
			int d=num%10;
			for(int i=d;i>=1;i--)
			{
				product*=i;
				
			}
			sum+=product;
			num/=10;
		}
		if (sum==temp) {
			System.out.println(sum+"it is a Strong Number");
		} else {
			System.out.println(sum+"it is not a Strong Number");
		}
	}
}
