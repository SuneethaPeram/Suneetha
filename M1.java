package pack;
import java.util.Scanner;
public class M1 {
	int sum,avg;
public	void display() {
Scanner sc=new Scanner(System.in);
System.out.println("enter Roolno");
int rollNo=sc.nextInt();
Scanner sc1=new Scanner(System.in);
System.out.println("enter name");
String name=sc1.next();
Scanner sc2=new Scanner(System.in);
System.out.println("enter marks in s1");
int s1=sc2.nextInt();
Scanner sc3=new Scanner(System.in);
System.out.println("enter marks in s1");
int s2=sc3.nextInt();
Scanner sc4=new Scanner(System.in);
System.out.println("enter marks in s1");
int s3=sc4.nextInt();
sum=s1+s2+s3;
avg=sum/3;
System.out.println("the sum is"+sum);
System.out.println("the avg is"+avg);
}
public static void main(String[] args) {
M1 m=new M1();
m.display();

}
	
}
