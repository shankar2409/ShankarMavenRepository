import java.util.*;
public class BinarySearch  extends Object{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.err.print("enter the array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("values for the array  :"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.print("enter the binary value  :");
		int target=s.nextInt();
		int low=0;
		int high=a.length-1;
		int mid=0;
		boolean flag=false;
		while(low<=high)
		{
			mid=(low+high)/2;
			if (target==a[mid]) {
				flag=true;
				break;
			} else if(target>a[mid]){
				low=mid+1;
			}
			else if(target<a[mid])
			{
				high=mid-1;
			}
		}
		if (flag=true) {
			System.out.println(target+" present in "+mid+" index");
		} else {
			System.out.println(target+"not present in index");
		}

		}		
		
	}

