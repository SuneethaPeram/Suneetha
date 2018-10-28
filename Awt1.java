package Awt1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*
;public class Awt1  extends Frame implements ActionListener{
	Label l1,l2,l3;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3,b4;
	Awt1(){
		l1=new Label("enter a no");
		l2=new Label("enter a no");
		l3=new Label("print result");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		//t4=new TextField(20);
		
		b1=new Button("add");
		b2=new Button("sub");
		b3=new Button("mul");	
		b4=new Button("div");
		setLayout(new FlowLayout());
		add(l1);add(l2);add(l3);add(t1);add(t2);add(t3);add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);//self referential pointer points to itself
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	

 public static void main(String[] args) {
	Awt1  a1=new Awt1();
a1.setVisible(true);
a1.setSize(600,400);
a1.setTitle("My first calculator1");
}
 @Override
	public void actionPerformed(ActionEvent au) {
		if(au.getSource()==b1) {
			int a=Integer.parseInt(t1.getText());
			int a1=Integer.parseInt(t2.getText());
			int c=a+a1;
			t3.setText(String.valueOf(c));
					
		}
		if(au.getSource()==b2) {
			int a=Integer.parseInt(t1.getText());
			int a1=Integer.parseInt(t2.getText());
			int c=a-a1;
			t3.setText(String.valueOf(c));
					
		}
		if(au.getSource()==b3) {
			int a=Integer.parseInt(t1.getText());
			int a1=Integer.parseInt(t2.getText());
			int c=a*a1;
			t3.setText(String.valueOf(c));
					
		}
		if(au.getSource()==b4) {
			int a=Integer.parseInt(t1.getText());
			int a1=Integer.parseInt(t2.getText());
			int c=a/a1;
			t3.setText(String.valueOf(c));
					
		}		
 }
}
