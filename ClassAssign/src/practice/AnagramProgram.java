package practice;

import java.util.*;
//anagram, string  program  

//listen and silent
//earth and heart
//top and pot 
public class AnagramProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the String  :");
		String str1=sc.nextLine().toLowerCase();
		System.out.print("enter the String 2  :" );
		String str2=sc.nextLine().toLowerCase();
	
		boolean flag=true;
		if (str1.length()==str2.length()) {
			char[] ch=str1.toCharArray();
			char[] ch1=str2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			System.out.println(ch);
			System.out.println(ch1);
			
			
			for (int i = 0; i < ch1.length&&i<ch.length; i++) {
				if (ch[i]!=ch1[i]) {
					flag=false;
					break;
				}
			}
			if (flag==true) {
				System.out.println(str1+" and "+str2+" is a anagram string");
			}
			else {
				System.out.println(str1+" and "+str2+" is not  anagram string ");
			}
		} else {
			System.out.println(str2+"  and  "+str1+" is not a anagram string");
		}
	}
}
