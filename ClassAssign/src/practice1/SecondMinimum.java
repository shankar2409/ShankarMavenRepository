package practice1;

import java.util.Arrays;
import java.util.Scanner;

//
//public class sonethinf {
//	public static void main(String[] args) {
//		int num=2025;
//		int temp=num;
//		int count=0;
//		while (num!=0) {
//			count++;
//			num/=10;
//		}
//		int divider=1;
//		for(int i=1;i<=count/2;i++)
//		{
//			 divider *= 10;
//		}
//		System.out.println(divider);
//		num=temp;
//		int result=0;
//			int remainder=num%divider;
//			int quotient=num/divider;
//			int sum=remainder+quotient;//45
//			System.out.println(sum);
//			result=sum*sum;
//		if (num==result) {
//			System.out.println(result+"is a tech number");
//		} else {
//			System.out.println(result+"is not a tech number");
//		}
//	}
//}


//public class Automorphic{
//	public static void main(String[] args) {
//		int num=26;
//		int temp=num;
//		int num1=num*num;
//		
//		for(int i=0;num!=0;i++)
//		{
//			if (!(num%10==num1%10)) {
//				break;
//			}
//			num/=10;
//			num1/=10;
//		}
//		if (num==0) {
//			System.out.println(temp+"is a automorphic number");
//		}
//		else {
//			System.out.println(temp+"is not a automorphic number");
//		}
//	}
//	
//}

//
//public class neonNumber{
//	public static void main(String[] args) {
//		int num=18;
//		int temp=num;
//		int sq=num*num;
//		int sum=0;
//		
//		while (num!=0) {
//			int d=num%10;
//			sum+=d;
//			num/=10;
//		}
//		if (sum==temp) {
//			System.out.println(temp+"is a neon number");
//		} else {
//			System.out.println(temp+"is not a neon number");
//		}
//	}
//}

//public class binarySearch{
//	public static void main(String[] args) {
//		int[] a= {10,20,40,11,44,22,03};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the target value");
//		int target=s.nextInt();
//		int low=0,high=a.length-1,mid=0;
//		boolean flag=true;
//		while(low<=high)
//		{
//			mid=(low+high)/2;
//					if(target==a[mid]) {
//						flag=true;
//						break;
//					}
//					else if(target<a[mid])
//					{
//						high=mid-1;
//					}
//					else if(target>a[mid])
//					{
//						low=mid+1;
//					}
//		}
//		if(flag==true)
//		{
//			System.out.println(target +"is present in the "+mid+"index");
//		}
//		else {
//			System.out.println(target+"not present in the "+mid+"index");
//		}
//		
//		int max=a[0];
//		int secondMax=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				secondMax=max;
//				max=a[i];
//			}
//			else if(a[i]>secondMax&&a[i]!=max)
//			{
//				secondMax=a[i];
//			}
//		}
//		
//		System.out.println(secondMax);
		
//	}
//}

public class SecondMinimum{
	public static void main(String[] args) {
		int[] a= {123,20,32,1431,23,54,232,21,4,45,3532,-231,5512};
		System.out.println(Arrays.toString(a));
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		int min=max;
		int secondmin=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]<min) {
				secondmin=min;
				min=a[i];
			} else if(secondmin>a[i]&&a[i]!=min) {
				secondmin=a[i];
			}
		}
		System.out.println(secondmin);
		
	}
}

