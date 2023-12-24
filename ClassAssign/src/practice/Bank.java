package practice;

import java.util.Scanner;

public class Bank {
	Scanner s=new Scanner(System.in);
	{
		System.out.println("enter the account number  :  ");
	}
	long accountNum =s.nextLong();
	String accountHolderName=s.nextLine();
	 private double amountBal=s.nextDouble();
	static String ifscCode="SBIN0019";
	public static void details(long accountNum,String accountHolderName)
	{
		System.out.println("accout holder name  :"+accountHolderName);
		System.out.println("account number  :"+accountNum);
	}
	public double getAmountBal()
	{
		return amountBal;
	}
	public  void setAmountBal(double amountBal)
	{
		this.amountBal=amountBal;
	}
	
	public void details(double amountBal)
	{
		System.out.println(accountNum);
		System.out.println("before withdraw amountt:  "+getAmountBal());
		setAmountBal(amountBal);
		System.out.println("after withdraw amount  :"+getAmountBal());
		
	}
}
