package Assessment;

import java.util.Scanner;

public class TextBook {
	public static void main(String[] args) {
		Computer c1=new Computer();
		c1.setBookNo(23);
		c1.setTitle("Mathematics");
		c1.setAuthor("sunitha");
		c1.setPublication("bsl");
		c1.setPrice(23445.89);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject");
		String s1=sc.next();
		System.out.println("subject name "+s1);
		System.out.println("the book name "+c1.getBookNo());
		System.out.println("name of the book "+c1.getTitle());
		System.out.println("name of publication "+c1.getPublication());
		System.out.println("price of the book "+c1.getPrice());
	/*Mathematics m1=new Mathematics(0, s1, s1, s1, 0, s1);
			m1.setBookNo(23);
	m1.setTitle("dbms");
	m1.setAuthor("priya");
	m1.setPublication("sbl");
	m1.setPrice(234);
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter subject");
	//String s2=sc.next();
	//System.out.println("subject name "+s1);
	System.out.println("the book name "+m1.getBookNo());
	System.out.println("name of the book "+m1.getTitle());
	System.out.println("name of publication "+m1.getPublication());
	System.out.println("price of the book "+m1.getPrice());

	
	
*/	}

}
