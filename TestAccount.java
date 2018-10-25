package Assessment;

import java.util.Scanner;

public class TestAccount {
public static void main(String[] args) {
	Saving s1=new Saving(2345,"sunitha","20000",4);
	Current c1=new Current(4567,"swathi","23000",5);
	/*
	s1.setAccNo(1234);
	s1.setAccName("sunitha");
	s1.setAccBal("30000");

*/	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter accno,accname,balance,rateofinterest");
	int a1=sc.nextInt();
	String a2=sc.next();
	String b1=sc.next();
	int r1=sc.nextInt();
	System.out.println("the Account number is "+a1);
	System.out.println("the Account name is "+a2);
	System.out.println("the saving balance "+b1);
	System.out.println("the rate of interest "+r1);
	
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rate of interest");
	int r1=sc.nextInt();
	System.out.println("the rate of interest "+r1);
	System.out.println("the Account number is "+s1.getAccNo());
	System.out.println("the Account name is "+s1.getAccName());
	System.out.println("the saving balance "+s1.getAccBal());
	
	
*/}
}
