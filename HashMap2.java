package Collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
public static void main(String[] args) {
	Bank b1=new Bank("sunitha",20000);
	Bank b2=new Bank("priya",40000);
	Bank b3=new Bank("vikranth",30000);
	Bank b4=new Bank("ravi",50000);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter account number");
	int n1=sc.nextInt();
	HashMap<Integer,Object> h1=new HashMap<>();
	h1.put(1,b1);
	h1.put(2,b2);
	h1.put(3,b3);
	h1.put(4,b4);
	for(Map.Entry<Integer,Object> m:h1.entrySet()) {
	System.out.println(n1+" "+h1.get(n1) );
	break;	
	}
}
}
