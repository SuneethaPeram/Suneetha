package Collection1;

public class Bank {
//String accNo;
String accName;
int bal;
public Bank( String accName, int bal) {
	super();
	//this.accNo = accNo;
	this.accName = accName;
	this.bal = bal;
}
@Override
public String toString() {
	return "Bank [accName=" + accName + ", bal=" + bal + "]";
}

}
